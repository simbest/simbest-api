package com.alipay.pojo.account.query;

import java.io.Serializable;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;

@XML(name = "alipay")
public class Alipay implements Serializable {

	private static final long serialVersionUID = -9197114948865783024L;

	@XMLField(name = "is_success")
	private String isSuccess;

	@XMLField(name = "request")
	private Request request;
	
	@XMLField(name = "response")
	private Response response;

	@XMLField(name = "sign")
	private String sign;

	@XMLField(name = "sign_type")
	private String signType;

	@XMLField(name = "error")
	private String error;

	public String getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSignType() {
		return this.signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @return the request
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(Request request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "Alipay [isSuccess=" + this.isSuccess + ", response="
				+ this.response + ", sign=" + this.sign + ", signType="
				+ this.signType + ", error=" + this.error + "]";
	}

}
