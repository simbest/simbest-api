package com.alipay.pojo.account.query;

import java.io.Serializable;

import com.quigley.moose.mapping.provider.annotation.XML;
import com.quigley.moose.mapping.provider.annotation.XMLField;

@XML(name = "AccountQueryAccountLogVO")
public class AccountQueryAccountLogVO implements Serializable {

	private static final long serialVersionUID = 1370376712144525430L;

	@XMLField(name = "balance")
	private String balance; //余额

	@XMLField(name = "bank_account_name")
	private String bankAccountName; //银行账户名字

	@XMLField(name = "bank_account_no")
	private String bankAccountNo; //银行账号

	@XMLField(name = "bank_name")
	private String bankName; //银行名称

	@XMLField(name = "buyer_account")
	private String buyerAccount; //买家支付宝人民币资金账号

	@XMLField(name = "currency")
	private String currency; //currency  156（人民币）  

	@XMLField(name = "deposit_bank_no")
	private String depositBankNo; //充值网银流水号

	@XMLField(name = "goods_title")
	private String goodsTitle;  //商品名称

	@XMLField(name = "income")
	private String income; //收入金额  

	@XMLField(name = "iw_account_log_id")
	private String iwAccountLogId; //账务序列号

	@XMLField(name = "memo")
	private String memo; //备注

	@XMLField(name = "merchant_out_order_no")
	private String merchantOutOrderNo; //商户订单号  

	@XMLField(name = "other_account_email")
	private String otherAccountEmail;  //账务对方邮箱

	@XMLField(name = "other_account_fullname")
	private String otherAccountFullname; //账务对方全称

	@XMLField(name = "other_user_id")
	private String otherUserId;  //账务对方支付宝用户号

	@XMLField(name = "outcome")
	private String outcome; //支出金额

	@XMLField(name = "partner_id")
	private String partnerId; //合作者身份ID

	@XMLField(name = "seller_account")
	private String sellerAccount; //卖家支付宝人民币资金账号

	@XMLField(name = "seller_fullname")
	private String sellerFullname; //卖家姓名

	@XMLField(name = "service_fee")
	private String serviceFee; //交易服务费  在特定的交易中使用，目前主要用于 COD 买家服务费（表示物流商向买家收取的费用，卖家创建交易时设置）等。注意：该参数不表示支付宝收费

	@XMLField(name = "service_fee_ratio")
	private String serviceFeeRatio;  //交易服务费率

	@XMLField(name = "total_fee")
	private String totalFee;  //交易总金额

	@XMLField(name = "trade_no")
	private String tradeNo;  //支付宝交易号

	@XMLField(name = "trade_refund_amount")
	private String tradeRefundAmount; //累积退款金额

	@XMLField(name = "trans_account")
	private String transAccount;  //账务本方支付宝人民币资金账号

	@XMLField(name = "trans_code_msg")
	private String transCodeMsg; //业务类型    转账  收费  充值  提现  退票  在线支付

	@XMLField(name = "trans_date")
	private String transDate; //交易付款时间

	@XMLField(name = "trans_out_order_no")
	private String transOutOrderNo; //订单号  

	@XMLField(name = "sub_trans_code_msg")
	private String subTransCodeMsg; //子业务类型

	@XMLField(name = "sign_product_name")
	private String signProductName; //签约产品

	@XMLField(name = "rate") 
	private String rate; //费率

