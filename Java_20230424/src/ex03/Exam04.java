package ex03;
// 클래스 앞에 올 수 있는 제어자는 public과 default, default는 생략되어 있는중
public class Exam04 {
	/* private 붙으면 해당 클래스 안에서만 사용가능
		멤버변수 지정할 때 외부에서 접근하지 못하도록 
		private 붙여주어야 함. 앞으로는 그렇게 하시오~
	*/
	private int num;
	private String name;
	private int age;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
//	// private 변수를 다른 곳에서 쓰고 싶을때 set-get 이용
//	// 관습적으로 set변수이름대문자시작 get변수이름대문자시작 이렇게 씀
//	void setNum(int num) {
//		this.num = num;
//	}
//	int getNum() {
//		return num;
//	}
//	
//	
//	private String name;
//	void setName(String name) {
//		this.name = name;
//	}
//	
//	String getName() {
//		return name;
//	}
//	
//	public void sum() {
//		System.out.println(num);
//	}
}
	
class Study{
	int count = 0;
}