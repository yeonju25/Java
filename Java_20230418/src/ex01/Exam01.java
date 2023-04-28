package ex01;

class Member {
	String name;
	int age;
	int num;
	
	static int ban;
	static String ac;
	
	void func() {};
	// 인스턴스 메소드 안에서는 다 사용가능
	void info() {
		age = ban;
		ban = num;
		func();
		info2();
		sinfo();
	}
	// 정적메소드는 정적변수만 사용가능
	static void info2() {};
	static void sInfo() {
		ban = 200;
		info2();
		ac = "이젠";
	}
}

// 정적변수, 정적메소드는 공용자원이면서 자기들끼리만 데이터 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {

		Member m = new Member();
		
		
		
		
	}

}
