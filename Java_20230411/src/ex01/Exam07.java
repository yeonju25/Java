package ex01;

/*
숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
만일 문자열이 "12345"라면 '1+2+3+4+5' 결과인 15가 출력되어야 한다.
힌트 : String charAt(int i) 사용
 */

public class Exam07 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		               //str.length = 5, string의 길이값 구해줌   
		for(int i=0; i < str.length(); i++) {
			
//			char tmp = str.charAt(i);
//			int num = (tmp-'0'); // 아스키코드표
//			sum += num;
//		 // sum += (tmp-'0'); 19~20줄 이렇게 축약 가능   
			
			sum += str.charAt(i)-'0'; // 18~20줄 이렇게 축약 가능
		}
		System.out.println("sum = " + sum);
		
		char ch = str.charAt(0);
		int num = ch;
		System.out.printf("%c = %d \n", ch, num);
		// ch가 찍어준 1은 문자 1이다.
		
	}

}
