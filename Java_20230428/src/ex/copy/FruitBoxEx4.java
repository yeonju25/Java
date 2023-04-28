package ex.copy;

import java.util.*;
// 교재 681p 예제 12-4
class Fruit {
	String name;
	int weight;
	
	Fruit(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
}

class Apple extends Fruit {
	Apple(String name, int weight) {
		super(name, weight);
	}
}

class Grape extends Fruit {
	Grape(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape> {
	public int compare(Grape t1, Grape t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit> {
	public int compare(Fruit t1, Fruit t2) {
		return t2.weight - t1.weight;
	}
}

class FruitBox <T extends Fruit> extends Box<T>	{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() { return list; }
	int size() { return list.size(); }

	public String toString() {
		return list.toString();
	}
	
}
public class FruitBoxEx4 {

	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		appleBox.add(new Apple("GreenApple", 300));
		appleBox.add(new Apple("GreenApple", 200));
		appleBox.add(new Apple("GreenApple", 100));
		
		grapeBox.add(new Grape("GreenGrape", 400));
		grapeBox.add(new Grape("GreenGrape", 300));
		grapeBox.add(new Grape("GreenGrape", 200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}

}
