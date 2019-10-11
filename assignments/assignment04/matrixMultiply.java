public class matrixMultiply {
	
	public int[][] multiply(int[][] A, int[][] B){
		
		int[][] res = new int[A.length][B[0].length];
		
		for(int i=0; i<res.length; i++){
	        for(int j=0; j<res[0].length; j++){
	            int sum=0;
	            for(int k=0; k<A[0].length; k++){
	                sum += A[i][k]*B[k][j];
	            }
	            res[i][j] = sum;
	        }
	    }
		return res;	
	}	

}
