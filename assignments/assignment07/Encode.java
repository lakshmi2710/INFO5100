package Assignment7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

public class Encode {
	public static void main(String[] args) throws Exception {
		String InputFileName = "/Users/lakshmi/eclipse-workspace/Assignment02/src/Assignment7/encoded.txt";
		String OutputFileName = "/Users/lakshmi/eclipse-workspace/Assignment02/src/Assignment7/decode.txt";
		encode(InputFileName, OutputFileName);
	}
	
	private static void encode(String InputFileName, String OutputFileName) throws IOException {
		String input = readFromFile(InputFileName).replace(".", "");
		Stack<String> stack = new Stack<String>();
		
		System.out.println("Input: " + input);
		
		String tempc;
		String output = "";
		
		String num = "0";
        boolean numFlag = false;
		for(int i=0;i<input.length();i++) {
			String c = Character.toString(input.charAt(i));
			
            if( c.compareTo("]") == 0) {
                String tempString = "";
                while (stack.peek().compareTo("[") != 0)
                    tempString = stack.pop() + tempString;

                stack.pop();

                int value = Integer.parseInt(stack.pop());
                String res = "";
                while (value > 0) {
                    res += tempString;
                    value = value - 1;
                }
                stack.push(res);
            }
            else if(c.compareTo("0") <= 9 && c.compareTo("9") >= -9) {
                num = num + c;
                numFlag = true;
            }
            else if(c.compareTo("[") == 0) {
                if (numFlag) {
                    stack.push(num);
                    num = "";
                    numFlag = false;
                }
                stack.push(c);
            }
            else {
                stack.push(c);
            }
		}
		
        String res = "";
        while (!stack.empty()) {
            res = stack.pop() + res;
        }
        System.out.println("output: " + res);				
		writeToFile(res, OutputFileName);
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

