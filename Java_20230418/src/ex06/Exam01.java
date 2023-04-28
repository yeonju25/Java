package ex06;

class 사람{
	String name;
	int age;
	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Woo{
	String name;
	int age;
	double weight;
	
	public Woo(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void display() {
		System.out.println(name + ", " + age + ", " + weight);
	}
}

class Sun{
	String name;
	int age;
	double height;
	
	public Sun(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void display() {
		System.out.println(name + ", " + age + ", " + height);
	}
}

class Jin{
	String name;
	int age;
	String grade;
	
	public Jin(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	void display() {
		System.out.println(name + ", " + age + ", " + grade);
	}
}

public class Exam01 {

	public static void main(String[] args) {

		Sun s = new Sun("추명선", 20, 178.4);
		s.display();
		
		Woo w = new Woo("까미", 15, 8);
		w.display();
		
	}

}
