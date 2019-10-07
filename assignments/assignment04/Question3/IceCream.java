public class IceCream extends DessertItem{
	protected double iceCreamCost;
	protected String iceCreamName;

	double getCost() {
		return this.iceCreamCost;
	}
		
	IceCream(String name, double cost){
		this.iceCreamName = name;
		this.iceCreamCost = cost;
	
	}

	public String toString() {
		String result = "";
		result += shop.printHelper(this.iceCreamName, this.getCost());
		return result;
	}
}
