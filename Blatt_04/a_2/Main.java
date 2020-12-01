package a_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String zeile = new String();
		zeile = scanner.nextLine();
		int s = 0;
		
		try {
			s = Integer.valueOf(zeile);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Es muss eine Zahl eingegeben werden!");
		}
		
		boolean fertig = false;
		
		while(!fertig) {
			int stelle = 10;
			int i=0;
			
			while(s%stelle != 0) {
				s++;
				i++;
			}
			
			
		}
		
		
	}

}
