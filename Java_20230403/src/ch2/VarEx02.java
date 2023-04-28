package ch2;

public class VarEx02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("x : " + x); // ctrl+alt+아래방향키하면 아래쪽에 복사됨
		System.out.println("y : " + y);
		System.out.println("--------------------");
		
		int tmp = x; // tmp에도 10 / x에도 10
		x = y;      // x에 y의 20을 덧씌움
		y = tmp;    // tmp에 옮겨둔 10을 y에 덧씌움
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		// 교재 23p 내용

		
	}

}
