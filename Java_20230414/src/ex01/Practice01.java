package ex01;

/* 반환타입 O, 매개변수 X
 * Q1. 더하기
 * Q2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성
 */
public class Practice01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		int num = add(); // 호출함수
		System.out.println(num);
		
		double df = convertInt(); // 호출함수
		System.out.println((int)df);
		
		System.out.println("프로그램 끝");
		// sysout.println(add()); 해도 30 출력됨
	}

	// 더하기 : 반환타입 있음, 매개변수 없음
	static int add() {
		int i = 10+20;
		return i;
	}
	
	// 반환타입 있음, 매개변수 없음 
	// 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
	static double convertInt() {
		return 10.2;
	}
	
	}


