package ex02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public int hashCode() {
		return num%3;
	}
	@Override
	public boolean equals(Object obj) {
//		if (num == ((Num)obj).num)
//			return true;
//		else return false;	
		
		// if else인데 리턴이 true false다? >> 바로 삼항연산자 ㄱㄱ
		return num == ((Num)obj).num ? true : false;
	}
	
}
public class HashSetCollection {

	public static void main(String[] args) {
		
		Set<Num> set = new HashSet<>(); // 중복x, 순서x
		// 기본자료형은 중복체크 가능하지만, 클래스로 만든 것은 중복체크 못해주고 있음. >> 해시코드 오버라이딩해서 해줘야 함.
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(20));
		set.add(new Num(20));
		
		for(Num s : set)
			System.out.println(s);
		
		// 로또 숫자 추첨 만들기
		System.out.println("--------------------------------");
		Set<Integer> set2 = new HashSet();
		for(int i=0; set2.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		for(int s : set2)
			System.out.print(s+", ");
	}

}
