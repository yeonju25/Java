package ex;

class A {
	A(){
		System.out.println("A");
	}
}

class B extends A {
	B(){
		System.out.println("B");
	}
	
}

class C extends A {
	C(){
		System.out.println("C");
	}
	
}

class D extends B {
	D(){
		System.out.println("D");
	}
	
}

class E extends B {
	E(){
		System.out.println("E");
	}
	
}

class F extends C {
	F(){
		System.out.println("F");
	}
	
}

public class Ex {

	public static void main(String[] args) {

		D d = new D();
		
	}

}
