package ex06;
// 인터페이스 개념, 책의 저자는 추상클래스를 더 많이 쓰다고 했지만 선생님 견해로는 인터페이스를 더 많이 쓰는 것 같다고 하심

interface Animal{
	void eat();
	public abstract void sleep();
	// public abstract 생략 가능
	
	default void sound() {};
	// 구현해도 되고 하지않아도 됨
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("고양이는 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 잔다");
	}
	
	public void sound() {
		System.out.println("야옹~");
	}
}

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("강아지는 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("강아지는 잔다");
	}
	
}

public class Exam01 {

	public static void main(String[] args) {
		
//		Dog dog = new Dog();
//		dog.eat();
//		dog.sleep();
		
		// 최상위클래스명을 사용해서 객체 생성
		Animal an = new Dog();
		an.eat();
		an.sleep();
		
		an = new Cat();
		an.eat();
		an.sleep();
		an.sound();
		
	}

}
