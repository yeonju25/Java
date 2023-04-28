package ex01;

import java.util.Scanner;

 // 세 정수를 입력받아서 최대값과 최소값 구하기 // Exam08이랑 같은 문제
public class Exam10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max, min;
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3)
			max = num1;
		else {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}

		if (num1 < num2 && num1 < num3)
			min = num1;
		else {
			if (num2 < num3)
				min = num2;
			else
				min = num3;
		}
		

		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	
	}

}
