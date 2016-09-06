package cmpe273.assignment1.interfaces;


public interface VendingMachine 
{
	
	public void insertMoney(double money);
	public void selectItem(String item);
	public double getPriceForSelectedItem(String item);
	public void collectItem();
	public void clear();
	public void checkout();
}
