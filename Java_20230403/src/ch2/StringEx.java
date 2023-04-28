package ch2;

public class StringEx {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);	
		System.out.println(7 + 7 + 7 + "" + 7 + 7);
		System.out.println("" + (7 + 7));
		
		System.out.println("aaaaaa");
		System.out.println("bbbbbb");
		System.out.println("-----------");
		System.out.print("aaa\naaa");
		System.out.print("bbbbbb\n");
		 // In이 줄바꿈을 시켜줌
		
		
		int n = 15;
		System.out.printf("A : %d B : %d C : %d\n",10,20,30);
		System.out.printf("%o, %d, %x\n",n ,n ,n); // \n 줄바꿈
                      
		
		// %o 8진법, %d 10진법, %x 16진법
		
		double d2 = 10.52456;
		System.out.println(d2);
		System.out.printf("%.2f", d2); // 소수점 2자리까지만 보여달란 뜻
		
		
		System.out.println("------------------");
		int finger = 10;
		System.out.printf("finger : %d\n", finger);
		System.out.printf("finger : [%5d]\n", finger);
		System.out.printf("finger : [%-5d]\n",finger);
		
		System.out.println("------------------");
		
		
	}

}
