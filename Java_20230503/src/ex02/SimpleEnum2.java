package ex02;
 // 교재 691p 열거형

enum Animal{
	DOG, CAT, 
}
enum Person2{
	MAN, WOMAN
}

public class SimpleEnum2 {

	public static void main(String[] args) {
		who(Person2.MAN);
//		who(Animal.CAT); // 타입 일치하지 않아서 에러.
	}

// MAN은 0, WOMAN은 1로 ordinal 받아서 쓸수 있지만 추가하면 식이 무너지기 때문에 문자열로 쓰세요
	public static void who(Person2 p) {
		switch(p) {
		case MAN :
			System.out.println("남성");
			break;
		case WOMAN :
			System.out.println("여성");
			break;
		}
	}
}
