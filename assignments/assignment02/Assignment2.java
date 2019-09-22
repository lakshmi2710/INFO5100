package Assignment2;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public double salaryGreaterThanFiveThousand(Employee[] employees) {
        // @TODO - Done
    	double sumSalary = 0;
    	for( int i =0; i< employees.length; i++) {
    		if(employees[i].getSalary() > 5000);
    			sumSalary += employees[i].getSalary();
    	}
    	return sumSalary;
    }
    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
        // @TODO
    	if(employee.getId() % 5==0 && employee.getId() % 3==0){
    			System.out.println("FizzBuzz");
    	} else if(employee.getId() % 5==0) {
    		System.out.println("Buzz");
    	} else if (employee.getId() % 3==0){
    		System.out.println("Fizz");
    	}
    	
    }
    	
    
    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public double calculateTax(Employee employee) {
        // @TODO
    	double tax = 0;
    	if(employee.getSalary()<=2500){
			tax = employee.getSalary()*10/100;
    	}else if(employee.getSalary()>2500 && employee.getSalary()<=5000) {
    		tax = employee.getSalary()*25/100;
		}else if (employee.getSalary()>5000) {
			tax = employee.getSalary()*35/100;
		}
    	return tax;
	    }
	    
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
        // @TODO
    	double tempSalary;
    	tempSalary = firstEmployee.getSalary();
    	firstEmployee.setSalary(secondEmployee.getSalary()); 
    	secondEmployee.setSalary(tempSalary); 
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        // @TODO
    	int count=0;
    	for(int i=0; i<employees.length; i++) {
//    		System.out.println(employees[i].getAge());
    		if (employees[i].getAge()>50)
    			count+=1;
    	}
        return count;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
        // @TODO
    	String s = employee.getFirstName();
        char[] charArray = s.toCharArray(); 
        char temp;
        int i = 0;
        while(i < charArray.length/2) {
        	temp = charArray[i];
        	charArray[i]=charArray[charArray.length-i-1];
        	charArray[charArray.length-i-1] = temp;
        	i++; 	
        }
        String reversedEmployes = new String(charArray);
        System.out.println(reversedEmployes);
    	
    }
    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public void isContainDigit(Employee employee) {
        // @TODO - converting array is not needed
    	String s = employee.getFirstName();
    	
        for(int i = 0; i < s.length(); i++)
        {
        	if (Character.isDigit(s.charAt(i))){
        		System.out.println("true");
        		return;
        	}
        	
        }
        System.out.println("false");
    }

     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public void tripleSalary(Employee employee) {
		// @TODO
    	employee.raiseSalary(300);
    }
 
    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        // @TODO
        int i;
        for(i=0; i< employeesStr.length; i++) {
        	String s = employeesStr[i];
        	String emp[] = s.split(",");
        	
        	employees[i] = new Employee(
        			Integer.parseInt(emp[0]),
        			emp[1],
        			Integer.parseInt(emp[2]),
        			Integer.parseInt(emp[3])
        	);
        }
       
        return employees;
    }

}