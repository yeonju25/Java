package ex01;

public class Exam06 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		//for(초기; 검사; 증가)
		while(i<10) {
			i++;
			sum += i;
		}
		
//		while(i++<10)
//			sum += i; 
		// 이렇게 축약할 수도 있다. 선생님은 위의 식처럼 풀어 쓰는게 더 보기 좋다고 하셨음!
		System.out.println("sum : " + sum);
		
		

		System.out.println("=======================");
		// 구구단 출력
		int k=2;
		int m=1;
		
		while(k<=9) {
			m = 1; // m을 1로 다시 지정!
			// 한번 쭉 돌면 m은 9까지 완료가 돼서 m을 다시 1로 만들어줘야 다시 반복할 수 있음
			while(m<=9) {
				System.out.printf("%d x %d = %d\n",k,m,k*m);
				m++;
			}
			k++;
		}
		
		System.out.println("=======================");
		i = 5;
		while(i-- != 0) {
			System.out.println(i + " - I can do it");
		}
		
		
	}

}
