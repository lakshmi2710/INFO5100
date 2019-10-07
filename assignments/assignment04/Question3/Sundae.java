public class Sundae extends IceCream{
	private double Sundaecost;
	Sundae(String iceCreamname, double IceCreamcost, String name, double cost) {
		super(iceCreamname, IceCreamcost);
		this.name = name;
		this.Sundaecost = cost;
	}
	
	@Override
	double getCost() {
		return this.Sundaecost + super.iceCreamCost;
	}
	
	public String toString() {
		String result = "";
		result += this.name + " with \n";
		result += shop.printHelper(this.iceCreamName, this.getCost());
		return result;
	}
}
