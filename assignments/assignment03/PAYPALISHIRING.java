public class PAYPALISHIRING {
	public String convert(String s, int numRows) {
		String[] StringArray = s.split("");
		int k =0;
				
		int len = s.length();
		int n = numRows;
		int m = len;
		String mat[][] = new String[n][m];
		
		if(len == 1 || len ==2 || numRows==1)
			return s;
		
		
		for(int i=0; i<m; i++) {
				if(k > StringArray.length)
					break;
			
				if(i%2==0)
					for(int j =0; j < n && k < len; j++, k++) {
						mat[j][i] = StringArray[k];		
					}
				else
					for(int j = n-2; j > 0 && k < len; j--, k++) {
						mat[j][i] = StringArray[k];		
						
					}
		}
	
		return matToString(mat);
		
	}
	
	public String matToString(String[][] mat) {
		String res = "";
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
//				System.out.println(mat[i][j]);
				if(mat[i][j] != null)
					res += mat[i][j];
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {	
		PAYPALISHIRING st = new PAYPALISHIRING();
		
		String S = "ABC";
		int num = 2;
    	
    	String result = st.convert(S, num);
    	System.out.println(result);
	}
}