package ex01;

import java.util.Scanner;

public class Exam09 {

/* for문은 무한 반복...처리해준다. 입금, 출금, 잔고 프로그램 
 * 선생님 식
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		for(; true; ) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택 > ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액> " );
				balance += sc.nextInt();
				break;
			
			case 2:
				System.out.print("출금액> " );
				balance -= sc.nextInt();
//				if(sc.nextInt()<=balance) // if문 안에 바로 스캐너 받을 수 있지만~ 아래에 잔액이랑 계산할 변수가 없넹??
//					balance -= sc.nextInt(); 
//				else
//					System.out.println("잔액부족");
				break;
				
			case 3 :
				System.out.println("잔고> " + balance);
				break;
			}	
			if(num == 4) break;
		}	
		
		System.out.println("프로그램 종료");

	
	
		
	}

}
