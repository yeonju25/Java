package ex03;

class Student {
	String name;
	String address;
	int age;
	static int count; // 공유변수(static을 붙임으로써)
	
	void displyInfo() {
		count++;
		info(); // static이 붙은 클래스변수(정적변수)는 가장 먼저 만들어져있기 때문에 사용가능함
		System.out.println(name + "," + age +"," + 
							address + "현재 학생 수 : " + count);
	}
	static void info() {
		count++;
	//	age++; 		// age++; 오류남, 실행 불가 
	// 객체가 생성되기 전에 age에 값을 증가시키려고하니까 오류. 
	// 인스턴스변수 age는 Student kim = new Student(); 이때 생성되는 것.
	}
	
}
public class StudentTest {

	public static void main(String[] args) {

		Student kim = new Student();
		kim.name = "김씨요";
		kim.age = 20;
		kim.address = "수원이요";
		
		Student park = new Student();
		park.name = "박씨요";
		park.age = 200;
		park.address = "천당이요";
		
		Student son = new Student();
		Student hong = new Student();
		
		kim.displyInfo();
		park.displyInfo();
		son.displyInfo();
		hong.displyInfo();
	
	}

}
