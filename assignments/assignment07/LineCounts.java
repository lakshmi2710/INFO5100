package Assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LineCounts {

	public static void main(String[] args) throws Exception {
		
			for(int i = 0; i < args.length; i++) {
				try {
					int nol = getLineCount(args[i]);
					System.out.print(args[i]);
					System.out.print(" : ");
					System.out.println(nol);
				}catch(Exception e) {
					System.err.println("Exception thrown");
				}
					
			}
	}
			
		
	private static int getLineCount(String fileName) throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(input);
		int count=0;
		String line = "";
		while ((line = reader.readLine())!=null) {
			count++;
		}
		return count;

}
}
