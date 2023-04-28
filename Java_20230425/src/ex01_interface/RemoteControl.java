package ex01_interface;

// 인터페이스 선언
public interface RemoteControl {
	// 상수 (public static final) - 생략 가능
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상메소드 - body 없음
	public void trunOn();
	public void trunOff();
	
	// 디폴트메서드 : 인터페이스에서 사용 - 구현클래스에서 재정의 선택 가능
	// 인터페이스에선 추상메소드만 허용하는데, 앞에 default 붙이면 온전한 메소드도 사용가능
	// ( 인터페이스 외의 클래스나 메서드앞에 default붙이면 오류남, default는 원래 생략되는 것.)
	// 디폴트메서드는 필수 구현 아님. 선택해서 구현 가능함. 대신 재정의해서 사용할때는 default를 public으로 바꿔줘야 함.
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리 합니다.");
		else
			System.out.println("무음처리 해제합니다.");
	}
	
	// 정적메소드 (public 생략 가능)
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}

}
