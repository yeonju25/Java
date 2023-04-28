package ex01;

/*
1. int 배열 10개 생성
2. 랜덤함수 이용해서 10개 초기화
3. 오름차순 정렬 / 교재 202~204p 참고
 */
public class Exam06 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100+1);
			System.out.print(num[i] + ", ");
		}
		System.out.println();
		
		System.out.println("오름차순 정렬!!!");
		
//		int min = num[0];
//		
//		for(int i=0; i<num.length; i++) {
//			if(num[i]<min) {
//				min = num[i];
//			}
//		}
//		System.out.print(min);
//
//		for(int i=0; i<num.length; i++) {
//			if(num[i]==min) {
//				continue;
//			} else if 
//		}


		for(int i=0; i<num.length; i++) {
			for(int j=i; j<num.length; j++) { // j=i+1;로 하면 같은 인덱스끼리 비교하는 과정 생략돼서 더 깔끔
 				if(num[i]>num[j]) {
//			for(int j=0; j<num.length; j++) {
//				if(num[i]<num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + ", ");
		
		
	}

}
