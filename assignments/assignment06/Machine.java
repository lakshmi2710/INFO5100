package Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class Machine {
	
	ATM atm = null;
	User currentUser = null;
	Scanner input = new Scanner(System.in);
	
	Machine(){
		atm = new ATM(1000.0, 1.0);
	}
	
	// Current user or new user, and 
	// perform login
	public boolean login() {
		System.out.println();
		System.out.print("Login current user (C) or Register new user (N) : ");
		String login_or_register = this.input.next();

		if( login_or_register.equals("N") || login_or_register.equals("n") )
			register();
		else
			return login_page();
		
		return login();
	}
	
	protected boolean login_page() {
		System.out.println();
		System.out.println("Login Page : ");
		System.out.print("Enter you bank account number : ");
		int givenBankNumber = this.input.nextInt();
		
		for(int i=0; i < 3; i++) {
			System.out.print("Enter your password : ");
			String givenPassword = this.input.next();
			User user = validate(givenBankNumber, givenPassword);
			if(user == null)
				continue;
			this.currentUser = user;
			System.out.println();
			System.out.println("Welcome " + user.getUserName() + "!");
			return true;
		}
		
		forgot_password(givenBankNumber);
		return login_page();
	}
	
	protected User validate(int bankAccNum, String password) {
		
		for(int i=0; i<this.atm.userData.size(); i++) {
			User user = this.atm.userData.get(i);
			if(bankAccNum == user.getBankAccNum()) {
				if(password.equals(user.getPass()))
					return user;
				break;
			}
		}
		System.out.println("Wrong Bank Account Number or Password! Try again...");
		System.out.println();
		return null;
	}
	
	// Register a new user
	public void register() {
		System.out.println();
		System.out.println("Registration Page : ");
		System.out.println();
		
		System.out.print("Enter Name : ");
		String name = this.input.next();
		System.out.print("Enter Age : ");
		int age = this.input.nextInt();
		System.out.print("Enter Phone number : ");
		String phoneNum = this.input.next();
		System.out.print("Enter Address : ");
		String address = this.input.next();
		
		User currentUser = new User(name, age, phoneNum, address);
				
		this.atm.userData.add(currentUser);
	}
	
	// Reset the user password, this is called when 
	// user types wrong password for 3 continous times
	protected void forgot_password(int bankAccNum) {
		System.out.println("Forgot Login Page : ");
		
		System.out.print("Enter Name : ");
		String name = input.next();
		System.out.print("Enter Age : ");
		int age = this.input.nextInt();
		System.out.print("Enter Phone number : ");
		String phoneNum = this.input.next();
		
		for(int i=0; i<this.atm.userData.size(); i++) {
			User user = this.atm.userData.get(i);
			if(bankAccNum == user.getBankAccNum()) {
				if(user.validateUserDetails(name, age, phoneNum))
					user.setPassword();
				System.out.println("Sorry user entered details are wrong!");
				break;
			}
		}
	}
	
	// Options from 1 to 5
	// availableBalance, withDrawal, deposit, recentTransactions, changePassword and exit.
	protected void menu_options() {
		System.out.println();
		System.out.println("Menu options : ");
		
		System.out.println("1. Check available balance.");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Check recent transaction");
		System.out.println("5. Change password");
		System.out.println("6. Exit");
		
		System.out.println();
		System.out.println();
		System.out.print("Enter menu option (1-6) : ");
		
		int option = this.input.nextInt();
		
		switch(option) {
			
			case 1: 
				this.currentUser.checkBalance();
				break;
			case 2:
				System.out.print("Enter the amount to deposit : ");
				this.currentUser.depositMoney(this.input.nextInt());
				break;
			case 3:
				System.out.print("Enter the amount to withdraw : ");
				this.currentUser.withdraw(this.input.nextInt());
				break;
			case 4:
				this.currentUser.checkRecentTransaction();
				break;
			case 5:
				this.currentUser.setPassword();
				break;
			case 6:
				return;
			default:
				System.out.print("Wrong menu option, try again!");
		}
		
		menu_options();
	}
	
	public static void main(String args[]) {
		Machine machine = new Machine();
		boolean loginSuccess = machine.login();
		
		if(loginSuccess)
			System.out.println("Login attempt was succesful!");
		else
			return;
		
		machine.menu_options();
		
	}
}
