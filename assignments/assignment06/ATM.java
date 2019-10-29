package Assignment6;

import java.util.ArrayList;

public class ATM {
	private Double availableAmountInMachine;
	private Double transactionFee;
	public ArrayList<User> userData = null;
	
	
	ATM(Double availAmount,Double TransactionFee){
		this.availableAmountInMachine = availAmount;
		this.transactionFee = TransactionFee;
		this.userData = new ArrayList<User>();
	}
		
}
