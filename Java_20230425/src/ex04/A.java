package ex04;

public class A {
	A(){
		class B{
			public B() {
				System.out.println("B 객체생성");
			}
		}
		
		B b = new B();
		System.out.println("A 객체생성");
	}
	
	void method() {
		class C{
			public C() { System.out.println("C 객체생성"); }
		}
		
		C c = new C();
	}
	
}
