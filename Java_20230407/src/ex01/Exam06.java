package ex01;

import java.util.Scanner;

// switch / 계절 입력
public class Exam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 입력하세요.");
		String season = sc.nextLine();
		
		switch(season) {
		case "spring" :
			System.out.println("봄이다.");
			break;
		case "summer" :
			System.out.println("여름이다.");
			break;
		case "fall" :
			System.out.println("가을이다.");
			break;
		case "winter" :
			System.out.println("겨울이다.");
			break;
		default :
			System.out.println("아직도...");
		}
				
		System.out.println("프로그램 종료");
		
	}

}
