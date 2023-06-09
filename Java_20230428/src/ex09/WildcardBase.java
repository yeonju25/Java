package ex09;
class Box<T>{
	private T ob; // 현재 T = Object (최상위 클래스)

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

// 개발자 실수가 있는 부분을 컴파일 과정에서 발견될 수 있도록 매개변수를 수정하자.
public class WildcardBase {

//	public static void addBox(Box<Integer> b1, Box<? extends Integer> b2, Box<? extends Integer> b3) {
//		b3.setOb(b1.getOb()+b2.getOb());	// 개발자의 실수!
//	}	// extends는 getter 꺼내는 기능, 이러면 setOb에 에러.
	
	public static void addBox(Box<? super Integer> b1, Box<Integer> b2, Box<Integer> b3) {
		b3.setOb(b1.getOb()+b2.getOb());	// 개발자의 실수!
	}	// super는 setter 저장하는 기능, 이러면 getOb에 에러.
	
	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		box1.setOb(24);
		Box<Integer> box2 = new Box<>();
		box2.setOb(37);
		Box<Integer> result = new Box<>();
		result.setOb(0);
		addBox(result, box1, box2); // result에 24+37의 값을 저장
		System.out.println(result.getOb());	// 61 출력
			
		
	}

}
