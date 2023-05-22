package ex;

public class Exercise5_4 {

	public static void main(String[] args) {
		int[][]	arr = {
			{ 5, 5, 5, 5, 5 },
			{ 10, 10, 10, 10, 10 },
			{ 20, 20, 20, 20, 20 },
			{ 30, 30, 30, 30, 30 }
		};
		
		int total = 0;
		float average = 0;
		
		//  arr에 담긴 모든 값의 총합과 평균을 구하기.
		// count변수를 하나 지정하고 for문을 돌려 배열 내 모든 값을 더함과 동시에 배열 값의 개수를 count한다.
		float count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += (int)arr[i][j];
				count++;
			}
		}
		// 배열의 각 값을 더한 total, 배열의 담긴 값의 개수인 count
		average = total/count;
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}