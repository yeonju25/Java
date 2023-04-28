package ex07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:/data/sample.txt"; // 읽어올 파일 경로

		String filePath2 = "C:/data/data.txt"; 

		BufferedReader reader = null;
		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2));
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				
				writer.write(line + "\r\n");
//				writer.write(line + '\n');
//				writer.newLine();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
			// close 해줘야함~ 안해주니까 파일안만들어줌
		
		}
		
	}
}
