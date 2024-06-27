package com.hefshine.qualifierAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args) {
		ApplicationContext applicationcontext =new ClassPathXmlApplicationContext("Configuration.xml");
		Account account=applicationcontext.getBean("account",Account.class);
	     account.info();	
	
	}

}