	public String getBalance() {
		return this.balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBankAccountName() {
		return this.bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBuyerAccount() {
		return this.buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDepositBankNo() {
		return this.depositBankNo;
	}

	public void setDepositBankNo(String depositBankNo) {
		this.depositBankNo = depositBankNo;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getIncome() {
		return this.income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getIwAccountLogId() {
		return this.iwAccountLogId;
	}

	public void setIwAccountLogId(String iwAccountLogId) {
		this.iwAccountLogId = iwAccountLogId;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantOutOrderNo() {
		return this.merchantOutOrderNo;
	}

	public void setMerchantOutOrderNo(String merchantOutOrderNo) {
		this.merchantOutOrderNo = merchantOutOrderNo;
	}

	public String getOtherAccountEmail() {
		return this.otherAccountEmail;
	}

	public void setOtherAccountEmail(String otherAccountEmail) {
		this.otherAccountEmail = otherAccountEmail;
	}

	public String getOtherAccountFullname() {
		return this.otherAccountFullname;
	}

	public void setOtherAccountFullname(String otherAccountFullname) {
		this.otherAccountFullname = otherAccountFullname;
	}

	public String getOtherUserId() {
		return this.otherUserId;
	}

	public void setOtherUserId(String otherUserId) {
		this.otherUserId = otherUserId;
	}

	public String getOutcome() {
		return this.outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSellerAccount() {
		return this.sellerAccount;
	}

	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	public String getSellerFullname() {
		return this.sellerFullname;
	}

	public void setSellerFullname(String sellerFullname) {
		this.sellerFullname = sellerFullname;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getServiceFeeRatio() {
		return this.serviceFeeRatio;
	}

	public void setServiceFeeRatio(String serviceFeeRatio) {
		this.serviceFeeRatio = serviceFeeRatio;
	}

	public String getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeRefundAmount() {
		return this.tradeRefundAmount;
	}

	public void setTradeRefundAmount(String tradeRefundAmount) {
		this.tradeRefundAmount = tradeRefundAmount;
	}

	public String getTransAccount() {
		return this.transAccount;
	}

	public void setTransAccount(String transAccount) {
		this.transAccount = transAccount;
	}

	public String getTransCodeMsg() {
		return this.transCodeMsg;
	}

	public void setTransCodeMsg(String transCodeMsg) {
		this.transCodeMsg = transCodeMsg;
	}

	public String getTransDate() {
		return this.transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTransOutOrderNo() {
		return this.transOutOrderNo;
	}

	public void setTransOutOrderNo(String transOutOrderNo) {
		this.transOutOrderNo = transOutOrderNo;
	}

	public String getSubTransCodeMsg() {
		return this.subTransCodeMsg;
	}

	public void setSubTransCodeMsg(String subTransCodeMsg) {
		this.subTransCodeMsg = subTransCodeMsg;
	}

	public String getSignProductName() {
		return this.signProductName;
	}

	public void setSignProductName(String signProductName) {
		this.signProductName = signProductName;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "AccountQueryAccountLogVO [balance=" + this.balance
				+ ", bankAccountName=" + this.bankAccountName
				+ ", bankAccountNo=" + this.bankAccountNo + ", bankName="
				+ this.bankName + ", buyerAccount=" + this.buyerAccount
				+ ", currency=" + this.currency + ", depositBankNo="
				+ this.depositBankNo + ", goodsTitle=" + this.goodsTitle
				+ ", income=" + this.income + ", iwAccountLogId="
				+ this.iwAccountLogId + ", memo=" + this.memo
				+ ", merchantOutOrderNo=" + this.merchantOutOrderNo
				+ ", otherAccountEmail=" + this.otherAccountEmail
				+ ", otherAccountFullname=" + this.otherAccountFullname
				+ ", otherUserId=" + this.otherUserId + ", outcome="
				+ this.outcome + ", partnerId=" + this.partnerId
				+ ", sellerAccount=" + this.sellerAccount + ", sellerFullname="
				+ this.sellerFullname + ", serviceFee=" + this.serviceFee
				+ ", serviceFeeRatio=" + this.serviceFeeRatio + ", totalFee="
				+ this.totalFee + ", tradeNo=" + this.tradeNo
				+ ", tradeRefundAmount=" + this.tradeRefundAmount
				+ ", transAccount=" + this.transAccount + ", transCodeMsg="
				+ this.transCodeMsg + ", transDate=" + this.transDate
				+ ", transOutOrderNo=" + this.transOutOrderNo
				+ ", subTransCodeMsg=" + this.subTransCodeMsg
				+ ", signProductName=" + this.signProductName + ", rate="
				+ this.rate + "]";
	}

}
