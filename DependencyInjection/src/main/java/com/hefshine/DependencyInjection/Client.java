package com.hefshine.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Configuration.xml");
Student student=applicationContext.getBean("student",Student.class);
student.toString();
student.message();
	}

}
