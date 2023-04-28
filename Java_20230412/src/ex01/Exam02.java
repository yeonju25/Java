package ex01;

import java.util.Scanner;

/*
 * 조원 3명 자바점수 
 * 자바점수 배점은 랜덤함수 이용해서 50~100값이 저장되도록 한다.
 * 조원 총점, 평균을 출력하세요.
 */

public class Exam02 {

	public static void main(String[] args) {

		final int MAX = 3;
		int sum = 0;
		double avg = 0;
				
		int[] 조4 = new int[MAX];
		
		for(int i=0; i<MAX; i++) {
			조4[i] = (int)(Math.random()*50+1) + 50;
		}
			
		for(int i=0; i<MAX; i++)
			sum += 조4[i];
		avg = sum/3.0;
		
		for(int i=0; i<MAX; i++)
			System.out.print(조4[i] + ", ");
		
		System.out.println();
		System.out.println("sum = " + sum);
		System.out.println("average = " + avg);
	
	
	}

}
