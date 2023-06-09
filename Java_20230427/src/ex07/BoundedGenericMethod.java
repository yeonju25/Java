package ex07;
// 제네릭 사용 : 한 코드로 다양한 타입을 넣어서 이용할 수 있다. 
// 제한된 제네릭 : 정말 아무거나 넣어서 쓸 수는 없으니까, 타입에 제한을 두어 이용함.

class Box<T>{
	private T ob;
	public void set(T o) {
		ob = o;	
	}
	public T get()	{
		return ob;
	}
}

class BoxFactory{ 
				// T에 제한을 둠 : Number나 Number를 상속한 애만 T에 올 수 있다.
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed Data : " + o.intValue());
		return box;
	}
}

class UnBoxer{		// double != Double
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("Unboxed Data : " + box.get().intValue());
		return box.get();
	}
}


public class BoundedGenericMethod {

	public static void main(String[] args) {
		Box<Double> sBox = BoxFactory.makeBox(new Double(7.77));
		double n = UnBoxer.openBox(sBox); // Double
		System.out.println("n : " + n);
	}

}
