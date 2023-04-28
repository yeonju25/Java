package ex02;

public class A {
	// 중첩 클래스
	class B{
		int field = 1;	// 멤버변수, 인스턴스변수
		void test() {}	// 멤버메서드, 인스턴스메서드
		
		// 자바 17버전부터 허용 
		// static int field2 = 1;	// 정적변수, 정적클래스변수
		// static void test() {}	// 정적메서드
		
		B(){
			System.out.println("B 객체생성");
		}
	}
	 class C{
		 C(){
			 System.out.println("C 객체생성");
		 }
	 }
	 
	B field = new B();
	C field2 = new C();
	
	A(){
		B b = new B();
		System.out.println("A 객체생성");
	}
	
	void method() {
		B b = new B();
	}
	
	
}
