package com.banking.app.dto;

import com.banking.app.model.Transaction;
import lombok.Data;

import java.util.List;



@Data
public class AccountStatement {
    private int currentBalance;
    private String customerName;
    private List<Transaction> transactions;
    
    
	public AccountStatement() {
		super();
	}


	public AccountStatement(int currentBalance, String customerName, List<Transaction> transactions) {
		super();
		this.currentBalance = currentBalance;
		this.customerName = customerName;
		this.transactions = transactions;
	}


	public int getCurrentBalance() {
		return currentBalance;
	}


	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public List<Transaction> getTransactions() {
		return transactions;
	}


	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
    
    
}
