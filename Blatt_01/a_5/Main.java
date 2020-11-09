package a_5;

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
		
		int m = s / 60;
		s = s - (m*60);
		int h = m / 60;
		m = m - (h*60);
		
		System.out.println(h + ":" + m + ":" + s);
		scanner.close();
	}
}
