package ex01;

import java.util.Scanner;

// switch / 정수 하나 입력받아서(1~4), 1학년, 2학년, 3학년, 4학년 출력
public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력하세요.");
		int grade = sc.nextInt();
		
		switch(grade) {
			case 1 :
				System.out.println("1학년");
				break;
			case 2 :
				System.out.println("2학년");
				break;
			case 3 :
				System.out.println("3학년");
				break;
			case 4 :
				System.out.println("4학년");
				break;
			default :
				System.out.println("1~4 중에 입력하세요.");
		}
		
		
		System.out.println("프로그램 종료");
		
	}

}
