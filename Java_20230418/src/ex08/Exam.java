package ex08;

class Parent {
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent{
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
}

public class Exam {

	public static void main(String[] args) {

		Child ch = new Child("까미", 2);
	}

}
