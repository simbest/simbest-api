package com.simbest.api.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.simbest.api.pojo.ApiRequest;
import com.simbest.api.pojo.ApiSystemContent;
import com.simbest.cores.exceptions.InvalidateSNSUserException;
import com.simbest.cores.shiro.AppUserSession;
import com.simbest.cores.utils.Digests;
import com.simbest.cores.utils.configs.CoreConfig;
import com.simbest.cores.utils.enums.SNSLoginType;
import com.simbest.cores.utils.json.JacksonUtils;
import com.simbest.cores.web.filter.SNSAuthenticationToken;

/**
 * 目的：为前端App提供加密解密的验证功能，以及Seesion有效性判断（失效进行登录）
 * 
 * @author lishuyi
 */
public class ApiAuthorizationFilter extends OncePerRequestFilter {
	public final static Log log = LogFactory.getLog(ApiAuthorizationFilter.class);

	@Autowired
	private CoreConfig config;
	
	@Autowired
	private AppUserSession appUserSession;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		log.debug(request.getRequestURI());
		ApiHttpRequestWrapper wrappedRequest = new ApiHttpRequestWrapper(request);
		ApiRequest apiRequest = wrappedRequest.getApiRequest();
		if(apiRequest != null){
			log.debug("Request parameter accessToken:"+apiRequest.getSystemContent().getAccesstoken());
			log.debug("Request parameter MD5: " +apiRequest.getSystemContent().getMd5());			
			String actualMD5 = Digests.encryptMD5(config.getValue("app.api.key")+apiRequest.getSystemContent().getAccesstoken()+apiRequest.getSystemContent().getTimestamp());		
			log.debug("Actual MD5: " + actualMD5);
			if(actualMD5.equalsIgnoreCase(apiRequest.getSystemContent().getMd5())){
				if(appUserSession.isUserSessionTimeout()){
					SNSAuthenticationToken snsToken = new SNSAuthenticationToken(apiRequest.getSystemContent().getAccesstoken(), SNSLoginType.accesstoken);
					try{
						SecurityUtils.getSubject().login(snsToken);
					}catch(Exception e){
						throw new InvalidateSNSUserException("MP100001", String.format("Invalidate user not allowed to access resource!"));
					}
				}
				filterChain.doFilter(wrappedRequest, response);
				return;
			}
		}
		
		throw new InvalidateSNSUserException("MP100001", String.format("Invalidate user not allowed to access resource!"));

	}

	public static void main(String[] args) {
		System.out.println(Digests.encryptMD5("B03F5F7F11D50A3A"+"a7810924efe0ea1ce279d130eb43fadc"+"1440492159"));
		
		ApiRequest apiRequest = new ApiRequest();
		ApiSystemContent systemContent = new ApiSystemContent();
		systemContent.setTimestamp("1440492159");
		systemContent.setAccesstoken("a7810924efe0ea1ce279d130eb43fadc");
		systemContent.setMd5("bfbf3358962fb2d3cb49778b45227c79");
		apiRequest.setSystemContent(systemContent);
		apiRequest.setDataContent("{\"used\":false}");
		String jsonStr = JacksonUtils.writeValueAsString(apiRequest);
		System.out.println(jsonStr);
		ApiRequest newObj = JacksonUtils.readValue(jsonStr, ApiRequest.class);
		System.out.println(newObj);
	}
}
