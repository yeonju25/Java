package ex02;
// Animal은 동물들의 공통된 속성이지 객체로 만들기엔 이상한 개념이다 싶은 상황
// 이럴때 앞에 abstract를 붙이면 추상적 개념으로만 존재하고 객체는 만들 수 없게 됨

abstract class Animal{	// 추상클래스
	
	abstract void makeSound();	// 추상메소드, { } 바디 지움
	// 하위클래스에서 오버라이딩하지 않으면 사용할 수 없는 메소드
	// 하위클래스들은 추상메소드를 무조건 오버라이딩해서 구현해야 함, 하지 않으면 오류남
	
}

class Cat extends Animal{
	
	@Override	// 어노테이션(@가 붙은 것의 명칭), 붙이는 것을 권장 
	// Override --> 상위클래스를 재정의하겠다는 적극적 표현
	void makeSound() {
		System.out.println("야옹~");
	}
	
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("멍멍!");
	}
}

class Pig extends Animal{
	@Override
	void makeSound() {
		System.out.println("꿀꿀");
	}
}

class Rabbit extends Animal{
	@Override
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}
class Tiger extends Animal{
	@Override
	void makeSound() {
		System.out.println("어흥~");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		// 고양이-야옹, 강아지-멍멍, 돼지-꿀꿀... 짖는 소리
		Animal[] animals = { new Cat(), new Dog(), new Pig(), new Rabbit(), new Tiger() };
		
		for(int i=0; i<animals.length; i++)
			animals[i].makeSound();
		
		// '향상된 for'라고 부름 
		for(Animal animal : animals) 
		animal.makeSound();
	}

}
