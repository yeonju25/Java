package ex01;

import java.util.Scanner;

public class asdfasd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자의 개수 > ");
		int inputNum = sc.nextInt();
		int sum = 0;	// 입력받은 짝수의 합
		
		for(int i=1; i<=inputNum; i++) {
				/////////////////////////////////
				////////////정수 체크 ////////////
				////////////////////////////////
			Scanner scanner = new Scanner(System.in); 
			String str = scanner.nextLine();
			boolean a_1 = false; // 입력받은 문자열 모두가 숫자면 true, 숫자가 아닌 문자열이 포함되어 있으면 false
			
			for(int j = 0; j<str.length(); j++) {
				char ch = str.charAt(j);
				
				if(ch>='0' && ch<='9') { //아스키코드표
					a_1 = true; 
				}
				else {   // ch에 숫자가 아닌 문자열이 있을 때 false로 입력하고 for문 종료
					a_1 = false;
					break;
				}
			}
			
			
	
				// a_!==true 
			if(a_1) {   ////// 짝수 체크
				int number = Integer.parseInt(str);
				if(number%2 == 0) {
					sum = sum + number;
				} 
			} else { i--;
				
			}
		}	
		System.out.println(sum);
			
			
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
		
			

		
		
		
		
		
	
		// TODO Auto-generated method stub

	}

}
