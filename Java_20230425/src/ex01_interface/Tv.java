package ex01_interface;

// RemoteControl 인터페이스 구현
// 인터페이스는 다중상속 가능
public class Tv implements RemoteControl, Searchable {

	@Override
	public void trunOn() {
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}
	
}
