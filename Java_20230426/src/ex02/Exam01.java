package ex02;

public class Exam01 {

	public static void main(String[] args) {
				
			// 클래스를 찾는 것. 저 이름의 클래스가 있는가...
			try {
				Class.forName("java.lang.String");
				System.out.println("java.lang.String 클래스가 존재함.");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			System.out.println("프로그램 종료");
	}
}
