package com.hefshine.withoutXml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value("${Car.model}")
	private String model;
	
	
	
	public void message()
	{
		System.out.println("Model name is: "+model);
		
	}
}
