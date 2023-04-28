package ex06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam01 {
// 교재 436p
	public static void main(String[] args) throws IOException {
		
		String filePath = "C:/data/sample.txt"; // 읽어올 파일 경로
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// 여기서는 자동 close시켜줌, ex05.Exam01과는 다름
		
	}
}
