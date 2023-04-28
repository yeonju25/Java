package ch7;

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
class Woo extends 사람{
	double weight;
	
	public Woo(String name, int age, double weight) {
		super(name, age);  // 조상 클래스의 생성자 불러오기 = super
		this.weight = weight;
	}
	
	void display() {
//		System.out.println(name + ", " + age + ", " + weight);
	}
}

class Sun extends 사람{
	double height;
	
	public Sun(String name, int age, double height) {
		super(name, age);
		this.height = height;
	}
	
	
	void display() {
		System.out.println(name + ", " + age + ", " + height);
	}
}

class Jin extends 사람{
	String grade;
	public Jin(String name, int age) {
		super(name, age);
		this.grade = "3";
		
	}
	
	void display() {
//		System.out.println(name + ", " + age + ", " + grade);
	}
}

public class Exam02 {

	public static void main(String[] args) {

		Woo w = new Woo("로이",11,120);
		w.info();
		
		Sun s = new Sun("모이", 10, 120);
		s.display();
		
		Jin j = new Jin("진",1);
		j.info();
		
	}

}
