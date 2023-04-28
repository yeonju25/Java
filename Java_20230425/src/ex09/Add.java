package ex09;

public class Add implements Calculable{

	@Override
	public void calculate(int x, int y) {
		System.out.println("x+y : " + (x+y));
	}
}

class Sub implements Calculable{

	@Override
	public void calculate(int x, int y) {		
		System.out.println("x-y : " + (x-y));
	}
}
	
	
