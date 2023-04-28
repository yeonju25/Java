package ex06;

public class Exam {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		car.run2();
	
		// 익명클래스 : 상속 등의 과정을 거치지 않고 재정의가 가능하며
		// 일회성으로 사용하고 변경이 용이하다는 장점이 있다.
		car.run3(new Tire() {
			public void roll() {
				System.out.println("익명 자식 Tire 객체3이 굴러감");
			}
		});
		
		car.run3(new Tire());
		
	}

}
