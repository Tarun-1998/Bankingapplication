package com.banking.app.request;

import lombok.Data;


@Data
public class FundTransferRequest {
    private Long fromAccount;
    private Long toAccount;
    private int amount;
	public FundTransferRequest(Long fromAccount, Long toAccount, int amount) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}
	public FundTransferRequest() {
		super();
	}
	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Long getToAccount() {
		return toAccount;
	}
	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
    
    
}
