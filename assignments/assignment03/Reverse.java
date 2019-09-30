public class Reverse {

	public String[] ReverseString(String s) {
		
		String[] StringArray = s.split(" ");
		int j =0;
		
		String[] NewStringArray = new String[StringArray.length];
		
		for(int i=((StringArray.length)-1); i>=0; i--) {
			
			NewStringArray[j] = StringArray[i];
			j = j+1;
			
		}
		return NewStringArray;
		
	}
	
	public static void main(String[] args) {	
		Reverse st = new Reverse();
    	String s = "the sky is blue";
    	String[] NewString = st.ReverseString(s);
    	String result = String.join(" ", NewString);
    	
    	System.out.println(result);	
    	
    	}
	
}