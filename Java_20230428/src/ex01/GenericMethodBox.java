package ex01;

class Box{
	private Integer ob;

	public Integer getOb() {
		return ob;
	}

	public void setOb(Integer ob) {
		this.ob = ob;
	}
}

class Unboxer{
	public static Integer openBox(Box box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box box = new Box();
		box.setOb(123); // () 안에 정수만 집어넣을 수 있음, 받는 타입이 Integer이기 때문
		
	// Unboxer클래스 openBox를 이용해서 ob를 꺼내서 변수에 담아서 출력
		Integer tmp = Unboxer.openBox(box).intValue();
		System.out.println(tmp);
		
		
		
	}

}
