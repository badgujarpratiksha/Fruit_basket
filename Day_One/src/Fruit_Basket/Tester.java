package Fruit_Basket;

import java.util.Scanner;

import com.fruitbasket.Apple;
import com.fruitbasket.Fruit;
import com.fruitbasket.Mango;
import com.fruitbasket.Orange;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Backet");
		int n = sc.nextInt();
		Fruit[] fruit = new Fruit[n];
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("====================Fruit Menu======================");
			System.out.println("1.Add Mango \n2.Add Orange \n3.Add Apple\n4.Name of Fruit\n5.Fresh Fruit Info\n6.Setting Fruit as Stale\n7.Checking Stale fruit\n8.Fruit Specific Functionality\n9.Exit");
			System.out.println("Enter your choice");
			if (counter < n) {
				switch (sc.nextInt()) {
				case 1:
					
					System.out.println("Enter color, weight, name, freshness of Mango");
                    fruit[0]=new Mango(sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean());
                    counter++;
                    System.out.println("======================Mango Added========================");
					break;
				case 2:
					
					System.out.println("Enter color, weight, name, freshness of Orange");
                    fruit[0]=new Orange(sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean());
                    counter++;
                    System.out.println("======================Orange Added========================");
					break;
				case 3:
					
					System.out.println("Enter color, weight, name, freshness of Apple");
                    fruit[0]=new Apple(sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean());
                    counter++;
                    System.out.println("======================Apple Added========================");
					break;
				case 4:
					System.out.println("=====================Name of Fruit======================");
					for(int i=0;i<counter;i++)
					{
					System.out.println("Name of Fruits"+fruit[i].getName());
					}
					break;
				case 5:
					System.out.println("=================Fresh Fruit Info===================");
					for(int i=0;i<counter;i++)
					{
						if(fruit[i].isFresh())
						{
							System.out.println(fruit[i]);
							System.out.println(fruit[i].taste());
						}
					}
					break;
				case 6:
					System.out.println("=====================Setting Fruit as Stale===============");
                    System.out.println("Enter index ");
                    int i=sc.nextInt();
                    if(counter<i)
                    {
                    	fruit[i].setFresh(false);
                    }
                    else
                    {
                    	System.out.println("Wrong index");
                    }
                    break;
				case 7:
					System.out.println("=======================Checking sour fruit=============");
				   for(int i1=0;i1<counter;i1++) 
				   {
					if(fruit[i1].taste().equals("sour"));
					{
						fruit[i1].setFresh(false);
					}
				   }
				   break;
				case 8:
					System.out.println("==================Fruit Specific Functionality===============");
					for(int i3=0;i3<counter;i3++)
					{
						if(fruit[i3] instanceof Mango)
						{
							Mango m=(Mango)fruit[i3];
							m.pulp();
						}
						else if(fruit[i3] instanceof Orange)
						{
							Orange o=(Orange)fruit[i3];
							o.juice();
						}
						else if(fruit[i3] instanceof Apple)
						{
							((Apple)fruit[i3]).jam();
						
						}
					}
					break;
					
				case 9:
					System.out.println("=========================Exiting=====================");
					exit=true;
					break;
                    
				}
			}
		}
	}

}
