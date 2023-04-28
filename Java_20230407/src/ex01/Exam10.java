package ex01;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {

//// 문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 입력");
//		int num = sc.nextInt();
//		if(num>=50)
//			System.out.println("50 이상의 수입니다.");
//		else 
//			System.out.println("50 이하의 수입니다.");
//
//		
//// 문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 입력");
//		num = sc.nextInt();
//		if(num%3==0)
//			System.out.println("3의 배수");
//		else 
//			System.out.println("3의 배수가 아닙니다.");
		
		
//// 문제3. 1학년부터 4학년까지 중간고사 시험. 4학년은 70점 이상이면 합격, 그 이외 학년은 60점 이상이면 합격.
//		// 이를 판단하는 프로그램 작성, 점수가 0미만 100초과이면 경고문구 출력!
//		Scanner sc = new Scanner(System.in);	// 선생님 식 //
//		System.out.println("학년입력>>");
//		int grade = sc.nextInt();
//		
//		System.out.println("점수입력>>");
//		int score = sc.nextInt();
//		
//		if(grade==4 && score >=70)
//			System.out.println("4학년 합격");
//		else if(grade<4 && score>=60)
//			System.out.println("그 외 학년 합격");
//		else if(score<0 || score>100)
//			System.out.println("경고!");
//		else
//			System.out.println("불합격");
//		
		// 내가 쓴 식
//		Scanner sc = new Scanner(System.in);
//		int score1, score2, score3, score4;
//
//		System.out.println("1학년 점수를 입력하세요.");
//		score1 = sc.nextInt();
//		if (score1 >= 60 && score1 <= 100)
//			System.out.println("합격");
//		else if (score1 < 60 && score1 >= 0)
//			System.out.println("불합격");
//		else
//			System.out.println("입력오류");
//
//		System.out.println("2학년 점수를 입력하세요.");
//		score2 = sc.nextInt();
//		if (score2 >= 60 && score2 <= 100)
//			System.out.println("합격");
//		else if (score2 < 60 && score2 >= 0)
//			System.out.println("불합격");
//		else
//			System.out.println("입력오류");
//
//		System.out.println("3학년 점수를 입력하세요.");
//		score3 = sc.nextInt();
//		if (score3 >= 60 && score3 <= 100)
//			System.out.println("합격");
//		else if (score3 < 60 && score3 >= 0)
//			System.out.println("불합격");
//		else
//			System.out.println("입력오류");
//
//		System.out.println("4학년 점수를 입력하세요.");
//		score4 = sc.nextInt();
//		if (score4 >= 70 && score4 <= 100)
//			System.out.println("합격");
//		else if (score4 < 70 && score4 >= 0)
//			System.out.println("불합격");
//		else
//			System.out.println("입력오류");
//		
//// 문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
//		Scanner sc = new Scanner(System.in);
//		int num1, num2, num3, max, min, total;
//		double average;
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		
//		if(num1>num2 && num1>num3)
//			max = num1;
//		else if(num2>num3)
//			max = num2;
//		else 
//			max = num3;
//		
//		if(num1<num2 && num1 <num3)
//			min = num1;
//		else if(num2<num3)
//			min = num2;
//		else 
//			min = num3;
//		
//		total = num1+num2+num3;
//		average = (double)total/3;
//		
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
//		System.out.println("총점 : " + total);
//		System.out.printf("평균 : %.2f", average);
//		
//		
//// 문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int num = sc.nextInt();
//		 
//		if(num>0)
//			System.out.println("양수입니다.");
//		else if(num<0)
//			System.out.println("음수입니다.");
//		else 
//			System.out.println("0입니다.");
//
//		
////// 문제6. 첫 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성 / 이거는 안배워서 선생님이 보여주심
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("문자열입력>>");
//		String str = sc.nextLine();
//		
//		System.out.println("입력한 문자열 : " + str);
//		
//		char ch = str.charAt(0);
//		System.out.println("첫 번째 문자 : " + ch);
//		
//		if('a' <= ch && ch <= 'z')  // 아스키코드표 기준
//			System.out.println("소문자입니다.");
//		else if('A' <= ch && ch <= 'Z')
//			System.out.println("대문자입니다.");
//		else 
//			System.out.println("알파벳이 아닙니다.");
//		
//		
////문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성 
	//	( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 나머지는 F)		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 3개를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int total = num1 + num2 + num3;
		double average = total/3.0;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", average);
		
		switch((int)average/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default :
			System.out.println("F학점");
		}
		
		
		
	}

}
