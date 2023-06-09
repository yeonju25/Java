package ex06.wildcard;

class A{ }

class B extends A{ }

class C extends B{ }

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

// 와일드카드의 상한 제한
class Unboxer {				
	public static void peekBox(Box<? extends B> box) { // B를 상속한 클래스만 가능, 상위클래스를 B까지만 상한 제한.
		System.out.println(box.getOb());
	}
}
public class GenericExam01 {

	public static void main(String[] args) {
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		
//		Unboxer.peekBox(aBox);	// peekBox에 B로 상한 제한을 걸어서 A는 안돼~
		Unboxer.peekBox(bBox);
		Unboxer.peekBox(cBox);
	}
}
