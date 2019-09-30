public class countAndSay {
	
	public String MethodcountAndSay(int n) {
		
		if(n==1)
			return "1";
		if(n==2)
			return "11";
		
		String target = "11";
		String res="";
		
		
		for(int j = 2; j <n; j++) {
			char prev = target.charAt(0);
			int count = 1;
			res ="";
			for(int i = 1; i<target.length();i++) {
				if(target.charAt(i)== prev)
					count= count+1;
				else {
					res = res + Integer.toString(count) + prev;
					count = 1;
					prev = target.charAt(i);
				}		
			}
			res = res + Integer.toString(count) + prev;
			target = res;	
		}
		return res;

	}
	
	public static void main(String[] args) {	
		countAndSay st = new countAndSay();
    	 int n = 6;
    	System.out.println(st.MethodcountAndSay(n));	
    	
    	}

}
