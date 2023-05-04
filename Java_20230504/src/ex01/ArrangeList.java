package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {

	public static void main(String[] args) {
		
		List<Integer> is = Arrays.asList(1,3,5,7,9); // Arrays.asList는 static으로 이미 올라가 있어서 값만 넣어줄 수 있다. new없이도...
//		is.add(10); // 에러. Arrays.asList는 추가나 삭제가 불가능.
		// 추가하고 싶어 > ArrayList
		// 설명한 블로그 : https://tecoble.techcourse.co.kr/post/2020-05-18-ArrayList-vs-Arrays.asList/
		is = new ArrayList<>(is);
		is.add(11);
		
		System.out.println(is);
		
		
		// 교재 812p 람다식 더 간결하게 표현하기
//		Consumer<List<Integer>> c = t -> Collections.reverse(t);
		Consumer<List<Integer>> c = Collections::reverse;
		c.accept(is);
		System.out.println(is);
		
	}

}
