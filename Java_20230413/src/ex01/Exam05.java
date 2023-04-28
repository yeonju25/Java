package ex01;

import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {

		
		int[][] num = new int[4][4];
		int count = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(i==j) num[i][j] = ++count;
				System.out.print(num[i][j]+", ");
			}
			System.out.println();
		}		
	}

}
