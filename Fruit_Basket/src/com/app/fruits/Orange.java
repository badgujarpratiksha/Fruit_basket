package com.app.fruits;

public class Orange extends Fruit {

	Orange(String name,String color,double weight,boolean fresh)
	{
		super(name,color,weight,fresh);
	}
	public String taste()
	{
	 return "sour";
	}
	public void juice()
	{
		System.out.println("Fruit name: "+name+"\nFruit weight: "+weight+" Extracting juice");
		System.out.println("===============================================================");
	}
	
	
}
