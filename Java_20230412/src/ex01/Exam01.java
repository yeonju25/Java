package ex01;

import java.util.Scanner;

/*
 * 조원 3명 자바점수 
 * 자바점수 배점은 랜덤함수 이용해서 50~100값이 저장되도록 한다.
 * 조원 총점, 평균을 출력하세요.
 */

public class Exam01 {

	public static void main(String[] args) {

//		int sum = 0;
//		int count = 0;
//		
//		while(count<3) {
//			int score = (int)(Math.random()*100)+1;
//			if(score>=50 && score <=100) {
//				sum += score;
//				count++;
//				System.out.println(score);
//			}
//		}		
//		
//		double average = sum/3;
//		System.out.println("총점 : " + sum);
//		System.out.printf("평균 : %.2f",average);

		
		//선생님 코드
		int yj, ke, hj, sum;
		yj = ke = hj = sum = 0;
		double avg = 0;
		
		//50~100
		yj = (int)(Math.random()*50+1) + 50;
		ke = (int)(Math.random()*50+1) + 50;
		hj = (int)(Math.random()*50+1) + 50;
		
		sum = yj + ke + hj;
		avg = sum/3.0;
		System.out.println("sum = " + sum);
		System.out.println("average = " + avg);
	
	
	}

}
