package ex01;

import java.util.Scanner;

public class Exam07 {
	
	// 성별, 나이 입력 ===> 성별 : 남, 나이 :20 이상이면 입대 / 아니면 미입대

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("성별을 입력하세요.");
		System.out.println("1-남자");
		System.out.println("2-여자");
		int sex = sc.nextInt();
		
		System.out.println("나이 입력");
		int age = sc.nextInt();
	
		
		if(sex != 1) {
			System.out.println("미입대");
		} if(age<=20) {
			System.out.println("미입대");
		} else {
			System.out.println("입대");
		}
		
	/*	if(sex == 1 && age >= 20) {
			System.out.println("입대");
		} else {
			System.out.println("미입대");
		}
	*/
		
		

		System.out.println("프로그램 종료");
		
			}
	}


