package ex;

public class Exercise5_7 {
	// 어려워서 잠깐 보류~
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : jaba Exersise5_7 3120");
			System.exit(0);
		}
		
		// 문자열을 숫자로 변환. 입력한 값이 숫자가 아닐 경우 예외가 발생
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money=" +  money);
		
		int[] coinUnit = { 500, 100, 50, 10 };	// 동전의 단위
		int[]	coin = { 5, 5, 5, 5 };			// 단위별 동전의 개수
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
		}
		
	}
}
