package ex07;

public class MainExam {

	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		
//		home.user2(이 자리는 RemoteControl 구현객체가 와야한다.)
		home.user2(
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("오디오 전원 켭니다.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("오디오 전원 끕니다.");
					}
				} 
				);
		
		
	}

}
