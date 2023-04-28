package ex01;

import java.util.Arrays;

public class A1 {

	public static void main(String[] args) {

		String[] players = {"mumu","soe","poe","kai","mine"};
		String[] callings = {"kai","kai","mine","mine"};
		

		for(int j=0; j<callings.length; j++) {
		 for(int i=0; i<players.length; i++) {
				 if(players[i]==callings[j]) {
					 String tmp = players[i-1];
					 players[i-1]=players[i];
					 players[i] = tmp;
				 }	 
				 System.out.println(Arrays.toString(players));
			 }
		 }
		
		
		
		
		
		
		
		
		
	}
}
	
