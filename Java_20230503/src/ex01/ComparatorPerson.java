package ex01;

import java.util.TreeSet;

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
		return this.age - p.age;
	}
}
public class ComparatorPerson {

	public static void main(String[] args) {
		TreeSet<Person> list = new TreeSet<>();
		list.add(new Person("kim",25));
		list.add(new Person("park",21));
		list.add(new Person("yoon",35));
		list.add(new Person("hong",32));
		
		for(Person p : list)
			System.out.println(p);
	}

}
