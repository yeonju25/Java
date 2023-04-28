package ex01;

/* 반환타입 X, 매개변수 X
 * Q1. 더하기
 * Q2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성
 */
public class Practice02 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		add(); // 호출함수
		
	
		System.out.println("프로그램 끝");
		// sysout.println(add()); 해도 30 출력됨
	}

	// 더하기
	static void add() {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
	}
	
	// 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
	static void convertInt() {
	}
	
	}


