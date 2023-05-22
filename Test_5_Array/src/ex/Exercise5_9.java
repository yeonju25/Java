package ex;

public class Exercise5_9 {

	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' ' },
				{'*', '*', ' ', ' ', ' ' },
				{'*', '*', '*', '*', '*' },
				{'*', '*', '*', '*', '*' }
		};
		
		char[][] result = new char[star[0].length][star.length];
		// 크키가 [5][4]인 배열 생성
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
			
		System.out.println();
		
		// i는 4번, j는 5번 돌아가므로 char[5][4] result를 채우려면 j를 행으로 i를 열로 생각해야 함
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				result[j][i]=star[3-i][j];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
