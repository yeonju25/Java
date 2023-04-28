package ex05;

// 중첩 인터페이스 : 해당 클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해서이다.
// 클래스 안에 인터페이스가 있는 형태
public class Button {

	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	                     // 1. 구현한 객체의 주소값 set이 받음
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
		// 2. 11라인 clickListener는 주소값 받아온 애가 되는거야
	}
	
	public void click() { // Button이 클릭되었을 때 실행되는 메소드 선언
		this.clickListener.onClick();
		// 3. 11라인 주소값 받아온 객체에 따라서 값이 달라지는거야
	}
}
