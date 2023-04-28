package ex01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 >>");
		
		int num = sc.nextInt();
		int result = (num>0) ? num : -num; // -(-50) => 50
		
		System.out.println(result);
		
	}

}
