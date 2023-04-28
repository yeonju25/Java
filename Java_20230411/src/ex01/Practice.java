package ex01;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//교재 165p 예제 4-20
		// i와 j를 1부터 5까지 1씩 증가시키면서 i와 j의 값 쌍으로 출력
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++)
//				System.out.printf("[%d, %d]",i ,j);
//			System.out.println();
//		}
		
		System.out.println("-------------------------------");

		//교재 170p 예제 4-25
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요.(예:12345)>");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine(); 
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			// num을 10으로 나눈 나머지를 sum에 더함
//			sum += num%10;		// sum = sum + num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num /= 10;		// num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
//		}
//		System.out.println("각 자리수의 합:" + sum);
		
		System.out.println("-------------------------------");
		
		// 교재 176p 예제 4-31
//		for(int i=1; i<=10; i++) {
//			if(i%3 == 0) 
//				continue;
//			System.out.println(i);
//		}

		System.out.println("-------------------------------");
		
		// 교재 176p 예제 4-32
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 아메리카노");
			System.out.println("(2) 바닐라라떼");
			System.out.println("(3) 그린티라떼");
			System.out.print("원하는 메뉴를 선택하세요. (종료:0) > ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
//			menu = sc.nextInt();
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1<=menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
				
		}
		
		
		
	}

}
