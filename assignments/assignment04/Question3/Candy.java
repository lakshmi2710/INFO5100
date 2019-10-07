public class Candy extends DessertItem {
	private double weight;
	private double pricePerPound;
	
	Candy(String name, double weight, double pricePerPound){
		this.name = name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;

	}
	
	public double getCost() {
		double cost;
		cost = this.pricePerPound * this.weight;
		return cost;
	}
		
//	 2.25 lbs. @ 3.99 /lb.
//	 
//	 8.98
	public String toString() {
		String result = "";
		result += this.weight + " lbs. @ " + this.pricePerPound + " /lb.\n";
		result += shop.printHelper(this.name, this.getCost());
		return result;
	}
}