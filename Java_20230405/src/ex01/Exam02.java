package ex01;

public class Exam02 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = 10;
	//  byte < short < int < long    < float < double
	//  =====> 자동 형변환
    //  연산이나 대입할 때 타입이 일치하지 않으면 실행이 안된다.
	//  따라서 먼저 타입을 일치시킨다. 타입을 일치시킬 때 형변환이 발생한다.
		
		d = score;
	//	d = (double)score;
		System.out.println(d);
		d = 85.4;

		score = (int)d;
		
		System.out.println(score);
		
		int sum = 2147483647;
		long longsum = 2147483648l; // 뒤에 l 붙어야함, 안붙으면 기본적으로 값을 int로 간주함
	
		sum = (int)longsum;
		System.out.println(sum);
		
		
//		longsum = sum;
//		System.out.println(longsum);
		
		System.out.println(5/2);     // 정수형이므로 2만 출력
		System.out.println(5/2.0);   // 2.0이 실수, 2.5로 출력
		System.out.println(5/(double)2); // double로 실수 만들기, 2.5로 출력
		System.out.println(5%2);       // %는 나누고 남은 나머지를 출력
		
		
		System.out.println(5&2);  /* 0101 
                                     0010
                                   --------
                                     0000 해서 답이 0 */
		
		
		System.out.println(5|2);  /* 0101
		                             0010
		                            ------
		                             0111 해서 답이 7 */
		
		
		
	}

}
