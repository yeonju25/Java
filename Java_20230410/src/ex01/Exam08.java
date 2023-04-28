package ex01;

public class Exam08 {

/* 
 * 1 + (-2) + 3 + (-4) + ... 이런식으로 더해나갈 때,
 * 몇까지 더해야 총합이 100이상 될까? i값과 총합을 출력
 */
	public static void main(String[] args) {
		//선생님 식
		int sum = 0;
		int sign = 1;
		int tmp = 0;

		for (int i =1; true; i++, sign = -sign) {
			tmp = sign * i;
			sum += tmp;
			if (sum >= 100) break; 
		}
		System.out.println("tmp : " + tmp + " sum : " + sum);

	}

}
