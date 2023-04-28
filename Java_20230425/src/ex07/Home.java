package ex07;

public class Home {

//	private RemoteControl rc = ? 리모컨을 구현한 클래스가 객체로 와야 함
//	private RemoteControl= new Test();
	
//	인터페이스는 객체로 생성할 수 없지만 익명클래스로 일회성 구현 가능.
                                 // 익명구현객체 
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV 끕니다.");
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}

	public void user2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
