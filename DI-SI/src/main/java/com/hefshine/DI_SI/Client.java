package com.hefshine.DI_SI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("Configuration.xml");
		Employee employee=applicationcontext.getBean("employee",Employee.class);
		System.out.println(employee);
		
		

	}

}
