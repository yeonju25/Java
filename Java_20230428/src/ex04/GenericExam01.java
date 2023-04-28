package ex04;

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

//class Swap<T> {
//	public static <T> T swapBox(Box<T> box1, Box<T> box2) {
//		T tmp = box1.getOb();
//		box1.setOb(box2.getOb());
//		box2.setOb(tmp);
//		return box1.getOb();
//	}
//}
// 내가 한건데ㅋㅋㅋㅋㅋㅋ17라인 구문 설명듣고보니 이상해... 왜 멀쩡히 돌아갔냐...

public class GenericExam01 {

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.setOb(99);
		Box<Integer> box2 = new Box<>();
		box2.setOb(55);
	
		// 99 & 55
		System.out.println(box1.getOb() + "&" + box2.getOb());
		swapBox(box1,box2);
		
//		Swap.swapBox(box1,box2); // 내가 한거~~

		// 55 & 99
		System.out.println(box1.getOb() + "&" + box2.getOb());
	}

	// 선생님이 하신 거~~
							// 여기다 T대신 다른거 주면 받는 타입도 제한 가능
	static <T> void swapBox(Box<T> box1, Box<T> box2) {
		Box<T> tmp = new Box<T>();
		tmp.setOb(box1.getOb());
		box1.setOb(box2.getOb());
		box2.setOb(tmp.getOb());
	}
}
