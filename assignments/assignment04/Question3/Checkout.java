import java.util.Enumeration;
import java.util.Vector;

public class Checkout {
	private Vector<DessertItem> itemList = new Vector<DessertItem>();
	
	public void enterItem(DessertItem item) {
		itemList.addElement(item);
	}
	
	public int numberOfItems() {
		return itemList.size();
	}
	
	public double totalCost() {
		int totalCost = 0;
		
		for(int i=0; i<itemList.size(); i++)
			totalCost += itemList.get(i).getCost();
		
		return totalCost;
	}
	
	public double totalTax() {
		int totalTax = 0;
		
		for(int i=0; i<itemList.size(); i++)
			totalTax += itemList.get(i).getTax();
		
		return totalTax;
	}
	
	public void clear() {
		itemList.clear();
	}
	
	public String toString() {
		System.out.println(itemList.get(0).shop);
		for(int i=0; i<itemList.size(); i++)
			System.out.println(itemList.get(i));
		
		System.out.println("");
		System.out.println(itemList.get(0).shop.printHelper("Tax", this.totalTax()));
		System.out.println(itemList.get(0).shop.printHelper("Total Cost", this.totalCost()));
		return "";
	}
}
