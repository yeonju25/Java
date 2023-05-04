package ex_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

// 교재 796p 메서드를 람다식으로 변환한 예
// 교재 803p BiFunction

@FunctionalInterface	// 인터페이스 안에 추상메소드가 1개만 있어야 람다식 사용 가능
interface A{
	int max(int a, int b);
}

@FunctionalInterface	// 이게 붙으면 추상메소드 하나만 들어갈 수 있음. 이걸 보면 추상메소드 하나만 쓰겠다는 거구나라고 이해해~
interface B{
	void printVar (String name, int i);
}

interface C{
	int square(int x);
}

interface D{
	int roll();
}

interface E{
	int sumArr(int[] arr);
}


public class ex_Lambda {

	public static void main(String[] args) {
		A aa = (a,b)-> a > b ? a : b;
		System.out.println(aa.max(10, 20));
		
		BiFunction<Integer, Integer, Integer> bi = (a, b) -> a > b ? a : b;
		System.out.println("최대값 : " + bi.apply(11, 25));
		
		
		B bb = (name,i)-> System.out.println(name+"="+i);
		bb.printVar("홍길동", 100);
		
		BiConsumer<String, Integer> bc = (name, age) -> System.out.println(name+"="+age);
		bc.accept("홍길동", 50);
		
		
		C cc = x -> x * x;
		System.out.println(cc.square(5));
		
		
		D dd = () -> (int)(Math.random()*6);
		System.out.println(dd.roll());
		
		Supplier<Integer> ddd = () -> (int)(Math.random()*6);
		System.out.println(ddd.get());
		
		
		E ee = (int[] arr) -> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum; };
			
		int[] ar = { 1, 2, 3, 4 };
		System.out.println(ee.sumArr(ar));	

		Function<int[], Integer > eee = arr -> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum; };
		System.out.println(eee.apply(ar));
		

		
		BiFunction<String, Integer, String> bi2 = (name, age) 
				-> "이름은 "+name+"이고, 나이는 " + age+"세입니다.";
		System.out.println(bi2.apply("홍길동", 20));
		
		List<Integer> nArr = new ArrayList<>();
		nArr.add(10);
		nArr.add(20);
		nArr.add(30);
		nArr.add(40);
		nArr.add(50);
		
		nArr.forEach(t -> {System.out.println(t+100);});
		// forEach(Consumer<? super T> action)
		
	}
}
