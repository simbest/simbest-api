package com.alipay.pojo.account.query;

import java.io.Serializable;
import java.util.List;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLList;

@XML(name = "request")
public class Request implements Serializable {

	private static final long serialVersionUID = -8834519983979193783L;

	@XMLList(name = "param")
	private List<Param> paramList;

	public List<Param> getParamList() {
		return this.paramList;
	}

	public void setParamList(List<Param> paramList) {
		this.paramList = paramList;
	}

	@Override
	public String toString() {
		return "Request [paramList=" + this.paramList + "]";
	}

}
