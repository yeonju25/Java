package ex07;

import ch7.Woo;
import ch7.사람;

class 사람{
	String name;
	int age;
	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void info() {
		System.out.println(name + ", " + age);
	}
}
          // extends 클래스이름 => 해당 클래스 상속받는다
class Woo extends 사람{
	double weight;
	
	public Woo(String name, int age, double weight) {
		super(name, age);  // 조상 클래스의 생성자 불러오기 = super
		this.weight = weight;
	}
//	public Woo(String name, int age, double weight) {
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//	}
	
	void display() {
//		System.out.println(name + ", " + age + ", " + weight);
	}
}

class Sun extends 사람{
	double height;
	
//	public Sun(String name, int age, double height) {
//		this.name = name;
//		this.age = age;
//		this.height = height;
//	}
	
	void display() {
//		System.out.println(name + ", " + age + ", " + height);
	}
}

class Jin{
	String grade;
	
//	public Jin(String name, int age, String grade) {
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
	
	void display() {
//		System.out.println(name + ", " + age + ", " + grade);
	}
}

public class Exam01 {

	public static void main(String[] args) {

		Woo w = new Woo("로이",11,120);
		w.info();
		
	}

}
