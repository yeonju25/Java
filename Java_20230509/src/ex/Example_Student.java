package ex;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Example_Student {

	private static Student[] students = {
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	};

	
	// avg 영역 작성해보는 문제.
//	private static double avg(Function<Student> f) { // 만들어둔 펑션 인터페이스 쓴거
	private static double avg(Function<Student, Integer> f) { // 자바에 있는 Function 가져다 쓴거
		int sum = 0;
		for(Student student : students)
			sum += f.apply(student);
		return (double)sum/students.length;
	};
	
	
	public static void main(String[] args) {
		
		double englishAvg = avg(s-> s.getEnglishScore());
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg(s-> s.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);
	}
	

}
