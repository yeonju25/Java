package test;

class B implements A{
	@Override
	public void a() {
		System.out.println("인터페이스 A");
	}
	
}

class C implements A{
	@Override
	public void a() {
		System.out.println("C는 A를 상속");
	}
}

class D extends B{
	public void a() {
		System.out.println("D는 B를 상속");
	}
}

class E extends C{
	public void a() {
		System.out.println("E는 C를 상속");
	}
	
}

public class Main {
	public static void main(String[] args) {
	A a = new D();
	a.a();
	A aa = new E();
	aa.a();
	
		
		
		
	}
	
}