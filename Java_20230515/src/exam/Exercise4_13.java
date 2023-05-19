package exam;

public class Exercise4_13 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)을 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		// 아스키코드표 : ' '는 32, 0은 48, 9는 57 
		// (검사한 문자열-공백) 했을 때 16~25 사이 숫자가 나오면 해당 문자열은 숫자이다. 
		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i)-ch < 16 || value.charAt(i)-ch > 25) {
				isNumber = false;
			}
		}
		
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}	
	}
}

//		for(int i=0; i<value.length(); i++) {
//			if(value.charAt(i)-'0' < 0 || value.charAt(i)-'0' > 9) {
//				isNumber = false;
//			}
//		}
//		
