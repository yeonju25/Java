package ex05;

import java.util.Calendar;
import java.util.Date;

class Sample{
	
}
// 싱글톤 패턴 검색하면 여러가지 나옴
class Singleton{
	private static Singleton instance;
	
	// 교재 351p 생성자의 접근 제어자
	// 아래 소스는 하나의 객체를 여러 개의 참조 변수로 참조하고 싶을 때 ==> 생성자의 접근 제어자를 이용해서 만든 것.
	
	private Singleton() {}
	// 생성자에 private 붙어있음
	
	
	// static이 있어야 함, static이 없으면 객체 생성하고 사용해야하는데 지금은 객체 생성 제어해놨으니까.
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		
		return instance;
	}
}

public class SingleTonTests {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		System.out.println(s1 == s2);
		// Sample 객체가 2개 생성되고 s1과 s2의 주소값이 다르므로 false.
		
		System.out.println("---------------");
		
		// Singleton sing1 = new Singleton(); 오류나는 이유???
		//	생성자에 private 붙어있으므로 생성할 수 없음.
		
		Singleton sing1 = Singleton.getInstance();
		// if문의 결과 : 객체가 없는 상태라 객체하나 생성되고 참조
		Singleton sing2 = Singleton.getInstance();
		// 객체가 이미 존재하므로 그 객체 참조
		System.out.println(sing1 == sing2);
		// 같은 객체를 참조하고 있음 ==> 주소값이 같다 ==> true 나옴.
		
		System.out.println("---------------");
		
		Calendar now = Calendar.getInstance();
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(now.getTime());
		// getInstance가 있다는 건 객체를 하나 생성해서 같이 쓰겠다는 말이구나 정도로 이해해도 됨
		
		
	}

}
