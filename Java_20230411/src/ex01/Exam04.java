package ex01;

/*
 
     +
    ++
   +++
  ++++
 +++++
 
 행 : 5  
 열 : ?
 
 */

public class Exam04 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) { // i = 0,1,2,3,4
			for(int j=4; j>=0; j--) // 필요한 j = 0,1,2,3,4
				if(j<i+1)
				System.out.print("+");
				else
				System.out.print("_");
			System.out.println();
		}
		
		
//		// 선생님 식
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j<4-i)
//					System.out.print(" ");
//				else
//					System.out.print("+");
//			}
//			System.out.println();
//		}
		
		
		
		
	}

}
