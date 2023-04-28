package ex01;

import java.util.Scanner;

/*
	랜덤함수 1~100사이 숫자를 가지고 있다.
	유저가 컴퓨터 숫자를 맞추는 게임
 */

public class Exam12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;  // 1~100
		int count = 0;		
		int user = 0;
		
//		System.out.print("숫자를 입력하세요. > ");
//		
		//처음에 while로만 만들었다가 continue 넣어서 만드려고 if 더 씀
//		while(com != user) {
//			user = sc.nextInt();
//			count++;			
//		}
//		
//		
//		
//		while(true) {
//			user = sc.nextInt();
//			if(com != user) {
//			count++;
//			continue;			
//			} else if(com == user)
//				System.out.println("정답입니다.");
//				break;
//		}	

		
		// 선생님 식
		while(true) {
			System.out.println("정수 입력 > ");
			user = sc.nextInt();
			count++;
			if(com == user) {
				System.out.println("정답입니다.");
				break;
			}else if(com>user)
				System.out.println("com은 큰 수 입니다.");
			else if(com<user)
				System.out.println("com은 작은 수 입니다.");
		}	
		System.out.println(count+"회 맞춤");
		System.out.println("com : " + com + ", user : " + user);
		
//		System.out.println("com : " +com + " ,user : " + user +", count : " + count);
//		System.out.println("프로그램 종료");
	}

}
