package ex01;

// 3이상 4462 이하에서 짝수인 정수의 합

public class Exam04 {

	public static void main(String[] args) {

		int sum = 0;
		
		int i;
		
		for (i = 3; i <= 4462; i++) {
			if(i%2 == 0)
				sum = sum + i;
		}
		System.out.println("합 : " + sum);

//		//선생님 식
//		for (int i = 1; i < 5000; i++) {
//			if (3 <= i && i <= 4462 && i % 2 == 0)
//				sum += i;
//		}
//		System.out.println("합 : " + sum);
		
	}

}
