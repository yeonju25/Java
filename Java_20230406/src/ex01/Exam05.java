package ex01;

import java.util.Scanner;

public class Exam05 {
	
	// 성적 입력받아서 70 이상 합격했습니다. 메시지 출력

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt();
		
		// 조건문 if-else
		if(jumsu >= 70)
			System.out.println("당신은 합격했습니다.");
		
		else
			System.out.println("당신은 불합격했습니다.");
		
		System.out.println("프로그램 종료");
		
	

	
	}

}
