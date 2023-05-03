package ex;

import java.util.TreeSet;
// 교재 642p
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("car");
		set.add("dance");
		set.add("elephant");
		set.add("flower");
		set.add("alien");
		set.add("Car");
		set.add("dZZZZ");
		set.add("elevator");
		set.add("bat");
		set.add("disc");
		set.add("dzzzz");
		set.add("fan");
		
		System.out.println(set);
		System.out.println("range search : from" + from + " to" + to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		
	}	

}
