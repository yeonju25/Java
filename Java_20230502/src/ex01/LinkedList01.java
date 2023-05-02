package ex01;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<Integer> lists = new LinkedList<>();
		
		lists.add(10);
		lists.add(20);
		lists.add(30);
		
//		int num = lists.peek();		// 첫 번째 요소 반환
//		int num = lists.poll();		// 첫 번째 요소를 반환한 후 리스트에서 제거
		int num = lists.remove(); 	// 첫 번째 요소를 제거
		num = lists.remove();
		
		System.out.println(num);
		System.out.println(lists);
	}

}
