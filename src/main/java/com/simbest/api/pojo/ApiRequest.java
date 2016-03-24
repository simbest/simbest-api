package com.simbest.api.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@JsonIgnoreProperties(ignoreUnknown=true)
public class ApiRequest {
	private ApiSystemContent systemContent;
	private String dataContent;
	
	public ApiRequest() {
		super();
	}

	public ApiRequest(ApiSystemContent systemContent, String dataContent) {
		super();
		this.systemContent = systemContent;
		this.dataContent = dataContent;
	}
	
	/**
	 * @return the systemContent
	 */
	public ApiSystemContent getSystemContent() {
		return systemContent;
	}
	/**
	 * @param systemContent the systemContent to set
	 */
	public void setSystemContent(ApiSystemContent systemContent) {
		this.systemContent = systemContent;
	}
	/**
	 * @return the dataContent
	 */
	public String getDataContent() {
		return dataContent;
	}
	/**
	 * @param dataContent the dataContent to set
	 */
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}
	
	
}
