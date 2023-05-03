package ex;

import java.util.*;
// 교재 634p
public class HashSetEx4 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));
		
		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
			return false;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
}