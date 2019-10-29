package Assignment6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class User {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private int bankAccountNumber;
	private String password;
	private int balance;
	private ArrayList<String> history;
	
	User(String username, int age, String phoneNum, String address ){
		this.name = username;
		this.age = age;
		this.phoneNumber = phoneNum;
		this.address = address;
		
		setPassword();
		generateBankAccountNum();
		
		history = new ArrayList<String>();
		
		this.balance = 0;
	}
	
	public boolean validateUserDetails(String name, int age, String phoneNum) {
		return (name.equals(this.name) && age == this.age && this.phoneNumber.equals(phoneNum));
	}
	
	public void checkBalance() {
		System.out.println("Current balance : " + balance);
	}
	
	public void depositMoney(int addMoney) {
		this.balance += addMoney;
		this.history.add("Deposit - " + addMoney);
		System.out.println(addMoney + " was successfully deposited to your account!");
	}
	
	public void withdraw(int amount) {
		if(amount > this.balance) {
			System.out.println("You can withdraw more than your balance amount");
			return;
		}
		this.balance -= amount;
		this.history.add("Withdraw - " + amount);
		System.out.println(amount + " was successfully withdrew to your account!");
	}
	
	public void checkRecentTransaction() {
		System.out.println();
		System.out.println("Transaction history (last 10) : ");
		
		int index = this.history.size()-10;
		if(index < 0)
			index = 0;
		for(int i=index; i<this.history.size(); i++)
			System.out.println(this.history.get(i));
	}
	
	private void generateBankAccountNum() {
		Random rand = new Random();
		this.bankAccountNumber = rand.nextInt((99999999-10000000))+10000000;
		System.out.println("Your Bank Account Number : " + this.bankAccountNumber);
	}
	
	public void setPassword() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password : ");
		this.password = input.next();
	}
	
	public String getUserName() {
		return name;
	}
	
	public String getPass() {
		return password;
	}
	
	public int getBankAccNum() {
		return bankAccountNumber;
	}
}