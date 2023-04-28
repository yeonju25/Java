package ex02;

public class AExam {

	public static void main(String[] args) {

		A a = new A();
		System.out.println("----------");
				
		// A클래스 안의 B클래스만 객체를 만들고 싶을때
		A.B b = a.new B();
		b.test();
		b.field = 10;
		
		
	}

}
