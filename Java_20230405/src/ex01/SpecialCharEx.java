package ex01;

public class SpecialCharEx {

	public static void main(String[] args) {

		System.out.println('\'');              // '''처럼 할 수 없다.
		System.out.println("It\'s my thing");
		System.out.println("abc\t123\b456");   // \b에 의해 3이 지워진다.
		System.out.println('\n');              // 개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");       // 큰 따옴표를 출력하려면 이렇게 한다.
		System.out.println("c:\\");            // 교재 57p 예제

		System.out.println("\uac63");          // \u 유니코드 ac63번 문자 출력
		
		
	}

}
