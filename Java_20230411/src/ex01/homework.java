package ex01;

import java.util.Scanner;

/*
1.몇 개의 숫자를 받을지 물어보는 코드를 작성하고,
2.숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성하라.
3.소수점이나 문자를 받으면 다시 쓰라고 해야 하며 일을 끝내야 함.
정수만 5회 입력
90,80,88,66,55 ==> 90+80+66 합을 구해서 출력
90, 66.7(X), 50, 55, aa(X), 80, 45 ==> 90+50+80 합을 구해서 출력
*/
public class homework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자의 개수 > ");
		int inputNum = sc.nextInt();
		int sum = 0;
		
//		for(int i=1; i<=inputNum; i++) {
			
			String str = sc.nextLine();
			for(int i = 0; i<str.length(); i++) {
				char ch = str.charAt(i);
				System.out.print(ch+" ");
				
				if(ch>='0' && ch<='9') {
					System.out.println("숫자");
				}
				else {
					System.out.println("숫자가 아닙니다.");
					
					
				}
			}
				
			
			
			
			
////			String str = sc.nextLine();
////			int number = Integer.parseInt(str);
//			int number = sc.nextInt();
//			if(number%1 != 0) {
//				continue;
//			}else if(number%2 == 0)
//				sum += sum + number;
//			
//			if(number >= 0 && number%2 == 0) {
//				sum += sum + number;
//			}else if()
//		}
//		System.out.println(sum);
		
			

		
		
		
		
		
	}

}
