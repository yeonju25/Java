package ex01;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {

		int [] arrNum = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(arrNum));
		
		// arrNum이 배열 길이가 5라서 부족하다. 10으로 증가하고 싶다.
		int[] arrNum2 = new int[10];
		
		for(int i=0; i<arrNum.length; i++) { //arrNum 내용을 arrNum2로 복사
			arrNum2[i] = arrNum[i];
		}	
		System.out.println(Arrays.toString(arrNum2));
		
		arrNum = arrNum2; // 10개 짜리 arrNum2를 대입해서 10개로 증가!
		System.out.println(Arrays.toString(arrNum));
		
		int[] tmp = new int[10];
		
		tmp = arrNum; // arrNum의 주소값을 tmp에 복사, 따라서 arrNum과 tmp는 같은 배열 공간을 참조한다.
		
		System.out.println(Arrays.toString(tmp));
		
		arrNum[3] = 100; // 값을 복사한 게 아니라 같은 주소값을 쓰는게 맞는지 확인하려고 값을 변경해봄
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(tmp));
		System.out.println("----------------------------------");
		
		
		// 교재 194p 배열의 복사
		int [] arr = {10,20,30,40,50};
		int [] arr2 = new int[10];
		System.arraycopy(arr, 0, arr2, 3, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

}
