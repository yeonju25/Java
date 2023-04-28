package ex01;

public class Exam05 {

	public static void main(String[] args) {

		int jumsu = 80;
		
		String result=null;
		
		// 삼항 연산자 or 조건 연산자(교재 130p) 
		// () ? 참일 때 실행 : 거짓일 때 실행문장
		
		result = (jumsu >= 60) ? "합격": "불합격" ;
		// 괄호 안의 조건이 참이면 합격, 거짓이면 불합격이 나온다. 

		System.out.println("당신은 " + result + " 입니다.");
	}

}
