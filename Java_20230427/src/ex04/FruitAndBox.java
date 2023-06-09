package ex04;

import ex03.Apple;
import ex03.Orange;

class Apple{
	@Override
	public String toString() {
		return "I am Apple";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am Orange";
	}
}

class Box{	// 사과, 오렌지 담는 박스
	private Object obj; 

	public Object getObj() {
		return obj;
	}
						// 다 받아줄 수 있는 Object 사용
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class FruitAndBox {

	public static void main(String[] args) {
		
		Box aBox = new Box();	// 사과
		Box oBox = new Box();	// 오렌지
	
//		aBox.setObj(new Apple());	// 사과 저장
//		oBox.setObj(new Orange());	// 오렌지 저장
//		Apple ap = (Apple)aBox.getObj();	// 꺼내기
//		Orange op = (Orange)oBox.getObj();	// 형변환해줘야함
//		System.out.println(ap);
//		System.out.println(op);
		// 원래 원하던 건 이 줄 위였음
		
		
		// 그런데 잘못 입력해서 문자열을 이렇게 입력을 해도 잘 돌아가네? 프로그램이 이상하넹......?
		// 타입을 제한해서 타입의 안정성을 높이자! > 제네릭을 쓰자! > ex05
		aBox.setObj("Apple");	
		oBox.setObj("Orange");	
		String ap = (String)aBox.getObj();	
		String op = (String)oBox.getObj();	
		System.out.println(aBox.getObj());
		System.out.println(oBox.getObj());
		
		
	}
}
