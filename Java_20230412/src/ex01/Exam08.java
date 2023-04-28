package ex01;

import java.util.Arrays;

/*
 * 로또 프로그램 만들기 // 교재 199p 예제 5-8과 비슷한 문제
 */ // 선생님이 인터넷에서 가져와서 수정하신 소스
public class Exam08 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		// 랜덤번호 생성
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			// 중복번호 제거
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	
		// 오름차순 정렬
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	
		// 랜덤번호 출력
		System.out.println("* 로또번호 : " + Arrays.toString(lotto));
		
		
	}

}
