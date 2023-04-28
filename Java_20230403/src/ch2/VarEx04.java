package ch2;

public class VarEx04 {

	public static void main(String[] args) {

		double f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		
		System.out.println(f);

		
		
		
		char ch2 = 'B';
		String str = "Korea"; // 참조형
		
		/* 정수 + 정수 => 정수
		 * 정수 + 실수 => 실수
		 * 문자열 + 정수 => 문자열
		 * 문자열 + 실수 => 실수
		 */
		
		int num = 10;
		double d = 10.5;
		String s = "eng";
		
		double dd = num + d;
		System.out.println(num+d);
		System.out.println(s+d); // "eng" + "10.5" = eng10.5
		System.out.println(s+d+num); // "eng" + 10.5 = eng10.5 + "10" => eng10.510
		System.out.println(s+(d+num)); // 10.5 + 10 => "20.5" + "eng" => 20.5eng
		  // 책의 35p 내용이다.
		
		
		
		
	}

}
