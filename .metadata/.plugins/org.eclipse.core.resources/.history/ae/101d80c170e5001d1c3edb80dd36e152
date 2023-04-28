package ex04.Generic;

class A {}
class B extends A {}
class C extends A {}

class Box<T extends A>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer{
	public static <T extends A> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box<C> cBox = new Box<C>();
		Box<B> bBox = new Box<B>();
		Box<A> aBox = new Box<A>();
		
//		Box<A> aaBox = new Box<B>();	// 에러. 상속받았으니 될거같아 보이지? 근데 여기서는 타입도 같아야 할 수 있음.
		
		
		
		
	}

}
