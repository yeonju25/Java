package ex08;

public class CalExam01 {

	public static void main(String[] args) {
//		Calculable cal = new Add();
//		cal.calculate(10, 5);
//		
//		cal = new Sub();
//		cal.calculate(5, 2);
		
		Calculable cal = new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("x+y : " + (x+y));
			}
		};
		cal.calculate(5, 2);
		
		Calculable cal2 = new Sub();
		cal2.calculate(5, 7);
		
		
//		cal = new Calculable() {
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println("x-y : " + (x-y));
//			}
//		};
//		cal.calculate(5, 7);

		// 25 ~ 31줄 축약
		// -> 람다식 
		cal = (int x, int y) -> {
				System.out.println("x-y : " + (x-y));
			};
		cal.calculate(15, 7);
		
		// int 생략 가능, 한줄 뿐이면 {}; 생략가능
		cal = (x, y) -> System.out.println("x-y : " + (x-y));
		cal.calculate(17, 7);

		cal = (x,y)->System.out.println("x*y : " + (x*y));
		cal.calculate(5, 5);
	}

}
