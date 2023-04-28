package ex01;

import java.util.Arrays;

/*
 * 1. 배열 10개 생성 후 랜덤으로 1~100 사이 값을 넣는다.
 * 2. 배열 10개 총점과 평균을 구한다.
 * 3. 배열 10개 최대값, 최소값을 구한다.
 * 4. 배열 10개 오름차순 정렬을 한다.
 */
public class Exam09 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum = 0;
		double average;
		
		// 랜덤 값 넣기, 총점과 평균 구하기
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			sum += arr[i];
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		average = sum/arr.length;
		System.out.printf("평균 : %.2f", average);
	
		System.out.println();
		
		// 최대값 최소값 구하기
		int max, min;
		max = min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("최대값: " + max);
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println("최소값: " + min);
		
		// 오름차순 정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		System.out.print(arr[i] + ", ");
		}
		
		
		
		
		
		
		
	}

}
