package com.fruitbasket;

public class Mango extends Fruit {

	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		return "sweet";
		 
	}
	
	public void pulp()
	{
		System.out.println("Fruit color"+getName()+"Fruit Color"+getColor()+"Makin pulp");
		
	}

	

}
