package com.fulcrum.service.impl;

import com.fulcrum.model.Account;

public class AccountServiceImpl {
	
	public void updateAccountBalance(Account  account, Long ammount) {
		
		System.out.println("Account Number : " + account.getAccountNumber() + " . "+ "Amount : " + ammount);
	}
}
