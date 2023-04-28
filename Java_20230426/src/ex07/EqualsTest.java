package ex07;

class Member{
	private String id;
	public Member(String id) {
		this.id = id;
	}
	
//	public boolean equals(Object obj) {
//		if(this.id == ((Member)obj).id)
//			return true;
//		return false;
//	}
}

public class EqualsTest {

	public static void main(String[] args) {

		Member m1 = new Member("test");
		Member m2 = new Member("test");
		String s1 = new String("kor");
		String s2 = new String("kor");
		
		System.out.println("== : " + (m1 == m2));
		System.out.println("equals : "  + m1.equals(m2));
		
		System.out.println("== : " + (s1 == s2));
		System.out.println("equals : "  + s1.equals(s2));
		
		
		
	}

}
