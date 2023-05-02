package ex01.copy;

import java.util.*;

class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ArrayList01 {
	
	public static void main(String[] args) {
		
//		배열 예시 : 타입이 정해져 있다. int면 정수형만 와야한다는둥
//		int[] num = new int[5];
//		num[0] = 정수형;
		
//		ArrayList도 타입을 꼭 지정해줘야 함, 지정안하고 아무거나 넣어서 쓸수있지만... 지정해서 쓰는게 원칙
//		아무거나 넣어서 쓰려면 타입 자리에 Object 넣어서 쓸 수 있긴 함
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
//		list1.add(new String("kor"));
//		list1.add(new Member("로이", 123)	);
		list1.add(30);
		list1.add(40);
		list1.add(20);
		list1.add(50);

		
		System.out.println("size : "+ list1.size());
		
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
		System.out.println("---------------------------");
		Collections.sort(list1);
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
		
	}
}
