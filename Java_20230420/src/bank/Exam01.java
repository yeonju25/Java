package bank;
// 교재 327p 오버라이딩
class A{
	int a = 10;
	void func() {
		System.out.println("A - a : " + a);
	}
}

class B extends A{
	int a = 20;
	void func2() {
		System.out.println("B - a : " + a);
	}
	void func() {
		System.out.println("BB - a : " + a);
		System.out.println("BB - a : " + a);
		System.out.println("BB - a : " + a);
	}
	public String toString() {
		return "B클래스의 a값은 " + a + "이다.";
	}
}

public class Exam01 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		b.func();
		b.func2();
		System.out.println("---------------------------------");
		b.func();
		System.out.println(b.toString());
		// toString은 원래 주소값 찍어주는 것, 
		// 근데 내가 다른 기능으로 쓰고싶어서 오버라이딩해준거...?
	}

}
