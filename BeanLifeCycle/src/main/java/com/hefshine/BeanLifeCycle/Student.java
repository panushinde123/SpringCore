package com.hefshine.BeanLifeCycle;

public class Student {
	
	public void display()
	{
		System.out.println("Custom Method");
	}
    public void init()
    {
	System.out.println("Init Method");
    }
   public void destroy()
   {
	System.out.println("Destroy Method");
    }
}
