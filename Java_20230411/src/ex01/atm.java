package ex01;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);		
		int number = sc.nextInt();
		int balance = 0;
		
		for(; number>=1 && number <=4;) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("--------------------------------");
			switch(number) {
			case 1:
				System.out.print("예금액 > ");
				int plus = sc.nextInt();
				break;
			case 2:
				System.out.print("출금액 > ");
				int minus = sc.nextInt();
				break;
			case 3:
				System.out.println("잔고 >" + balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
			}
			
		}
		

	}

}
