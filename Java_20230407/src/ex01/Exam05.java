package ex01;

import java.util.Scanner;

public class Exam05 {

/*
 * 숫자 하나 입력받아서 2의 배수이면서 3의 배수이면
 * 2와 3의 배수입니다 출력
 * 아니면 2와 3의 배수가 아닙니다 출력
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = sc.nextInt();

		if (num % 2 == 0 && num % 3 == 0)
			System.out.println("2와 3의 배수입니다.");
		else
			System.out.println("2와 3의 배수가 아닙니다.");
		
	}

}
