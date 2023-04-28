package ex03;

class Animal{	
	
	void makeSound() {
		System.out.println("동물");
	}
	
}

class Cat extends Animal{
	
	void makeSound() {
		System.out.println("야옹~");
	}
	
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("멍멍!");
	}
}

class Pig extends Animal{
	void makeSound() {
		System.out.println("꿀꿀");
	}
}

class Rabbit extends Animal{
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}
class Tiger extends Animal{
	void makeSound() {
		super.makeSound(); // 상위클래스에 있는 함수 호출
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
		
		System.out.println("---------------------");
		
		 Tiger t = new Tiger();
		 t.makeSound();
	}

}
