package ex01;

public class Practice {

	public static void main(String[] args) {

		// 교재 186p 예제 5-1
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;	// score[2] = 70
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];	// int tmp = score[3] + score[4]
		
		// for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i < 5; i++) {
			System.out.println("");
		}
	}

}
