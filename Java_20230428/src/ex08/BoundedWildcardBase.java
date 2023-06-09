package ex08;
class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Toy{
	public String toString() {
		return "I am a Toy()";
	}
}

class BoxHandler{				// getter 기능만 쓰고 싶을 때 extends를 넣어서 제한을 줌
	public static void outBox(Box<? extends Toy> box) {
		// box.getOb();만 적고 getOb에 커서 둔 다음 ctrl+2 해서 L 누르니까 좌항에 Toy toy를 만들어줌
		Toy toy = box.getOb();	// getter 기능, 꺼내는 기능
//		box.setOb(new Toy());	// 에러.
		System.out.println(toy);
		
	}
							//<? super Toy> setter기능, 넣어도 되고 안넣어도 돼???????
	public static void inBox(Box<Toy> box, Toy n) {
		box.setOb(n);	// setter 기능, 넣어주는 기능
	}
}

public class BoundedWildcardBase {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}

}
