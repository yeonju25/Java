package ex02;

class Member {
	private String name;
	private int age;	
	
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

		Member s1 = new Member();
		s1.setData("구본우", -5);
//		s1.name = "구본우";
//		s1.age = 26;
		
		Member s2 = new Member();
		s2.setData("추명선", 26);
		
//		s2.name = "추명선";
//		s2.age = 26;
		
		s1.dispaly();
		s2.dispaly();
		
		
	}

}
