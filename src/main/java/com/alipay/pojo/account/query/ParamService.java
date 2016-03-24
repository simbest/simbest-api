package com.alipay.pojo.account.query;

import java.io.Serializable;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;
import com.quigley.moose.mapping.provider.annotation.XMLFieldStyle;

@XML(name = "param")
public class ParamService implements Serializable {

	private static final long serialVersionUID = 8623555087330832950L;

	@XMLField(name = "name", style = XMLFieldStyle.Attribute)
	private String service;

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "ParamService [service=" + this.service + "]";
	}

}
