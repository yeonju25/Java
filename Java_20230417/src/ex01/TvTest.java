package ex01;

// TV 클래스 설계			예) int num, int kor
class Tv{
	// 멤버변수, 필드
	String color;
	boolean power;
	int channel;
	
	// 메소드, 멤버함수
	void power(	) { power = !power; }
	void channelUp() { channel ++; }
	void channelDown() { channel --; }
}

// 교재 235p 예제 6-1
public class TvTest {

	public static void main(String[] args) {

 // 예) int num = 10; ===> num공간 생성되고 그 안에 10이란 값 들어가는 것
		Tv tv = new Tv(); // 스택영역에 tv 변수 공간 생성, heap영역에 Tv클래스의 객체 공간 생성
		tv.color = "검정";
		tv.channelUp();
		tv.channelUp();
		
		System.out.println(tv.color); 
		System.out.println(tv.channel);
		
		Tv lgtv = new Tv(); // 스택영역에 lgtv 변수 공간 생성, heap영역에 Tv클래스 객체 생성
							// 이때 Tv클래스의 객체는 tv와 lgtv 것이 따로 존재하는 것.
		lgtv.color = "흰색";
		System.out.println(lgtv.color);
		System.out.println(lgtv.channel);
		
	}

}
