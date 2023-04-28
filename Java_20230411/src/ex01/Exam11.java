package ex01;

/*
break, continue
 */

public class Exam11 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
			
//				if(i==j) continue; // 2X2, 3X3 등은 출력하지 않을 때
//				System.out.println(i+"x"+j+"="+i*j);

				System.out.println(i+"x"+j+"="+i*j);
				if(i==j) break; // 2단은 2개, 3단은 3개 이렇게 출력하고 싶을 때
			}
		}
			
		System.out.println("프로그램 종료");
	}

}
