package ex01;

class Bag {
	int capacity; // 용량
	SunCream sun; // 포함관계 (Bag 속에 SunCream)

	public Bag() {
		System.out.println("Bag()");
	}
	void move() {
		System.out.println("가방 옮기다");
	}
}

class SunCream {
	int vol;
	public SunCream() {
		System.out.println("SunCream()");
	}
	void cover() {
		System.out.println("선크림 바르다");
	}
}

public class MemberTest {

	public static void main(String[] args) {

		Bag bg = new Bag();
		// 여기까지는 선크림 객체 아직 생성안됨
		
		bg.sun = new SunCream();
		// 여기서 선크림 객체 생성
		
		bg.move();
		bg.sun.cover();
	}

}
