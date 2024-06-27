package com.hefshine.qualifierDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Confi.xml");
		Account account=applicationContext.getBean("account",Account.class);
		account.msg();
	}

}
