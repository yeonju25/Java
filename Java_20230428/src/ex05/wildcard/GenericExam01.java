package ex05.wildcard;

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer {					// 타입에 제한 두기 가능
//	public static void peekBox(Box<? extends Number> box) {		// 상한 제한.
	public static void peekBox(Box<? super Integer> box) {		// 하한 제한.
		System.out.println(box.getOb());
	}
}
public class GenericExam01 {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.setOb(123);
		
		Box<Double> dBox = new Box<>();
		dBox.setOb(123.123);
		
		Unboxer.peekBox(iBox);
//		Unboxer.peekBox(dBox);
		
		Box<String> sBox = new Box<>();
		sBox.setOb("korea");
//		Unboxer.peekBox(sBox);	// 타입에 제한을 둬서 얘는 안됨
		
	}
////  static <T> void swapBox(Box<T> box1, Box<T> box2) {
//	static void swapBox(Box<?> box1, Box<?> box2) {
//		System.out.println(box1.getOb());
//		System.out.println(box2.getOb());
//	}
}
