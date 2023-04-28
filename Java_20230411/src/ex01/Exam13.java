package ex01;

// 교재 178p 이름붙은 반복문, 이런게 있다 정도로만 알고 패스!

public class Exam13 {

	public static void main(String[] args) {
		
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1;
//					break;
//				continue Loop1;
//				continue;
				System.out.println(i+"*"+ j + "=" + i*j);
			} // end of for i
			System.out.println();
			}
		
		
		
	}

}
