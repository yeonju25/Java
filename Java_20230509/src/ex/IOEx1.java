package ex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

// 교재 875p 예제 15-1
public class IOEx1 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read())!=-1) {
			output.write(data);
		}
		
		outSrc = output.toByteArray();
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		System.out.println("-------------------------------------------------");
		
		// 교재 876p 예제 15-2
		byte[] inSrc2 = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc2 = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input2 = null;
		ByteArrayOutputStream output2 = null;
		
		input2 = new ByteArrayInputStream(inSrc2);
		output2 = new ByteArrayOutputStream();
		input2.read(temp, 0, temp.length);
		output2.write(temp, 5, 5);
		
		outSrc2 = output2.toByteArray();
		System.out.println("Input2 Source 	: " + Arrays.toString(inSrc2));
		System.out.println("temp            : " + Arrays.toString(temp));
		System.out.println("Output2 Source 	: " + Arrays.toString(outSrc2));
		
		// 교재 877p 예제 15-3
		byte[] inSrc3 = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc3 = null;
		byte[] temp3 = new byte[4];
		
		ByteArrayInputStream input3 = null;
		ByteArrayOutputStream output3 = null;
		
		input3 = new ByteArrayInputStream(inSrc3);
		output3 = new ByteArrayOutputStream();
		
		System.out.println("Input3 Source : " + Arrays.toString(inSrc3));
		
		try {
			while(input3.available() > 0) {
				input3.read(temp3);
				output3.write(temp3);
//				System.out.println("temp : " + Arrays.toString(temp3));
				
				outSrc = output3.toByteArray();
				printArrays(temp, outSrc3);
			}
		}catch(IOException e) {}
			
	}
	
	
	static void printArrays(byte[] temp3, byte[] outSrc3) {
		System.out.println("temp3 : " + Arrays.toString(temp3));			
		System.out.println("Output3 Source : " + Arrays.toString(outSrc3));
		
	}
	

}
