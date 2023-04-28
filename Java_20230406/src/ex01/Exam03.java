package ex01;

import java.util.Scanner;

public class Exam03 {

	// 나의 이름, 주소, 나이(만)를 입력받아서 출력하는 프로그램 작성(단, 나이는 +1해서 출력)
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		//nextLine, nextInt
		
		int age = sn.nextInt();
		sn.nextLine(); // 입력버퍼 남아있는 엔터를 제거해라.
		// 이유는 엔터를 제거하지 않으면 String name = sn.nextLine();이 받아오는 문장에서 엔터를
		// 문장으로 인색해서 버퍼 남은 엔터를 name 변수에 넣는다.
		String name = sn.nextLine();
		String address = sn.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + (age+1));
		
		// nextInt 다음에 nextLine 입력이 오면 int에서 정수만 가져가고 남은 엔터를 line이 가져와서 입력받지 않고 지나가버림
		// nextInt가 마지막에 오면 상관없으나, 만약 nextLine 앞에 온다면 중간에 sn.nextline(); 한 줄 더 넣어줘야 정상적으로 작동
		// sn.nextLine은 남아있는 엔터를 가져와서 지운다는 느낌으로 이해
	
		
	}

}
