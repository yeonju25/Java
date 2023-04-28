package ex01;

import java.util.Scanner;

public class Exam04 {
/*
 * 숫자 하나 입력받아서 짝수인지 홀수인지 출력
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		if (num%2==1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
		if (num % 2 != 0)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
	}

}
