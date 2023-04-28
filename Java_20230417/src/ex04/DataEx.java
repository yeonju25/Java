package ex04;
// 교재 264p 예제 6-9
class Data { int x; }

public class DataEx {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
