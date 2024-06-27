package com.hefshine.autoWireType;

public class Employee {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	Employee()
	{
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("Id: "+id+" Name: "+name);
	}

}
