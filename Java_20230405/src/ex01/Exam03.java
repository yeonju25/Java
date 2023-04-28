package ex01;

public class Exam03 {

	public static void main(String[] args) {
	/*	int num = 1;
		int sum = 0;
		int tmp = 0;
		
	//  num = num+1;
	//	num += 1;  
	//  num = +1; 하면 그냥 1이 나옴, +1을 더해서 나오게 하고싶으면 = 앞에 + 기호 사용
	//  아래 num++; ++num;과 같음
		num++;
		++num;
		
		System.out.println(num); */
		
		int num = 10;
		int sum = 0;
		int tmp = 0;
		
		tmp = ++num;  // 1) num = num+1   2) tmp = num
		sum = num++;  // 1) sum = num     2) num = num+1
		
		System.out.println("tmp : " + tmp);
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
		
		

	}

}
