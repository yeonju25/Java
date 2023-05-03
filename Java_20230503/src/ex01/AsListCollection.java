package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		List<String> list2	= Arrays.asList("Toy", "Box", "Robot", "Box");
//		list2.add("bbb"); // 이렇게 직접 추가 안됨
		for(String str : list2)
			System.out.println(str);
		
		System.out.println("-----------------------");
		// 추가하려면 이렇게는 할 수 있다.
		List<String> ls = new ArrayList<>(list2);
		ls.add("bbb");
		
		for(String str : ls)
			System.out.println(str);
	}

}
