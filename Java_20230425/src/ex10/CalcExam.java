package ex10;

public class CalcExam {

	public static void main(String[] args) {

		Calc add = new Add();
		int result = add.calculate(10, 10);
		System.out.println(result);
		
		Calc sub = new Sub();
		result = sub.calculate(5, 10);
		System.out.println(result);
		
		System.out.println("----------익명객체----------");
		
		
		Calc add1 = new Calc() {
			@Override
			public int calculate(int x, int y) {
				return x+y;
			}
		};
		
		result = add1.calculate(5, 2);
		System.out.println(result);
		
		
		Calc mul = new Calc() {
			@Override
			public int calculate(int x, int y) {
				return x*y;
			}
		};
		result = mul.calculate(2, 7);
		System.out.println(result);
		
		System.out.println("-----------람다식-----------");
		
		// 람다식은 인터페이스 내에 추상메소드가 하나만 있을 때 사용가능
		// 여기는 Calc 안에 있는 메소드 calculate의 바디부분을 채워주는 내용이 오면 된다
		Calc sub1 = (x,y) -> {return x-y;};
						// 한줄이면 {} 생략가능, {} 생략하면 return도 생략
		Calc sub2 = (x,y) -> x-y;
		result = sub1.calculate(5, 2);
		System.out.println(result);
		
		
	}
}