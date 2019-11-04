package Assignment7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReverseSentance {

	public static void main(String[] args) throws Exception {
		String InputFileName = "/Users/lakshmi/eclipse-workspace/Assignment02/src/Assignment7/input.txt";		
		String OutputFileName = "/Users/lakshmi/eclipse-workspace/Assignment02/src/Assignment7/output.txt";
		reverse(InputFileName, OutputFileName);
		
	}
	
	private static void reverse(String InputFileName, String OutputFileName) throws IOException {
		String input = readFromFile(InputFileName).replace(".", "");
		System.out.println(input);
		
		String[] inputSplit = input.split(" ");
				
		String output = "";
		
		for(int i=inputSplit.length-1; i>=0; i--) {
			output = output + inputSplit[i] + " ";
		}
		writeToFile(output, OutputFileName);
		System.out.println(output);
		
		
	}
	
	private static void writeToFile( String output, String fileName) throws IOException {
		File file = new File(fileName);
		FileOutputStream fos = new FileOutputStream(file);
		String data = output;
		fos.write(data.getBytes());
		fos.close();
		
				
	}
	
	private static String readFromFile(String fileName) throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		
		String res = "";
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			char c = (char) x;
			res += c;
//			System.out.print(c);
		}
		fis.close();
		return res;
	}

}
