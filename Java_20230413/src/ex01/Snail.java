package ex01;

import java.util.Arrays;

public class Snail {

	public static void main(String[] args) {

		int[][] num = new int[5][5];
		int count = 1;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
			if(i==0) {
				num[i][j] = count++; 
				} else if(j==num.length-1) {
				num[i][j] = count++; 
				} 
			System.out.print(num[i][j] + ", ");
			}
		}
	}

}
