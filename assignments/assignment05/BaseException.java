//Create your own MyIndexOutOfBoundException Class. It should contain these parameters

public class BaseException {
	
	int lowerBond=0;
	int upperBond=9;
	
	public void checkIndex(int range) throws MyIndexOutOfBoundException{  
	     if(range > upperBond || range < lowerBond)  
	      throw new MyIndexOutOfBoundException(lowerBond, upperBond, range);  
	      
	   }  
	
	
	public static void main(String args[]){
		try {
			BaseException BE = new BaseException();
			
			for(int j=1; j<11;j++) {
				BE.checkIndex(j);
			}
		}
		
		catch(MyIndexOutOfBoundException IOB) {
			System.out.print(IOB);
		}
		
	}

}


class MyIndexOutOfBoundException extends RuntimeException {
	int lowerBond;
	int upperBond;
	int index;
	
	
	MyIndexOutOfBoundException(int lowerBond, int upperBond, int index){
		this.lowerBond = lowerBond;
		this.upperBond = upperBond;
		this.index = index;
	}
	
	public String toString(){ 
		return ("Error Message: Index:" + this.index +", but Lower bound: "+ this.lowerBond + ", Upper bound:" + this.upperBond) ;
	}
}