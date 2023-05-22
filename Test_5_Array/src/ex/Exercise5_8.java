package ex;

import java.util.Arrays;

public class Exercise5_8 {

	public static void main(String[] args) {
		
		// answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 *를 찍어서 그래프를 그리는 프로그램
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
//			// 각 배열의 값이 1,2,3,4 케이스에 해당되면 counter배열에 1을 더한다.
//			switch(answer[i]) {
//			case 1 : counter[0]++;
//					break;
//			case 2 : counter[1]++;
//					break;
//			case 3 : counter[2]++;
//					break;
//			case 4 : counter[3]++;
//					break;
//			}
			
			counter[answer[i]-1]++;
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			// for문을 통해 counter[i]의 값만큼 *를 출력한다.
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
