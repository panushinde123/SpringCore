package com.hefshine.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
	
	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("Configure.xml");
	Student student=applicationContext.getBean("student",Student.class);
	student.display();
	applicationContext.close();

}
}
