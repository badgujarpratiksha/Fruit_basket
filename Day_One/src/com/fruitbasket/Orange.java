package com.fruitbasket;

public class Orange extends Fruit {

	
	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}

	@Override
	public String taste() {
		return "sour";
	}
	
	public void juice()
	{
		System.out.println("Name fruit"+getName()+" Fruit weight"+getWeight()+" Extracting juice");
	}

}
