package ex08;
class Box<T>{
	T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class SteelBox<T> extends Box<T>{
	public SteelBox(T o) {
		ob = o;
	}
}

public class GenericInheritance {

	public static void main(String[] args) {
		
		// Box가 SteelBox의 상위클래스이기 때문에 이렇게 가능
		Box<Integer> iBox = new SteelBox(100);
		Box<String> sBox = new SteelBox("korea");
		System.out.println(iBox.get());
		System.out.println(sBox.get());
		
		// 타입까지 일치해야 상속으로 인정해줘서 쓸 수 있음.
//		Box<Integer> iiBox = new SteelBox<String>("kim");   // 오류!!!!!
//		System.out.println(iiBox.get());
		
	}

}
