package ex01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {
//		String path = "c:/data/data.dat";
		
		// 'A' 읽어오기
//		InputStream input = new FileInputStream(path);
//		int data = input.read();
//		input.close();
//		System.out.println(data);
//		System.out.printf("%d : %c", data, data);	// 아스키코드표
		
		
		// Hello java 읽어오기
//		InputStream input = new FileInputStream(path);
//		byte[] data = new byte[1024];
//		int byteRead = 0;	// 읽어 올 글자 수
//		String str = null;
//		 
//		while((byteRead = input.read(data)) != -1) {
//			str = new String(data,0,byteRead);
//			System.out.println("byte : " + byteRead);
//		}
//		System.out.println(str);
//		input.close();
		
		
		// DataOutStream 읽어오기, 교재 886p
//		DataInputStream in = new DataInputStream(new FileInputStream(path));
//		int num = in.readInt();
//		double f = in.readDouble();
//		System.out.println(num);
//		System.out.println(f);
//		in.close();
		
		String path = "c:/data/number.dat";
		Reader in = new FileReader(path);
		
		
	}

}
