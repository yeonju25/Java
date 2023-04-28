package ex01;

// 1~100 홀수의 개수?
public class Exam02 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==1)
				count++;
			}
		System.out.println("1번째 홀수 구하기 : 1~100 사이 홀수의 개수 : " + count);

		
		// 이렇게도 할 수 있다.
		count=0;          
		for(int i=1; i<=100; i+=2) {
				count++;  // i=i+2로 써도 됨
		}
		System.out.println("2번째 홀수 구하기 : 1~100 사이 홀수의 개수 : " + count);
		
		
		
		
	}

}
