package exam;

public class Exercise4_6 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성
		int[] dice1 = {1,2,3,4,5,6};
		int[] dice2 = {1,2,3,4,5,6};
	
		// 반복문을 2개 이용해서 dice1의 값 하나마다 dice2 전체를 하나하나 더해본다. 두 주사위의 합이 6일 경우 해당 값 출력.
		for(int i=0; i<dice1.length; i++) {
			for(int j=0; j<dice2.length; j++) {
			if(dice1[i]+dice2[j] == 6) {
				System.out.println(dice1[i]+","+dice2[j]);
				}
			} 
		}
		
	}
}
