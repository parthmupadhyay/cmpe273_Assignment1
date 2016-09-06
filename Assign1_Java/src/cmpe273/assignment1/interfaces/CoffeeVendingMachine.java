package cmpe273.assignment1.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CoffeeVendingMachine implements VendingMachine 
{
	private double insertedMoney,change,totalCost;
	
	private List<String> selectedProducts,availableProducts;
	
	CoffeeVendingMachine()
	{
		insertedMoney=0.0;
		change=0.0;
		totalCost=0.0;
		selectedProducts= new ArrayList<String>();
		availableProducts= Coffee.coffeeProducts();
	}

	public double getInsertedMoney() {
		return insertedMoney;
	}

	public List<String> getProducts()
	{
		return availableProducts;
	}
	
	@Override
	public void insertMoney(double money) 
	{
		this.insertedMoney+=money;
		
	}

	@Override
	public void selectItem(String item) 
	{
		if(availableProducts.contains(item))
			selectedProducts.add(item);
		else
			System.out.println("Please select item from mentioned products ");
	}

	@Override
	public double getPriceForSelectedItem(String item) 
	{
		return Coffee.valueOf(item).price;
	}

	@Override
	public void collectItem() 
	{
		if(isPaymentDone())
		{
			System.out.println("Delivered following Products:");
			System.out.println(selectedProducts.toString());
			this.clear();
			
		}
	}

	public List<String> getSelectedItems()
	{
		return this.selectedProducts;
	}
	
	private boolean isPaymentDone()
	{
		if(insertedMoney!=0.0 && (insertedMoney>totalCost))
		{
			return true;
		}
		return false;
	}
	
	public double getTotalCost()
	{
		totalCost=0;
		for(String product:this.selectedProducts)
		{
			totalCost=totalCost+ Coffee.valueOf(product).price;
		}
		return totalCost-insertedMoney;
	}
	
	@Override
	public void clear() 
	{
		insertedMoney=0.0;
		change=0.0;
		totalCost=0.0;
		selectedProducts.clear();
	}

	@Override
	public void checkout() 
	{	
		if(this.insertedMoney>this.totalCost)
		{
			this.change=this.insertedMoney-this.totalCost;
			System.out.println("Purchase successfull \n Please take change:"+this.change);
		}
		else if(this.insertedMoney==this.totalCost)
		{
			System.out.println("Purchase Successful");
		}
		else
		{
			System.out.println("Amount insufficient, please complete checkout with required amount");
		}
	}

}
