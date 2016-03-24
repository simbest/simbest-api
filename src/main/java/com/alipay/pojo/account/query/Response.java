package com.alipay.pojo.account.query;

import java.io.Serializable;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;

@XML(name = "response")
public class Response implements Serializable {

	private static final long serialVersionUID = 8070157714914614879L;

	@XMLField(name = "account_page_query_result")
	private AccountPageQueryResult accountPageQueryResult;

	public AccountPageQueryResult getAccountPageQueryResult() {
		return this.accountPageQueryResult;
	}

	public void setAccountPageQueryResult(
			AccountPageQueryResult accountPageQueryResult) {
		this.accountPageQueryResult = accountPageQueryResult;
	}

	@Override
	public String toString() {
		return "Response [accountPageQueryResult="
				+ this.accountPageQueryResult + "]";
	}

}
