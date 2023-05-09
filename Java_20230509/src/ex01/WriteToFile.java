package ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
//		String path = "c:\\data\\data.dat";		// 위, 아래 똑같이 실행됨, /은 하나 \은 두개 쓰면 됨
		String path = "c:/data/data.dat";  		// 경로설정
		String message = "Hello, Java";
		
		OutputStream out = new FileOutputStream(path);
		byte[] data = message.getBytes();	// 문자열 저장
		out.write(data);
//		out.write('A');		// 한 문자
		System.out.println("파일을 정상적으로 저장했습니다.");
		out.close();
		
	}
}
