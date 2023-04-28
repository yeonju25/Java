package ex02.Generic;

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setOb(10);
		
		Unboxer.openBox(box);
		
		System.out.println(box.getOb());
		
		
	}

}
