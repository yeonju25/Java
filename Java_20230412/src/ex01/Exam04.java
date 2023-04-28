package ex01;

/*
1. int 배열 10개 생성
2. 랜덤함수 이용해서 10개 초기화
3. 최대값, 최소값 출력
 */
public class Exam04 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int max;
		int min;
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100+1);
			}
		
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.println();
		
		max = min = num[0];
		// 최대값 구하기
		for(int i=0; i<num.length; i++) {
			if(num[i] > max)
				max = num[i];
		}
		
		System.out.println("max = " + max);
		// 최소값 구하기
		for(int i=0; i<num.length; i++) {
			if(num[i] < min)
				min = num[i];
		}
		
		System.out.println("min = " + min);
		
	}

}
