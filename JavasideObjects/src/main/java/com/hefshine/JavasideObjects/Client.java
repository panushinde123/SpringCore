package com.hefshine.JavasideObjects;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args)
	{
		
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("Configuration.xml");
		Car car=applicationcontext.getBean("car",Car.class);
		car.message();
	}

}
