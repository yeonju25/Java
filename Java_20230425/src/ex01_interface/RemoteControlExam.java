package ex01_interface;

public class RemoteControlExam {

	public static void main(String[] args) {

		RemoteControl rc = new Tv();
		rc.trunOn();
		// rc.search(); 는 안됨. 타입이 RemoteControl이라...
		
		rc = new Audio();
		rc.trunOn();
		rc.setMute(true);
		
		// search 쓰려면 이렇게 새 객체를 생성해야한다!!!
		Tv t = new Tv();
		t.search(null);
		Searchable se = new Tv();
		se.search(null);
		
		System.out.println(RemoteControl.MAX_VOLUME);
		RemoteControl.changeBattery();
		
	}

}
