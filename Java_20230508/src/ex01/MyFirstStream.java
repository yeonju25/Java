package ex01;
// 교재 815p : 스트림
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFirstStream {

	public static void main(String[] args) {
		int[] ar = {1,2,2,3,4,5,5,6};	// 배열
		
		// 배열의 짝수 합을 구하자. 단, 중복 제거
		
		IntStream stm1 = Arrays.stream(ar);	// 배열 ar로부터 스트림 생성
		//				중복제거			짝수 필터			최종연산
		int total = stm1.distinct().filter(n-> n%2 ==0).sum();
		System.out.println("total : " + total);
		
		// 배열에서 중복 제거 후 홀수 개수는 몇개인가?
		stm1 = Arrays.stream(ar); // 스트림은 일회용, 최종연산 끝나서 위에 꺼 다시 못씀, 다시 만들어야 함
		long count = stm1.distinct().filter(n->n%2 ==1).count();
		System.out.println("홀수 개수 : " + count);
		
		String[] names = {"kim", "park", "hong", "yoon", "kor", "eng", "math"};
		
		//1.이름출력
		Stream<String> stm2 = Arrays.stream(names);
		stm2.forEach(str->System.out.println(str));
		
		System.out.println("-----------");
		//2. 첫 글자가 k만 출력
		stm2 = Arrays.stream(names);
		stm2.filter(name-> name.startsWith("k")).forEach(str->System.out.println(str));
		
		System.out.println("-----------");
		//3. 글자 수가 4자 이상만 출력
		stm2 = Arrays.stream(names);
		stm2.filter(n-> n.length()>= 4).forEach(n->System.out.println(n));

		
		
		//여기까지는 배열만 했고~~ 이제 List로 해보자 
		System.out.println("----------------------------");
	
		List<String> list = Arrays.asList("Toy", "Box", "Robot");
		// list.stream();하고 스트림에 커서두고 ctrl+2 누르고 l 누르면 좌항 생성해줌, 이름만 원하는 대로 바꾸기~
		
		// 1. 리스트를 스트림으로 변환 후 출력
		Stream<String> s = list.stream();
		s.forEach(n-> System.out.println(n));
		
		// 2. 리스트 글자 개수 합을 출력
		s = list.stream();
		long count2 = s.map(n->n.length()).count();
		System.out.println("count2 : " + count);	// count = 스트림 요소 개수 
		
		s = list.stream();
		int sum = s.mapToInt(n->n.length()).sum();	// 맵으로 나온 결과 자체를 숫자로 변환해줌
		System.out.println("sum : " + sum);			// 글자수의 합을 출력
		
		
	}
}
