package ex01;

import java.util.Scanner;

public class Exam04 {
	
	// 성적 입력받아서 70 이상 합격했습니다. 메시지 출력

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt();
		
		// 조건문 if
		if(jumsu >= 70)
			System.out.println("당신은 합격했습니다.");
		
		if(jumsu <= 70)
			System.out.println("당신은 불합격했습니다.");
		
		
		System.out.println("프로그램 종료");
		
		//20살 이상이면 성년, 아니면 미성년
		System.out.println("나이를 입력하세요.");

		int age = sc.nextInt();
		
		if(age >= 20)
			System.out.println("성년");
		else
			System.out.println("미성년");

		//이건 그냥 만들어본 것
		String result;
		result = (age>20) ? "성년" : "미성년";
		System.out.println(result);
		
	/*  처음에 만든 코드는 오류남
        int result;	 
        result = (age>20) ? "성년" : "미성년";
        >> 오류난 이유 : result를 int로 만들었는데 넣을 값이
        정수가 아닌 문자열이라 오류 / 문자 넣을 땐 string으로 바꿔주면 해결~
	 */
	
	}

}
