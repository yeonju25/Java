package answer;


public class Main {
	static void test(A test) {
		// funcD, funE 출력 
		
		if(test instanceof D) {
		D d = (D)test;
		d.funcD();
		} else if(test instanceof E) {
		E e = (E)test;
		e.funcE();
		}
		
	}
	
	
	public static void main(String[] args) {
		A a = new D(); // B,C,D,E 가능 
		// A 인터페이스 참조변수 a가 참조할 수 있는 대상은 A 인터페이스를 구현한 클래스
		// A를 구현한 B,C 클래스와 B와 C를 각각 상속한 D와 E가 객체로 올 수 있다.
		// new A();는 안된다. 인터페이스라 객체 생성 안됨
		
		B b = new D(); // B,D 가능 --> 객체 자신과 자신을 상속한 하위클래스
		
		C c = new E(); // C,E 가능
		
		D d = new D(); // D
		D dd = (D)b;
		
		E e = new E(); // E
		E ee = (E)c;
		
		test(new B()); // A를 구현한 B,C 클래스와 B와 C를 각각 상속한 D와 E가 올 수 있다.
		
	}

}
