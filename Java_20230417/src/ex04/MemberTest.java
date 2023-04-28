package ex04;

class Member {
	int age; // 인스턴스 변수
	static int num; // 클래스변수, 정적변수, 공유변수
}

public class MemberTest {

	public static void main(String[] args) {
		
		Member.num = 100;
		// 클래스변수는 객체 생성하지 않아도 접근 가능
		
		Member m = new Member();
		m.age = 20;
		// 인스턴스변수는 객체를 생성해야 접근 가능
		
		Member m2 = new Member();
		m2 = m;
		// m2는 m의 객체 주소를 함께 참조하게 되고, 원래 m2의 객체는 쓸모없어져 삭제됨
		
		m2.age = 50;
		System.out.println(m.age);
		System.out.println(m2.age);
		// 같은 객체 주소를 참조하고 있기 때문에 m2의 값을 변경해도 m에 같이 적용
	}

}
