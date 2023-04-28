package ex01;

/* 반환타입 X, 매개변수 O
 * 반환타입 void = 반환값의 타입이 없음
 * Q1. 더하기, 매개변수 있음(2개)
 * Q2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성
 */
public class FunctionExam02 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		// 함수를 어떻게 전달?
		add(10, 20);
		// return이 없어서 add만 쓰면 됨! 타입써주면 오히려 오류남
	
		convertInt(10.2);
		
		
		System.out.println("프로그램 끝");
	}
	// 반환값의 타입 없음
	static void add(int num1, int num2) {
		System.out.println("더하기 : " + (num1 + num2));
	}

	// (반환값의 타입 없음) 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성
	static void convertInt(double F) {
		System.out.println((int)F);
	}
}
