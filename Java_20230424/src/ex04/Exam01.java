package ex04;

import ex03.Exam04;

public class Exam01 {
// ex03 패키지의 클래스 가져와서 써보기
	public static void main(String[] args) {
		Exam04 ex = new Exam04();
		// Exam04가 다른 패키지에 있어서 처음에 찾지 못함.
		// ctrl+shift+o 눌러주면 자동으로 찾아서 import문 추가해줌
		// Exam04는 public class라서 다른 패키지에서도 사용가능
		ex.sum();
		// ex03.Exam04 sum메소드 앞에 public 붙어서 여기서도 사용 가능한 것
		
		
		Study st = new Study();
		// Study는 default 클래스라 다른 패키지에선 사용할 수 없으므로 오류
	
	}

}
