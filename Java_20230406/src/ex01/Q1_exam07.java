package ex01;

import java.util.Scanner;

public class Q1_exam07 {
	
	// 성별, 나이 입력 ===> 성별 : 남, 나이 :20 이상이면 입대 / 아니면 미입대

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("나이 입력");
		int age = sc.nextInt();
		
		sc.nextLine(); // 엔터 제거 기능 
		// age nextInt로 숫자만 가져오고 뒤에 엔터는 그대로 남아있는 상태
		// nextLine을 중간에 한 번 사용해서 남아있는 엔터를 쟤로 가져와서 없앤 상황
		// 저걸 하지 않으면 sex nextLine이 남아있는 엔터를 가져와버려서 성별 입력이 안 뜸
		
		System.out.println("성별을 입력하세요.");
		String sex = sc.nextLine();
		
		//int num = Integer.parseInt(sex); 값을 정수로 바꾸기 
		//double d = Double.parseDouble(sex); 값을 실수로 바꾸기
		
		
		if(sex.equals("남") && age >= 20) {
			System.out.println("입대");
		} else {
			System.out.println("미입대");
		}
		
		/*		
	    if(sex=="남" && age >= 20) {
		   System.out.println("입대");
	    } else {
		   System.out.println("미입대");
		}
		// 이렇게 하면 오류남, String은 참조형 변수라 그 값이 저장되어 있는 주소를 비교함
		// 그래서 문자열 "남"과 String 값인 남을 다른 값으로 판단함
		// 문자열이 같은지 비교하려면 equals 쓰면 됨
*/
						
		System.out.println("프로그램 종료");
		
			}
	}