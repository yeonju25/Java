package ex07.wildcard;

class A{ }

class B extends A{ }

class C extends B{ }
class D extends B{ }

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

// 와일드카드의 하한 제한
class Unboxer {				
	public static void peekBox(Box<? super B> box) { // B보다 상위인 클래스들은 가능, 하위클래스를 B까지만 하한 제한.
		System.out.println(box.getOb());
	}
}
public class GenericExam01 {

	public static void main(String[] args) {
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		Box<D> dBox = new Box<>();
		Box<Object> iBox = new Box<>();
		
		Unboxer.peekBox(aBox);	
		Unboxer.peekBox(bBox);
		Unboxer.peekBox(iBox);
		
//		Unboxer.peekBox(cBox);	// 하한 제한을 걸어서 C,D는 안됨
//		Unboxer.peekBox(dBox);
	}
}
