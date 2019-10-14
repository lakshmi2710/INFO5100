//Create a class called Number. Write a method called
//count() which can calculate quotient of two integers and use try...catch to deal with all possible exception.

public class Number {
	private int num;
	private int dem;
	
	public void count(int denominator, int numerator) {
		try {
			int res = num/dem;
			System.out.println(res);
		}
		catch(ArithmeticException e){
			System.out.println("Arthmatic Exception: Divide by Zero");
		}
	}
	
	//Unit test
	public static void main(String[] args) {	
		int denominator = 0;
		int numerator = 0;
		
		Number num = new Number();
		num.count(denominator, numerator);
		
    	}
}
