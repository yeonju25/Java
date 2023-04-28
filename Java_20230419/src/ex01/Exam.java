package ex01;
// 상속 
class A {
	int a;
	int c = 100;
	A() {
		
	}
	
	A(int a, int c) {
		this.a = a;
		this.c = c;
	}
	
	void func() {
		System.out.println("func()");
	}
}

class B extends A {
	int b;
	int c = 200;
	B(){
		super();
	}
	
	B(int a, int b) {
		super(a,b);
	}
	
	void func2() {
		System.out.println("func2()");
	}
}

class C extends A {
	int k;
	void func3() {
		System.out.println("func3()");
	}
}

// D는 A와 B의 것 모두 가져다 쓸 수 있다.(생성자는 제외)
class D extends B {
	int d;
	D() {
		super();
	}
	
	void func4() {
		System.out.println("func4()");
	}
}
public class Exam {

	public static void main(String[] args) {
		
		B b = new B(1,2);
		b.a = 10;
		b.b = 20;
		b.func();
		b.func2();
		System.out.println(b.c);
		// A와 B 모두에 c가 있지만 b.c를 부르면
		// 일단 B 자기자신 안에 있는 c를 가져옴.
		// 부모 클래스 것보다 자기 클래스 것이 우선
		
		C c = new C();
		
		D d = new D();
		
	}

}
