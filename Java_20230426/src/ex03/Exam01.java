package ex03;

public class Exam01 {

	public static void main(String[] args) {
		
		String[] arr = { "100", "KOR", "300" };
		for(int i=0; i<arr.length+1; i++) {
			try {
					int value = Integer.parseInt(arr[i]);
					System.out.println(value);
					
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("배열 크기를 벗어났습니다.");
			}catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.println("숫자가 아닌 문자는 숫자로 변환이 불가합니다.");
			}catch(Exception e) {
				System.out.println("모든 예외 처리는 내가 한다.");
			}finally {
				System.out.println("예외 여부에 관계없이 무조건 처리해야 되는 문장은 여기다 기입");
			}
		}
		System.out.println("프로그램 종료");
	}
}
