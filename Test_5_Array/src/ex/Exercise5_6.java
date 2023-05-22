package ex;

public class Exercise5_6 {

	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = { 500, 100, 50, 10 };
		
		int money = 2680;
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			
			// 동전의 개수를 셀 count / while문을 통해 money가 동전금액보다 더 크면 계속 거슬러줌
			int count = 0;
			while(money >= coinUnit[i]) { 
			money -= coinUnit[i];
			count++;
			}
			
			System.out.println(coinUnit[i]+"원 : "+count);
		}
	}
}
