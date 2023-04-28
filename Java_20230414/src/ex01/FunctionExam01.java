package ex01;

/* 
 * 함수
 * void main(){
 * }
 * void : 반환타입, main : 함수명, () : 매개변수 타입
 * {} : 함수가 수행하는 문장
 * 
 *  반환타입 O, 매개변수 O
 * Q1. 더하기 : 반환타입 있음, 매개변수 있음(2개)
 * Q2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성
 */
public class FunctionExam01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num = add(10,20); // Q1-4) return result;를 통해 num에 30 들어감
		
		int number = convertInt(10.2);
		
		System.out.println("프로그램 끝, " + num + ", " + number); // Q1-5) 출력하면 30나옴
	}

	// Q1. 더하기 : 반환타입 있음, 매개변수 있음(2개)
	static int add(int n1, int n2){ //  Q1-1) 위에서 내려온 10, 20값 받음
		System.out.println("add함수 시작");
		int result = n1 + n2; // Q1-2) 10,20 더함 => 30
			return result; 
			// Q1-3) 30은 다시 위로 돌아가(return) add(10,20)은 30으로 변함
		}

	//Q2. (반환타입 있음) 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성 
	static int convertInt(double f) {
		int result = (int)f;
		return result;
	}
	
}


