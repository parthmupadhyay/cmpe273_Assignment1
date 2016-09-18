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
		boolean flag=true;
		Scanner scanner1 = new Scanner(System.in);
		do
		{
			System.out.println("Choose options:\n 1.Select Coffee \n 2.Checkout \n 3.Exit");
			int choice=scanner1.nextInt();
			scanner1.nextLine();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter Product name");
					String name=scanner1.nextLine();
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
					double money=scanner1.nextDouble();
					scanner1.nextLine();
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
			
		}while(flag);
		scanner1.close();
	}

}
