package ex05;

class Member{
	
	// 교재 283p 오버로딩
	// 1. 함수이름 같음, 2. 매개변수 타입이 달라야 한다.
	int func(int n) {
		System.out.println("int");
		return n;
	}
	double func(double d) {
		System.out.println("double");
		return d;
	}
	String func(String str) {
		System.out.println("String");
		return str;
	}
	
	int func(int n1, int n2) {
		System.out.println("int int");
		return n1+n2;
	}
}
public class Exam01 {

	public static void main(String[] args) {
		Member m = new Member();
		
		// m.func() 괄호 안에 넣는 타입에 따라 알아서 값 불러옴
		System.out.println(m.func(10)); // 정수 10이므로 int func 불러옴

		System.out.println(m.func(10,2)); // 정수, 정수

	}

}
