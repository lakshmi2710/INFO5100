//Create one superclass called Employee and two subclasses – Contractor and FullTime.
//Both subclasses have common properties to share, like the name of the employee and
//the the amount of money the person will be paid per hour. There is one major 
//difference between contractors and full-time employees – the time they work for 
//the company. Full-time employees work constantly 8 hours per day and the working 
//time of contractors may vary.


abstract class Employee {
	private String name;
	private int paymentPerHour;
	
	Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
	
	public abstract int CalculateSalary();
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return this.paymentPerHour;
	}
	
	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	
	
}


class Contractor extends Employee{
	private int workingHour;
	
	Contractor(String name, int paymentPerHour, int workingHour) {
		super(name, paymentPerHour);
		this.workingHour = workingHour;
	}

	@Override
	public int CalculateSalary() {
		int Salary = this.workingHour*super.getPaymentPerHour();
		return Salary;
	}
	
}


class FullTime extends Employee{
	FullTime(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	@Override
	public int CalculateSalary() {
		int Salary = 8*super.getPaymentPerHour();
		return Salary;
	}
	
	
	
}


//Unit testing

public abstract class EmployeeMain {
	
	public static void main(String[] args){
		FullTime FLemp = new FullTime("Lakshmi", 10);
		System.out.println("Fulltime employee salary for 10 days");
		System.out.println(FLemp.CalculateSalary());
		
		System.out.println("Contract employee salary for 10 days");
		
		Contractor contemp = new Contractor("Lakshmi", 10, 10);
		System.out.println(contemp.CalculateSalary());
	}
	
}

