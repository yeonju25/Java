package ex01;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		double average;
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();

		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		average = total/3.0;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", average);
		
		// Exam01 혼자 다시 해본 것
		//sysout.println 개행 후 출력 / sysout.print 바로 출력
		
	}

}
