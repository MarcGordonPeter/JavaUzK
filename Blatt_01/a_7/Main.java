package a_7;

import java.util.Scanner;

public class Main {
		
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String zeile = new String();
		zeile = scanner.nextLine();
		int zahl = 0;
		
		try {
			zahl = Integer.valueOf(zeile);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Es muss eine Zahl eingegeben werden!");
		}
		
		System.out.println("Betrag: " + (int)(Math.sqrt(zahl*zahl)));
		
		System.out.println("Quadrat: " + (int)(zahl*zahl));
		
		if ((2*(zahl / 2)) == (zahl)) {
			System.out.println("Die eingegebene Zahl ist gerade.");
		} else {
			System.out.println("Die eingegebene Zahl ist ungerade.");
		}
		
		System.out.println();
		scanner.close();
	}
}

