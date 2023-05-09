package ex;


public class Button {

	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;	// 구현 객체
	
	public void setClickLister(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click(){
		this.clickListener.onClick();
	}
}

