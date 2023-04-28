package ex01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 키보드로 국어, 영어, 수학 점수를 입력받아서 총점/평균을 출력하는 프로그램 작성
		
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요.");
		
		int korS = scanner.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("영어점수를 입력하세요.");

		int engS = scanner.nextInt();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("수학점수를 입력하세요.");
		
		int mathS = scanner.nextInt();
		
		int sum = korS + engS + mathS;
		
		System.out.println(sum + "/" + (sum/3));
*/		
		// 스캐너 변수 여러개 만들 필요없이 하나만 해도 여러 값 입력 가능하구나~
		
		// 선생님 코드
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		double average;

		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		
		total = kor+eng+math;
		average = total/3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.printf("평균 : %.2f\n", average);
		
	}

}
