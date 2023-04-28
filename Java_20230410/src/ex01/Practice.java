package ex01;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
		//1~10 합 누적
//		int sum = 0;
//		for(int i=1; i<=10; i++)
//			sum = sum +i;
//		System.out.println("1~10 합 : " + sum);
		
		//1~100 2와 3의 공배수 출력.
//		for(int i=1; i<=100; i++) {
//			if(i%2 == 0 && i%3 == 0)				
//				System.out.print(i+",");
//		}
		
		// 1~100 홀수의 개수?
//		int count = 0;
//		for(int i=1; i<=100; i++)
//			if(i%2 == 1)
//				count++;
//		System.out.println(count);

		/* 사용자로부터 두개의 정수(시작, 끝)를 입력받아
		 * 시작(포함)해서 끝(포함)까지의 합을 출력
		 */
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int sum = 0;
//		for(int i = num1; i<=num2; i++)
//			sum += i;
//		System.out.println("합계 : " + sum);
		
		// 3이상 4462 이하에서 짝수인 정수의 합
//		int sum = 0;
//		for(int i=3; i<=4462; i++)
//			if(i%2 == 0)
//				sum = sum + i;
//		System.out.println("짝수의 합 : " + sum);
				
		// 1~100까지 합
//		int sum = 0;
//		for(int i=1; i<=100; i++)
//			sum += i;
//		System.out.println("1~100까지의 합 : " + sum);
		
		/* 
		 * 1 + (-2) + 3 + (-4) + ... 이런식으로 더해나갈 때,
		 * 몇까지 더해야 총합이 100이상 될까? i값과 총합을 출력
		 */
//		int sum = 0;
//		int i;
//		for(i=1; ; i++) {
//			if (i%2 == 1)
//				sum = sum+i;
//			else
//				sum = sum-i;
//			if (sum>=100) break;
//		}
//		System.out.println("i :" + i + ", sum : " + sum);
		
		//for문은 무한 반복...처리해준다. 입금, 출금, 잔고 프로그램
		
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		for(; true; ) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			int number = sc.nextInt();
			
			switch(number) {
			case 1:
				System.out.print("예금액 > ");
				int plus = sc.nextInt();
				money = money + plus;
				break;
				
			case 2:
				System.out.print("출금액 > ");
				int minus = sc.nextInt();
				if(money>minus)
				money = money - minus;
				else 
					System.out.println("잔액부족");
				break;
				
			case 3:
				System.out.println("잔고 > " + money);
				break;
			}
				
			if(number == 4) break;
		}
		System.out.println("프로그램 종료");			
				
			
			
			
		
		
		
	}

}
