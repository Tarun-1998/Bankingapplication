package com.banking.app.request;

import lombok.Data;



@Data
public class AccountStatementRequest {
    private Long accountNumber;

	public AccountStatementRequest(Long accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public AccountStatementRequest() {
		super();
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
    
    

}
