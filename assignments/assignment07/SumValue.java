package Assignment7;

import java.util.Random;


class sumThread implements Runnable{

	private Thread t;
	private long sum;
	private int start;
	private int end;
	private int[] arr;
	
	sumThread(int start, int end, int[] arr){
		this.start = start;
		this.end = end;
		this.arr = arr;
	}
	
	public long getSum() {
		return(this.sum);
	}
	
	@Override
	public void run() {
		for(int i=this.start; i < this.end; i++)
			sum += this.arr[i];
	}
	
	public void start() {
		t = new Thread(this, "new Thread");
		t.start();
	}
	
	public boolean isAlive() {
		return t.isAlive();
	}
	
}

public class SumValue {
    
	public int[] randArr;
	
    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){
    	Random rd = new Random();
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = rd.nextInt(100);
    	}
    }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr){
    	
    	int numOfThreads = 4;
    	sumThread[] sumThreadArr = new sumThread[numOfThreads];
    	
    	// Creating and start threads
    	for(int i=0; i < 4; i++ ) {
    		sumThreadArr[i] = new sumThread(i, i+(arr.length/numOfThreads), arr);
    		sumThreadArr[i].start();
    	}
    	
    	boolean runFinished = false;
    	// Checking if all work is done by Threads
    	while(!runFinished) {
    		for(int i=0; i<sumThreadArr.length; i++) {
    			if(sumThreadArr[i].isAlive()) {
//    				System.out.println("Waiting for Thread " + i + " to finish");
    				continue;
    			}
    			runFinished = true;
    		}
    	}
    	
    	
    	int sum = 0;
    	for(int i=0; i<sumThreadArr.length; i++)
    		sum += sumThreadArr[i].getSum();
    	
        return sum;
    }

    public static void main(String[] args){
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }

}
