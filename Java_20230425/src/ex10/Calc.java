package ex10;

public interface Calc {
	int calculate(int x, int y);
}

class Add implements Calc{
	@Override
	public int calculate(int x, int y) {
		return x+y;
	}
}

class Sub implements Calc{
	@Override
	public int calculate(int x, int y) {
		return x-y;
	}
}

class Mul implements Calc{
	@Override
	public int calculate(int x, int y) {
		return x*y;
	}
}

class Div implements Calc{
	@Override
	public int calculate(int x, int y) {
		return x/y;
	}
}