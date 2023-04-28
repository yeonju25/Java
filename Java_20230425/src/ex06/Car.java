package ex06;

public class Car {
	private Tire tire = new Tire();
	
					// 익명자식객체 -> 부모클래스를 상속받아 아래값이 생성됨. 
	private Tire tire2 = new Tire() { // new 객체생성 뒤에 ;가 아니라 {};가 온다? : 익명클래스
		public void roll() {
			System.out.println("익명 자식 Tire 객체1이 굴러감");
		}
	};		// 부모클래스가 가지고 있는걸 재정의하는 용도로 씀, 일회용으로 사용
	
	public void run1() {
		tire.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러감");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) { tire.roll(); }
//		Tire tire3 = new Tire() {
//			@Override
//			public void roll() {
//				System.out.println("익명 자식 객체3이 굴러감");
//			}
//		};
//		tire3.roll();
	
	
	
}


