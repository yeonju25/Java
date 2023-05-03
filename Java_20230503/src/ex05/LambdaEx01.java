package ex05;

interface MyFunction{
	int max(int a, int b);	// 추상메소드
}

//class MyMax implements MyFunction{
//	@Override
//	public int max(int a, int b) {
//		return a>b ? a : b;
//	}
//}

public class LambdaEx01 {

	public static void main(String[] args) {
//		MyFunction m = new MyFunction() {		// 익명 객체
//			@Override
//			public int max(int a, int b) {
//				return a>b ? a : b;
//			}
//		};
		
		
//		MyFunction m = (a,b)-> { return a>b ? a : b; }; // 람다식
	// 이 자리에 MyFunction이 있기 때문에, = 다음에는 이것을 구현하는 객체만 올 수 있다. 
		// 즉, MyFunction의 추상메소드 max를 구현하는 것이 와야 함.
		MyFunction m = (a,b)->  a>b ? a : b; // 문장이 하나면 return생략 가능, 대신 생략하면 {}도 같이 삭제해야 함.
	
		System.out.println("max : " + m.max(10, 20));
	}

}
