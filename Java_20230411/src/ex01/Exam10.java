package ex01;

/*
break, continue
 */

public class Exam10 {

	public static void main(String[] args) {
		//홀수만 출력하기		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) continue; // continue; 조건이 참이면 다음 라인 넘어가지 않고 다시 for문으로 올라감, 거짓이면 다음 라인 실행 
//			if(i%2 == 1) 랑 동일
			System.out.println(i);			
		}
		System.out.println("프로그램 종료");
	}

}
