package com.hefshine.qualifierDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class Account {

	
	@Autowired
	@Qualifier("perAddress")
    private Address address;
	
	
	public void msg()
	{
		address.getmsg();
	}
}
