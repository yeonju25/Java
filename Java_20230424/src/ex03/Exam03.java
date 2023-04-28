package ex03;
// 같은 패키지 내 다른 클래스의 내용 써보기
public class Exam03 {

	public static void main(String[] args) {
		
		Exam04 e = new Exam04();
		// e.num = 100;
		// Exam04 클래스의 변수 int num에 private 붙음. 
		// 그래서 다른 클래스에서 사용 불가
		
		e.setNum(20);
		System.out.println("num :" + e.getNum());
		
		
		Study st = new Study();
		st.count = 100;
	}

}
