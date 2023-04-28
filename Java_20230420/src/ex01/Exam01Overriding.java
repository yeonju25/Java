package ex01;

class A{
	void funcA() {
		System.out.println("A func()");
	}
	public String toString() {
		return "A class";
	}
}
class B extends A{
	void funcB() {
		System.out.println("B func2()");
	}
	public String toString() {
		return "B class";
	}
}
public class Exam01Overriding {

	public static void main(String[] args) {
		
		A aa = new B();
		aa.funcA();
		System.out.println(aa.toString()); 
		// 오버라이딩 하기 전 : Object toString() 출력 
		// A만 오버라이딩 : A toString() 출력
	
		A a = new B();
		B b = new B();
//		B b = new A();는 안됨 / 크기가 A로 한정되어 B의 내용을 쓸수 없어서?
		
		Object o = new B();
		System.out.println(o.toString());
	
		// 대전제 : 하위클래스가 상위클래스 참조 불가
		A aaa = new B();
		
	//	B bbb = aaa;는 안되고 타입을 B로 바꿔주면 됨.
		B bbb = (B)aaa;
		
		
	}

}
