package ex01_interface;

public class Audio implements RemoteControl {

	@Override
	public void trunOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("오디오를 끕니다.");
	}
	
	// 디폴트메서드를 재정의할때는 default를 public으로 바꿔준다.
	public void setMute(boolean mute) {
		System.out.println("setMute()를 재정의합니다.");
	}


}
