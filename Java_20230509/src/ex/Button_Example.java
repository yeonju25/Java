package ex;

import ex.Button.ClickListener;

public class Button_Example {

	public static void main(String[] args) {

		
		Button btnOk = new Button();
		// 익명 객체 사용해서 만들기
//		btnOk.setClickLister(new ClickListener() {	
//			@Override
//			public void onClick() {
//				System.out.println("OK버튼을 클릭");
//			}
//		});
		
		// 람다식으로 만들기
		btnOk.setClickLister(()->System.out.println("OK버튼을 클릭했습니다."));
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickLister(()->System.out.println("Cancel버튼을 클릭했습니다."));
		btnCancel.click();
	}

}
