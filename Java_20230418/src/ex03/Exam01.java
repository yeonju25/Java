package ex03;

class Member {
	private String name;
	private int age;	
	
	// 디폴트 생성자는 자바가 직접 생성한다. 다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어준다.
	// 생성자 ==> 반환타입이 없고 클래스 이름과 같다. 오버로딩 가능.
	public Member(String n, int a) {
		name = n;
		if(a>=0 && a<=120)
			age = a;
		else
			age = 1;
	}
	public Member() {
		name = "미정의";
		age = 0;
	};
	// public은 생략가능
	Member(String n) {
		name = n;
		age = 1;
	}
	
	void dispaly() {
		System.out.println(name + ", " + age);
	}
	void setData(String n, int a) {
		name = n;
		if(a>=0 && a<=120)
			age = a;
		else
			age = 1;
	}
}

public class Exam01 {

	public static void main(String[] args) {

		Member s1 = new Member("구본우", 26);
//		s1.name = "구본우";
//		s1.age = 26;
		
		Member s2 = new Member("추명선", 26);
//		s2.name = "추명선";
//		s2.age = 26;

		s1.dispaly();
		s2.dispaly();
		
		Member s3 = new Member();
		s3.dispaly();
		
		Member s4 = new Member("이성진");
		s4.dispaly();
		
	}

}
