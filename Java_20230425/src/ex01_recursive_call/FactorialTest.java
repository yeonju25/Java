package ex01_recursive_call;

// 교재 270p 재귀호출
// 교재 271p 예제 6-15

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	static int factorial(int n) {
		int result = 0;
		
		if(n==1)
			return 1;
		else 
			result = n*factorial(n-1);
		
		return result;
	}

}
