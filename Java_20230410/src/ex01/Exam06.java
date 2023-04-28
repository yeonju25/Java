package ex01;

public class Exam06 {

	public static void main(String[] args) {
		// 1~100까지 합
		int sum = 0;
		
		for(int i=1; i<=100; i++) // 1~100 회전
			sum = sum + i;	      // i값을 계속 sum에 누적
		System.out.println("1~100까지 합 : " + sum); // for 벗어나면 실행
		
		
	}

}
