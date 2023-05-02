package ex02;

import java.util.*;

public class ExpValidCheck {

	public static void main(String[] args) {

		if(args.length != 1) { // Run Configurations 들어가서 Arguments에 입력 안하면 밑에 2줄 출력해주고 프로그램 끝.
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];	// expression=args[0]는 내가 Arguments에 입력한 식
		
		System.out.println("experssion:"+expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);	// charAt 문자열 하나를 가져오는 함수
				
				if(ch=='(') {		    // ( 있으면 스택에 ( 넣음
					st.push(ch+""); 
				}else if(ch==')') {		// ) 있으면 스택에서 ( 빼냄
					st.pop();
				}
			}
			if(st.isEmpty()) {			// 스택에 남아있는게 없다 ==> 괄호의 짝이 맞다, 괄호가 일치
				System.out.println("괄호가 일치합니다.");
			}else {						// 스택에 (가 남아있다 ==> 괄호의 짝이 맞지 않다
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}	// try
		
	}
}
