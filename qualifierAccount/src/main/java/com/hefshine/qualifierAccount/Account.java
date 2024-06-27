package com.hefshine.qualifierAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Account {
	@Autowired
	@Qualifier("saving")
	private AccountType accountType;

	public void info() {
		
		System.out.println("Choose Your Account");
		accountType.type();
		
		
		
	}

}
