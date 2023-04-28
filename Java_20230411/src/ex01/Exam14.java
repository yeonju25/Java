package ex01;

public class Exam14 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		//for(초기; 검사; 증가)
		do {
			sum += i;
			i++;
		}while(i<=10);
		// 조건식이 거짓이라도 최소한 한 번은 수행한다.
		System.out.println(sum);
		
	}

}
