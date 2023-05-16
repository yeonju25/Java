package exam;

public class Exercise4_6 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		int[] dice1 = {1,2,3,4,5,6};
		int[] dice2 = {1,2,3,4,5,6};
		int j=0;
		for(int i=0; i<dice1.length; i++) {
			if(dice1[i]+dice2[j] == 6) {
				System.out.println(dice1[i]+","+dice2[j]);
			} 
		}
	}

}
