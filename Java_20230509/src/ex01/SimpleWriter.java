package ex01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class SimpleWriter {
	
	public static void main(String[] args) throws IOException {
		String path = "c:/data/number.txt";
		
//		Writer writer = new FileWriter(path);
//		writer.write(path, 3, 4);
//		writer.close();
		
		Reader read = new FileReader(path);
		int ch;	
		while(true) {
			ch = read.read();
			if(ch == -1) break;
			System.out.println((char)ch);
		}
		
	}
}
