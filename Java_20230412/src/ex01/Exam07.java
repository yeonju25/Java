package ex01;

/*
 * 로또 프로그램 만들기
 */
public class Exam07 {

	public static void main(String[] args) {
//		int[] lotto = new int[6];
//		
//		
////		for(int i=0; i<lotto.length; i++) {
////			lotto[i] = (int)(Math.random()*45+1);
////		}
//		
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45+1);	// 번호 뽑기
//			
//			for(int j=1; j<lotto.length; j++) {		// 중복 확인
//				if(lotto[i] == lotto[j]) {
//					i--;
//				}
//			System.out.println(lotto[i]+ ", ");
//			
//			}
//		}
		
		//선생님 코드, 숫자 45개를 생성 후 섞고 가장 앞 6자리 추출하는 방법
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1; // 인덱스 45개 생성 후 1~45 숫자 값 차례대로 담았다 생각
		
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45); // 숫자를 막 섞어
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = tmp;
		}
		System.out.println("이번 주 로또 번호는 : ");
		for(int i=0; i<6; i++) // 섞은 것 중에서 앞에서 6개 뽑아
			System.out.print(lotto[i] + ", ");
		
		
		
		
		
	}

}
