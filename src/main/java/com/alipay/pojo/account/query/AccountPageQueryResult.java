package com.alipay.pojo.account.query;

import java.io.Serializable;
import java.util.List;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;
import com.quigley.moose.mapping.provider.annotation.XMLList;

@XML(name = "account_page_query_result")
public class AccountPageQueryResult implements Serializable {

	private static final long serialVersionUID = -5053327361316268453L;

	@XMLList(name = "account_log_list", elementName = "AccountQueryAccountLogVO")
	private List<AccountQueryAccountLogVO> accountQueryAccountLogVOList;

	@XMLField(name = "has_next_page")
	private String hasNextPage;

	@XMLField(name = "page_no")
	private String pageNo;

	@XMLField(name = "page_size")
	private String pageSize;

	public List<AccountQueryAccountLogVO> getAccountQueryAccountLogVOList() {
		return this.accountQueryAccountLogVOList;
	}

	public void setAccountQueryAccountLogVOList(
			List<AccountQueryAccountLogVO> accountQueryAccountLogVOList) {
		this.accountQueryAccountLogVOList = accountQueryAccountLogVOList;
	}

	public String getHasNextPage() {
		return this.hasNextPage;
	}

	public void setHasNextPage(String hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "AccountPageQueryResult [accountQueryAccountLogVOList="
				+ this.accountQueryAccountLogVOList + ", hasNextPage="
				+ this.hasNextPage + ", pageNo=" + this.pageNo + ", pageSize="
				+ this.pageSize + "]";
	}

}
