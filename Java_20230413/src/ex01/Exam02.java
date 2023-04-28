package ex01;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {

		String[] str = new String[3];
		str[0] = "kor";
		str[1] = "eng";
		str[2] = "math";
		
		String[] str2 = new String[] {"kor2","eng2","math"};
					 // new String[] 생략 가능
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
		
		String msg = "korea";
		
		char ch = msg.charAt(0); // 문자열 하나만 꺼내볼 때 쓰는거
		msg.length(); // 문자열도 길이 이렇게 알 수 있음
		
		
		// substring 중요중요 연습많이많이
		System.out.println(msg.length());
		String msg2 = msg.substring(2); //0123... 2의 자리의 문자열부터 뒤로 쭉 적어주란 뜻
		System.out.println(msg2);
		
//							      start, end-1		
//		   							1	   4
		String msg3 = msg.substring(1, 4); // 사이의 문자열 꺼내기
		System.out.println(msg3);
		//int a, int b   a == b(기본자료형비교) : 기본형 외 참조형은 a.equals(b)
		msg.equals(msg3);

		char[] ch2 = msg.toCharArray(); // char 나열할 때 배열을 써야 한다
		System.out.println(Arrays.toString(ch2));
		
		
	}
	

}
