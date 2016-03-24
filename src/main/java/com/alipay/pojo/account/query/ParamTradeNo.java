package com.alipay.pojo.account.query;

import java.io.Serializable;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;
import com.quigley.moose.mapping.provider.annotation.XMLFieldStyle;

@XML(name = "param")
public class ParamTradeNo implements Serializable {

	private static final long serialVersionUID = 8623555087330832950L;

	@XMLField(name = "name", style = XMLFieldStyle.Attribute)
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Override
	public String toString() {
		return "Param [tradeNo=" + this.tradeNo + "]";
	}

}
