package ex01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 1~100까지 파일에 저장하는 프로그램 구현

public class Exam {
	
	public static void main(String[] args) throws IOException  {
		String path = "c:/data/number.txt";
		
//		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
//		for(int i=0; i<100; i++) {
//			out.writeInt(i);
//		}
//		out.close();
		
		Writer out = new FileWriter(path);
		
		for(int i = 0; i<100; i++) {
			String data = Integer.toString(i);
			out.write(data);
		}
		out.close();
		
		
	}
	
	
}
