package ex01;

import java.util.Scanner;

//성적을 입력받아서 학점 구하는 프로그램 작성
//90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F // Exam02는 if였는데 여기선 switch로 만들어보자~

public class Exam09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력");
		int number = sc.nextInt();
		
		
		
		switch (number / 10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				// case 5, 4, 3, 2, 1, 0: 자바 14버전 이상부터는 이렇게 써도 됨!
				System.out.println("F학점");
				break;
			default:
				System.out.println("입력 오류");
		}
		
		
		// 현재 월을 입력하세요. 현재 계절은 ()입니다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재 월을 입력하세요.");
		int month = sc.nextInt();
		
		switch(month) {
			case 12: 
			case 1: 
			case 2:
				System.out.println("현재 계절은 겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9:	
			case 10:
			case 11:
				System.out.println("현재 계절은 가을입니다.");
			
		}
		
		
		
		
	}

}
