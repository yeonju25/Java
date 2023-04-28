package ex01;

import java.util.Scanner;

 // 세 정수를 입력받아서 최대값과 최소값 구하기 // 선생님 코드 //
public class Exam08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max, min;
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		// 최대값 구하기
		if (num1 > num2) {
			if (num1 > num3)
				max = num1;
			else
				max = num3;
		} else {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}

		// 최소값 구하기
		if (num1 > num2) {
			if (num2 > num3)
				min = num3;
			else
				min = num2;
		} else {
			if (num1 > num3)
				min = num3;
			else
				min = num1;
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	
	}

}
