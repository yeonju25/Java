package ex01;

import java.util.Scanner;

/* 사용자로부터 두개의 정수(시작, 끝)를 입력받아
 * 시작(포함)해서 끝(포함)까지의 합을 출력
 */

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("두 개의 정수 입력");
		int start = sc.nextInt();
		int finish = sc.nextInt();
		int sum = 0;

		for (int i = start; i <= finish; i++) {
			sum += i;
		 // sum = sum + i; 로 써도 됨
		}  
		
		/* for문 안에서 선언한 i는 for문을 벗어나면 메모리 삭제됨
		    (중괄호 안에 선언한 함수도 마찬가지)
			i값을 확인하고 싶다면 메인함수로 선언하고 작성
			int i;
			for(i = start; i <= finish; i++)
			sum += 1;
		*/	
		
		System.out.println("합 : " + sum);
		
		
	}

}