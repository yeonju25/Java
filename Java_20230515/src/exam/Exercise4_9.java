package exam;

public class Exercise4_9 {

	public static void main(String[] args) {
		// 해당 문자열 내 숫자들의 합을 구하는 과정
		String str = "12345";
		int sum =0;
		
		// charAt(int i)를 통해 해당 문자열 검사
		// 문자열 0~9를 아스키코드표의 10진수로 표현하면 48~57, -'0'을 하면 문자열로 표현된 숫자와 컴퓨터 상에 표현되는 숫자가 같아진다.
		for(int i=0; i<str.length(); i++) {
			sum += (int)(str.charAt(i)-'0');
		}
		System.out.println("sum = " + sum);
	}
}
