package ex01;

class Card{
	void info() {
		System.out.println("card()");
	}
}

public class Exam01 {
	
	public static void main(String[] args) {
//		Card card = new Card();
//		card.info();
		
		
		
	  // 클래스 경로, 위치 알아보기~
//		Class cObj = new Card().getClass();
//		Class cObj = Card.class;
//		Class cObj = Class.forName("ex01.Card");
//		Object obj = Class.forName("ex01.Card");
//		System.out.println(cObj); 
	
		String str = "kor";
		System.out.println(str);
		
		str = "korea";
		System.out.println(str);
		
		String str2 = str.concat("korea");
		System.out.println(str2);
		
		boolean b = str2.contains("kor");
		System.out.println(b);
		
		int idx1 = str2.indexOf("o");
		System.out.println(idx1);
		
		System.out.println(str2.length());
		
		String str3 = str2.replace("korea","KOREA");
		System.out.println(str3);
		
		String s = "spring,summer,autumn,winter";
		String[] sarr = s.split(",");
		for(String ss : sarr)
			System.out.println(ss);
		
		Object obj = 10;
		// 참조변수니까 정수값 못들어감
		Object obj2 = new Integer(10);
		// 래퍼클래스로 이렇게 만들어 줄 수는 있으나 이클립스에서 줄을 그으면서 권장하지 않는다고 보여주는중...
		
		
		
		
		
		
	}
}
