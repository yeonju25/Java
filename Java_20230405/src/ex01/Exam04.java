package ex01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

/*		int num = 8;
		int cnt = 3;
		
		System.out.println(num / cnt); // 몫이 2
		System.out.println(num % cnt); // 나머지가 2
*/
		
		// 키보드로 4000을 입력받는다. 4000초
		// 화면 상 출력 1시간 6분 40초 나오도록 만들기
		
	/*	Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
			int num = Integer.parseInt(input); // input의 내용을 int타입의 값(정수)로 변환
			
			
			int hour = num/3600;
			int min = (num%3600)/60;
			int sec = num%60;
		
			System.out.println(hour + "시간 " + min + "분 " + sec + "초");
*/
		
	// 선생님 코드 // 키보드로 4000을 입력받는다. 4000초
		// 화면 상 출력 1시간 6분 40초 나오도록 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 초를 입력 >>");
		int num = sc.nextInt();
		
		int second = num % 60;
		int hour = num / 3600;
		int minute = (num % 3600) / 60;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초 ");
		
			
			
			
	}

}
