package com.alipay.pojo.account.query;

import java.io.Serializable;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;
import com.quigley.moose.mapping.provider.annotation.XMLFieldStyle;

@XML(name = "param")
public class ParamPartner implements Serializable {

	private static final long serialVersionUID = 8623555087330832950L;

	@XMLField(name = "name", style = XMLFieldStyle.Attribute)
	private String partner;

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	@Override
	public String toString() {
		return "ParamPartner [partner=" + this.partner + "]";
	}

}
