package ex04;

class Member {
	private String name;
	private int age;	
	
	// 디폴트 생성자는 자바가 직접 생성한다. 다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어준다.
	// 생성자 ==> 반환타입이 없고 클래스 이름과 같다. 오버로딩 가능.
	// 생성자는 언제 동작? ==> 객체가 생성될 때
	
	
	// this 
	// 1. 지역변수와 멤버변수가 충돌할 때 this를 붙이면 멤버변수를 의미
	// 2. 생성자를 찾을 때
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	} /// 이름이 같아서 충돌할 때 this를 붙이면 this.name은 괄호 밖의 name을 의미한다.
	
	public Member() {
		this("미정의",1);
//		name = "미정의";
//		age = 0;
	};
	
	Member(String name) {  //// public은 생략가능
		this(name,1);
//		this.name = name;
//		age = 1;
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
