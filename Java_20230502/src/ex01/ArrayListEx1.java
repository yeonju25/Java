package ex01;

import java.util.*;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));	// Integer 안쓰고 그냥 5 써도 됨
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1, list2);
		
		Collections.sort(list1);	// list1과 list2를 정렬한다.
		Collections.sort(list2);	// Collections.sort(List 1)
		print(list1, list2);

		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 3번째 칸에 A를 추가하니까 B,C가 뒤로 밀림
		print(list1, list2);

		list2.set(3, "AA");	// set은 그 칸의 값을 바꿈
		print(list1, list2);

		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2)); // retainAll 공통된 것만 남기고 나머지는 삭제
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0; i--) { // 뒤에서부터 지우는 이유 : 삭제하면 앞으로 자리를 당기니까 체크를 못하는 자리가 생길 수 있음.
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		list2.remove(1);	// index값으로 하나를 지움, 1번 자리에 있는 값을 지우고 뒤에 있는 것들 자리를 앞으로 당김.
		print(list1, list2);
	}	// main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
