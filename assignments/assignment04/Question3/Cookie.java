public class Cookie extends DessertItem {
	private double number;
	private double pricePerDozen;
	
	Cookie(String name, double number, double pricePerDozen){
		this.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}

	public double getCost() {
		double cost;
		
		cost = (this.number * this.pricePerDozen)/12;
		return cost;
	}
	
	public String toString() {
		String result = "";
		result += this.number + " @ " + this.pricePerDozen + " /dz.\n";
		result += shop.printHelper(this.name, this.getCost());
		return result;
	}
}
 