package ex05;

class Apple{
	@Override
	public String toString() {
		return "I am Apple";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am Orange";
	}
}

class Box <T> { 	// 사과, 오렌지 담는 박스
	private T obj; 

	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class FruitAndBox {

	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();	// 사과
		Box<Orange> oBox = new Box<Orange>();	// 오렌지
	
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		// 이제 다른거 들어가면 오류나고, Apple이랑 Orange만 받을 수 있음
		
		Apple ap = aBox.getObj();
		Orange op = oBox.getObj();
		System.out.println(ap);
		System.out.println(op);
		
		
	}
}
