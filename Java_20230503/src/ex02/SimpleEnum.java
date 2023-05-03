package ex02;
 // 교재 691p 열거형

enum Scale{
	DO, RE, Mi, FA
}

public class SimpleEnum {

	public static void main(String[] args) {
		System.out.println(Scale.DO.ordinal());
		System.out.println(Scale.DO.name());

	}

}
