package ex02;

class Member {
	String name;
	String id;
	String password;
	int age;
	
	boolean login(String id, String pw) {
		// login의 id, pw와 위에 지정해둔 id, password는 별개
		if(id.equals("hong") && pw.equals("12345"))
			return true;
		else return false;
	}
	void logout(String id) {
		System.out.println(id + "님 로그아웃되었습니다.");
	}
}


public class MemberTest {

	public static void main(String[] args) {

		
	}

}

