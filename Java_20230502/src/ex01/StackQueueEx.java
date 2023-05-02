package ex01;

import java.util.*;

public class StackQueueEx {

	public static void main(String[] args) {
		// 자바에서 Stack은 Stack클래스로 구현하여 제공하고 있지만, 큐는 인터페이스로만 정의해놓고 별도의 클래스 제공 X
		Stack st = new Stack();			
		Queue q = new LinkedList();	// Queue 인터페이스의 구현체인 LinkedList 사용

		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

}
