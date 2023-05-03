package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 정렬 기준을 넣을거야
class Person implements Comparable<Person> {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}

	// 나이 순으로 정렬할거야
	@Override
	public int compareTo(Person p) {
		return this.age-p.age;
	}
}

class PersonComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age-o2.age;
	}
}

public class ComparatorPerson {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("kim",25));
		list.add(new Person("park",40));
		list.add(new Person("yoon",35));
		list.add(new Person("hong",32));
		
		//Collections.sort(list); 기본자료형만 sort
		//Collections.sort(list, null); 뒤에는 정렬 기준을 넣을 수 있다.
//		Collections.sort(list, new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.age - o2.age;
//			}
//		});		// 익명 클래스 사용한 것
		
		Collections.sort(list, (o1,o2)-> o1.age - o2.age);   // 람다식 사용
//		Collections.sort(list, (o1,o2)-> o1.name.length() - o2.name.length());   // 람다식 사용
		
		
//		Collections.sort(list, new PersonComparator());		 // 만들어둔 클래스 사용
		
		for(Person p : list)
			System.out.println(p);
		
		System.out.println("-------------------------------------");
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(55);
		list2.add(8);
		list2.add(99);
		list2.add(1);
		Collections.sort(list2);
		for(int p : list2)
			System.out.println(p);
	}

}
