/**
 * 
 */
package com.simbest.api.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Li
 *
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@JsonIgnoreProperties(ignoreUnknown=true)
public class ApiSystemContent {
	private String accesstoken;

	private String timestamp;

	private String md5;
	/**
	 * @return the accesstoken
	 */
	public String getAccesstoken() {
		return accesstoken;
	}

	/**
	 * @param accesstoken the accesstoken to set
	 */
	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the md5
	 */
	public String getMd5() {
		return md5;
	}

	/**
	 * @param md5 the md5 to set
	 */
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	
}
