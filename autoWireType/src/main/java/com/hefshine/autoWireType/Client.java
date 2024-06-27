package com.hefshine.autoWireType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Configure.xml");
		Employee employee=applicationContext.getBean("employee",Employee.class);
		employee.run();
	}

}
