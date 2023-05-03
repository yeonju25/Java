package ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(5, "kim");
		map.put(10, "park");
		map.put(9, "yoon");
		map.put(10, "hong");
		map.put(8, "park");
		map.put(1, "kim");
		// Value의 중복은 허용, Key의 중복은 X

		System.out.println(map);
		System.out.println(map.get(9)); // key 9에 있는 value값 얻기
//		map.clear();		// 전부 삭제
		map.remove(9);		// key가 9인 것 삭제
		System.out.println(map);
		System.out.println("--------------------------");
		
		Set<Integer> set = map.keySet(); // 맵이 가지고 있는 key값만 set에 넣어주겠다.
		for(int n : set) {
			System.out.println(n);
		}
		System.out.println("----------------------------");
		for(int n : set) {
			System.out.println(map.get(n));
		}
	}

}
