package ex06;

interface SquareInterface{
	int square(int x) {
		return x*x;
	}
}
	

//class MyMax implements MyFunction{
//	@Override
//	public int max(int a, int b) {
//		return a>b ? a : b;
//	}
//}

public class LambdaEx01 {

	public static void main(String[] args) {
		SquareInterface si = (x) -> x*x;
		System.out.println(si.square(10));
	}

}
