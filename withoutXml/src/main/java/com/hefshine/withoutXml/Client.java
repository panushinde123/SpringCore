package com.hefshine.withoutXml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
	public static void main(String[] args)
	{
		ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(CoreConfiguration.class);
		Car car=applicationcontext.getBean("car",Car.class);
		car.message();
	}


}
