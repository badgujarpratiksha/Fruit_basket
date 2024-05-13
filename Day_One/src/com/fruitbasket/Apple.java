package com.fruitbasket;

public class Apple extends Fruit{

	
	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}

	@Override
	public String taste() {
       return "sweet n sour";
	}
	
	public void jam()
	{
		System.out.println("Name of fruit: "+getName()+"Making Jam");
	}

}
