package ex01;

public class Exam07 {

/* 
 * 1 + (-2) + 3 + (-4) + ... 이런식으로 더해나갈 때,
 * 몇까지 더해야 총합이 100이상 될까? i값과 총합을 출력
 */
	public static void main(String[] args) {
		//선생님 식
		int i = 0;
		int sum = 0;

		for ( ; ; i++) {
			if (i % 2 == 1)
				sum += i;
			else
				sum -= i;
			if (sum >= 100) break; // 위에 조건식이 없으므로 for문 계속 반복됨, 
			                       //sum이 100이상 될 때 break로 벗어나도록 if문을 쓴 것 
		}
		System.out.println("i : " + i + " sum : " + sum);

	}

}
