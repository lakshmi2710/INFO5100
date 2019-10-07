import java.util.Arrays;

public class DessertShop {
	
	private double taxrate = 6.6;
	private int width = 40;
	private int maxItemSize = 23;
	String storeName = "M & M Dessert Shop";
	
	public double getTaxRate() {
		return this.taxrate;
	}
	
	public int getWidth() {
		return width;
	}
	
	
	public double cents2dollarsAndCentsmethod(double cost) {
		double finalcost;
		finalcost = cost/100;
		return Math.round(finalcost * 100.0)/100.0;	
	}
	
//	private String getNamePrintHelper(String name) {
//		if(name.length() <= maxItemSize)
//			return name;
//		
//		String result = "";
//		int i;
//		for(i = 1; i*20 <= name.length(); i++)
//			result += name.substring((i-1)*20, i*20);
//		System.out.println(name.length()%20);
//		result = name.substring((i-1)*20, name.length()%20);
//		return result;
//	}
	
	public String printHelper(String name, double cost) {
		int nameLen = name.length() > 20 ? 20 : name.length();
		int charLen = nameLen;
		charLen += Double.toString(cost).length();
		
		// number of spaces 
		char[] space = new char[this.width - charLen];
//		System.out.println(name.length()%20);
		Arrays.fill(space, ' ');
		
		String result = "";
		result += name.substring(0, nameLen);
		result += new String(space);
		result += cents2dollarsAndCentsmethod(cost);
		
		return result;
	}
	
	public String toString() {
		return "\tM & M Dessert Shop\n" + 
				"\t--------------------";
	}
}
