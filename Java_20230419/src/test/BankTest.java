package test;

import java.util.Scanner;

class Account {
   String accNum;    //계좌번호
   String accName;   //계좌주
   int deposit;      //입금액 
}

class BankApplication{
   Account[] ac = new Account[100];
}

public class BankTest {

   public static void main(String[] args) {

      String n;
      String accNum;
      int count = 0;

      BankApplication ba = new BankApplication();
      
      for(int i=0; i<ba.ac.length;i++) {
         ba.ac[i] = new Account();
      }

      
      System.out.println("-----------------------------------");
      System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
      System.out.println("-----------------------------------");
      
      do {
         System.out.print("선택>");
         Scanner sc = new Scanner(System.in);
         n = sc.nextLine();
   
         switch (n) {
         
         case "1" :
            System.out.println("------");
            System.out.println("계좌생성");            
            System.out.println("------");
            System.out.print("계좌번호: ");
      
            ba.ac[count].accNum = sc.nextLine();
            System.out.print("계좌주: ");
            ba.ac[count].accName = sc.nextLine();
            System.out.print("초기입금액: ");
            ba.ac[count].deposit = Integer.parseInt(sc.nextLine()); 
            System.out.println("결과: 계좌가 생성되었습니다.");
         
            count++;
            break;
            
         case "2" :
            System.out.println("------");
            System.out.println("계좌목록");            
            System.out.println("------");
            
            for(int i=0; i<count; i++) {
               System.out.println(ba.ac[i].accNum + "   " + ba.ac[i].accName + "   " + ba.ac[i].deposit );
            }
            break;
            
         case "3" :
            System.out.println("------");
            System.out.println("예금");            
            System.out.println("------");
            System.out.print("계좌번호:");
            
            accNum = sc.nextLine();
        
            for(int i=0; i<count; i++) {
               if(ba.ac[i].accNum.equals(accNum)) {
                  System.out.print("예금액:");
                  int deposit = Integer.parseInt(sc.nextLine());
                  ba.ac[i].deposit =  ba.ac[i].deposit + deposit;
               } 
            }
            break;
            
         case "4" :
            System.out.println("------");
            System.out.println("출금");            
            System.out.println("------");
            System.out.print("계좌번호:");
            
            accNum = sc.nextLine();
            
            for(int i=0; i<count; i++) {
               if(ba.ac[i].accNum.equals(accNum)) {
                  System.out.print("출금액:");
                  int deposit = Integer.parseInt(sc.nextLine());
                  ba.ac[i].deposit =  ba.ac[i].deposit - deposit;
                  System.out.println("결과: 출금이 성공되었습니다.");
               } 
            }
            break;
         }
      } while(!n.equals("5"));    
      System.out.println("프로그램 종료");
   }
}