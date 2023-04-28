package ex05;

public class ex {

	public static void main(String[] args) {

		Button b = new Button();
		
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("메롱");
			}
		}
		
		OkListener a = new OkListener();
		a.onClick();
	}

}
