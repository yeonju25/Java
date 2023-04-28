package ch2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("두자리 정수를 하나 입력해주세요.>");
	String input = sc.nextLine();
	
	System.out.printf(input);
	}
}