package com.alipay.pojo.account.query;

import java.io.Serializable;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;

@XML(name = "param")
public class Param implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -848567194682696816L;
	@XMLField(name = "name")
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
