package cmpe273.assignment1.interfaces;

import java.util.List;
import java.util.Scanner;

public class CoffeeMain 
{
	CoffeeVendingMachine machine;
	CoffeeMain(CoffeeVendingMachine machine)
	{
		this.machine=machine;
	}
	
	
	public static void main(String[] args) 
	{
		CoffeeVendingMachine machine = new CoffeeVendingMachine();
		List<String> products=machine.getProducts();
		System.out.println("Select Products");
		for(String product:products)
		{
			System.out.println(product);
		}
		System.out.println("Exit");
		boolean flag=true;
		do
		{
			System.out.println("Choose options:\n 1.Select Coffee \n 2.Checkout \n 3.Exit");
			Scanner scanner1 = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			int choice=scanner1.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter Product name");
					String name=scanner2.nextLine();
					if(!products.contains(name.toUpperCase()))
					{
						System.out.println("Please enter valid choice");
						break;
					}
					else
					{
						machine.selectItem(name.toUpperCase());
					}
					break;
						
				}
				case 2:
				{
					System.out.println("Products in cart: \n");
					for(String coffee:machine.getSelectedItems())
					{
						System.out.println(coffee + " : "+ Coffee.valueOf(coffee).price);
					}
					System.out.println("Total Cost:"+machine.getTotalCost());
					System.out.println("Enter money");
					double money=scanner2.nextDouble();
					machine.insertMoney(money);
					machine.checkout();
					machine.collectItem();
					break;
				}
				case 3:
				{
					flag=false;
					System.out.println("Thank you");
					break;
				}
				default :
				{
					System.out.println("Please enter valid choice");
					break;
				}
			}
			scanner1.close();
			scanner2.close();
		}while(flag);
	}

}
