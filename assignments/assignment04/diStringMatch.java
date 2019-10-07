import java.util.Arrays;

public class diStringMatch {
	public int[] diStringMatch(String S) {
		
		int low = 0;
		int high = S.length();
		int[] res = new int[high + 1];
		
		
		for(int i=0 ; i<S.length(); i++) {
			
			if(S.charAt(i)=='I') {
				res[i] = low;
				low = low+1;
				
			}
			else if(S.charAt(i)=='D') {
				res[i] = high;
				high = high - 1;
			}
			System.out.println(res[i]);
				
		}
		res[S.length()]=low;
		System.out.println(res[S.length()]);
		
		return res;
	}
}
