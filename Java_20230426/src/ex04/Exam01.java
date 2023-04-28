package ex04;

public class Exam01 {

	public static void main(String[] args) {
		
		try {
			findClass();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

	private static void findClass() throws ClassNotFoundException {
								// 예외가 발생하면 여기서 처리하지않고 호출한 문장에게 던짐. 8번 라인으로 던지는 것.
		Class.forName("java.lang.String2");
	}
}
