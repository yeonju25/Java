package ex03.Generic;
		// T에는 Number나 Number의 하위클래스들이 올 수 있다.
class Box<T extends Number>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box<Float> box = new Box<Float>();
		box.setOb(10.3f);
		
		Unboxer.openBox(box);
		
		System.out.println(box.getOb());
		
		
	}

}
