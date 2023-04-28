package ex05;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnOk = new Button();
		// 버튼 객체 생성
		
		// 인터페이스 구현한 클래스
		class OKListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		// OK객체 생성후 set에 주소값 던짐
		btnOk.setClickListener(new OKListener());
		btnOk.click();
		
		Button btnCancel = new Button();
		
		// 인터페이스 구현
		class CancelListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		// Cancel 객체 생성하고 주소값을 set에 던짐
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
		
		
	}

}
