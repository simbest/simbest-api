/**
 * 
 */
package com.simbest.api.web.filter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.http.MediaType;

import com.simbest.api.pojo.ApiRequest;
import com.simbest.cores.exceptions.InvalidateSNSUserException;
import com.simbest.cores.utils.Constants;
import com.simbest.cores.utils.json.JacksonUtils;

/**
 * @author Li
 *
 */
public class ApiHttpRequestWrapper extends HttpServletRequestWrapper {

	private final byte[] body;

	private ApiRequest apiRequest;
	
	public ApiHttpRequestWrapper(HttpServletRequest request) throws IOException {
		super(request);
		if (request.getContentType() != null
				&& request.getContentType().contains(
						MediaType.APPLICATION_JSON.toString())) {
			InputStream inputStream = request.getInputStream();
			if (inputStream != null) {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				org.apache.commons.io.IOUtils.copy(inputStream, baos);
				byte[] bytes = baos.toByteArray();
				String theString = new String(bytes, Constants.CHARSET);
				apiRequest = (ApiRequest) JacksonUtils.readValue(theString, ApiRequest.class);
				if(apiRequest != null){
					body = apiRequest.getDataContent().getBytes();
				}else{
					//body = bytes;
					throw new InvalidateSNSUserException("MP100001", String.format("Invalidate user not allowed to access resource!"));
				}
				return;
			}
		}
		//body = null;
		throw new InvalidateSNSUserException("MP100001", String.format("Invalidate user not allowed to access resource!"));
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
		if (body == null) {
			return super.getInputStream();
		}

		ServletInputStream inputStream = new CustomServletInputStream(body);
		return inputStream;
	}

	@Override
	public BufferedReader getReader() throws IOException {
		if (body == null)
			return super.getReader();

		return new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(body), StandardCharsets.UTF_8));
	}

	private static class CustomServletInputStream extends ServletInputStream {

		private ByteArrayInputStream buffer;

		public CustomServletInputStream(byte[] contents) {
			this.buffer = new ByteArrayInputStream(contents);
		}

		@Override
		public int read() throws IOException {
			return buffer.read();
		}

		@Override
		public boolean isFinished() {
			return buffer.available() == 0;
		}

		@Override
		public boolean isReady() {
			return true;
		}

		@Override
		public void setReadListener(ReadListener listener) {
			throw new RuntimeException("Not implemented");
		}
	}

	/**
	 * @return the apiRequest
	 */
	public ApiRequest getApiRequest() {
		return apiRequest;
	}

}
