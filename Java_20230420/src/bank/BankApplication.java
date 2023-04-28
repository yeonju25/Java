package bank;

import java.util.Scanner;

class Account {
	String accNum;
	String accName;
	int credit;
	
	Account (String accNum, String accName, int credit){
		this.accNum = accNum;
		this.accName = accName;
		this.credit = credit;
	}
	
	void accList() {
		System.out.println(accNum + "  " + accName + "  " + credit);
	}
	
	void deposit(int plus) {
		credit += plus;
	}
	
	void withdraw(int minus) {
		credit -= minus;
	}
	
}

public class BankApplication {

	public static void main(String[] args) {
		Account [] ac = new Account[100];
		
		int count = 0; // 계좌 수 
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String accNum;
		String accName;
		int credit;
		
		
		while(flag) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: 
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				System.out.print("계좌번호 : ");
				accNum = sc.nextLine();
				System.out.print("계좌주 : ");
				accName = sc.nextLine();
				System.out.print("초기입금액 : ");
				credit = Integer.parseInt(sc.nextLine());
				ac[count] = new Account(accNum, accName, credit);
				count++;
				break;
			case 2:
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				for(int i=0; i<count; i++) {
					ac[i].accList();
				}
				break;
			case 3:
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");

				System.out.print("계좌번호 : ");
				accNum = sc.nextLine();
				
				for(int i=0; i<count; i++) {
				if(accNum.equals(ac[i].accNum)) {
					System.out.print("예금액 : ");
					int plus = Integer.parseInt(sc.nextLine());
					ac[i].deposit(plus);
					}
				}
				break;
			case 4:
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				
				System.out.print("계좌번호 : ");
				accNum = sc.nextLine();
				
				for(int i=0; i<count; i++) {
					if(accNum.equals(ac[i].accNum)) {
						System.out.print("출금액 : ");
						int minus = Integer.parseInt(sc.nextLine());
						ac[i].withdraw(minus);
					}
				}
				break;
			case 5:
				flag = false;
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
