public abstract class DessertItem {
	protected String name;
	protected DessertShop shop = new DessertShop();
	
	abstract double getCost();
	
	
	
	public double getTax() {
		double tax = 0;
		tax = (this.getCost()*shop.getTaxRate())/100;
		return tax;
	}
	
}
