package ex01;

public class Exam01 {

	public static void main(String[] args) {

		//1~10 합 누적
		int total = 0;
		for(int i=1; i<=10; i++)
			  //초기화; 조건식; 증감식
			total += i;
		      //수행될 문장;
		
		System.out.println("1~10까지 합 : " + total);
		
//		int total = 0;
//		int num = 10;
//		for(int i=1; i<=num; i++)
//			total += i;
//		System.out.println("1~" + num + "까지 합 : " + total);
		
//		int sum = 0;
//		int i = 1; // 여기에 초기화를 했기 때문에 for문 안에 i 초기값 생략 가능
//		for( ; i<=10; i++) {
//			sum += 1;
//			System.out.println(sum);
//		}
		
		
		
		//1~100 2와 3의 공배수 출력
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + ", ");		
				count++;
			}	
		}
		System.out.println("\n1~100에서 2와 3의 공배수 개수는 : " + count);
		
		
		
		
	}

}
