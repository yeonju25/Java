package ex01.copy;

class Box{
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
}

class Unboxer{
	public static Object openBox(Box box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box box = new Box();
		box.setOb(123); 
		
	// Unboxer클래스 openBox를 이용해서 ob를 꺼내서 변수에 담아서 출력
		int tmp = (Integer)Unboxer.openBox(box);
		System.out.println(tmp);
		
		box.setOb(11.5);
		double f = (Double)Unboxer.openBox(box);
		System.out.println(f);
		
		box.setOb("korea");
		String str = (String)Unboxer.openBox(box);
		System.out.println(str);
		
	}

}
