package ex01;
// 교재 505p 정규식
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam01 {

	public static void main(String[] args) {
		
		String str = "11123211234567890";
									// 숫자만 입력하란 뜻
		Pattern p = Pattern.compile("^[0-9]*$"); // 정규식
		Matcher m = p.matcher(str);		// str이 정규표현식과 일치하는지 판단
		System.out.println(m.find());
		
		System.out.println("-------------------------------");
		String str2 = "ABC123";			// 6자 입력, 숫자랑 대문자만 입력
		Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$"); 
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find());
		
		System.out.println("-------------------------------");
		String str3 = "a123@11111.com";		//aaa@naver.com 이런 식으로 입력	
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com$");
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.find());
		
		
		
		// b나 c를 마지막 2자리로 포함하고 끝나게?
		System.out.println("-------------------------------");
		String str4 = "a";
		Pattern p4 = Pattern.compile("^a{3}[b|c]{2}$");
		Matcher m4 = p4.matcher(str4);
		System.out.println(m4.find());
		
		
		
		
	}

}
