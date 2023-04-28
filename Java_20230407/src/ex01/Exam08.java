package ex01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

//		double sample = Math.random();
//		// Math.random : 0~1 사이 난수 발생 (0과 1은 포함 안됨)
//		System.out.println(sample);

		
/*		// 1~10 사이 난수가 발생하게 하고 싶다? ===>	
		int random = (int)(Math.random()*10)+1;
		// *10까지만 하면 0~9 정수 랜덤출력 / +1까지 하면 1~10 정수 랜덤출력
		
		System.out.println(random);
*/
		
		int com = (int)(Math.random()*3)+1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1(가위), 2(바위), 3(보) 중 입력하세요.");
		int user = sc.nextInt();

		switch (user - com) {
		case 0:
			System.out.println("비김");
			break;
		case -2: // 조건의 결과가 -2나 1이면 break하기 전 내용 처리
		case 1:
			System.out.println("User 승");
			break;
		case -1:
		case 2:
			System.out.println("Computer 승");
			break;
		}

		System.out.println("User : " + user + ", Computer : " + com);
		
	 
		
		
		
	}

}
