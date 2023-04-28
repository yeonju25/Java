package ex01;

import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {

		int[] n = new int[5];
		// 2차원 배열
		int[][] num = new int[4][3];
		num[2][1] = 100;
		
		
//		int[][] num2 = {
//				{1,2,3,3},
//				{4,5,6,6},
//				{7,8,9,9}
//		};
//		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(num2[i][j]+ ", ");
//			}
//			System.out.println();
//		}
		
		int[][] num2 = {
				{1,2,3,3},     //4 num2[0]
				{4,5,6,6,5},   //5 num2[1]
				{7,8,9,9,8,9}  //6 num2[2]
		};
		
		// num2[i].length i행 배열의 길이 이용해서 구하기
		for(int i=0; i<3; i++) {
			for(int j=0; j<num2[i].length; j++) {
				System.out.print(num2[i][j]+ ", ");
			}
			System.out.println();
		}
		
		// 4행 4열 2차원 배열에서 대각선으로 1234 나오게 만들기 (대각선 빙고 한줄)
		int[][] num3 = new int[4][4];
		int count = 0;
		for (int i=0; i<num3.length; i++) {
			for(int j=0; j<num3.length; j++) {
				if(i == j) {
					num3[i][j] = ++count;
				}
				System.out.print(num3[i][j]);
			}
			System.out.println();
		}
		

		
		
	}

}
