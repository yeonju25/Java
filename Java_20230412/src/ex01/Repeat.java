package ex01;

public class Repeat {

	public static void main(String[] args) {

		// 조원 3명 자바점수 랜덤 / 범위 50~100 / 총점과 평균까지 출력
		int[] group = new int[3];  // 조원 수가 바뀌어도 출력 가능하도록 만들었음
		int sum = 0;
		double average;
		
		for(int i=0; i<group.length; i++) {
			int score = (int)(Math.random()*50+1)+50;
			sum = sum + score;
			System.out.print(score + ", ");
		}
		System.out.println();
		
		average = sum/group.length;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f" , average);
		
		System.out.println();
		System.out.println("---------------------------------------");
		
		/*
		1. int 배열 10개 생성
		2. 랜덤함수 이용해서 10개 초기화
		3. 최대값, 최소값 출력
		 */		
		
		int[] num = new int[10];
		int max, min;
		// 랜덤 숫자 받기 1~100 사이
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.print(num[i] + ", ");
		}
		
		for(int i=0; i<num.length; i++) {
			max = min = num[0];
//			for(int j=i; j<num.length; j++) {
				if(num[i]>max) {
					num[i] = max;
				}
//			}
		}
		System.out.println();
		
	}

}
