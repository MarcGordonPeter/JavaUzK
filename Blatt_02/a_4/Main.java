package a_4;

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
		
		if ((zahl % 4) == 0) {
			if ((zahl % 100) == 0) {
				if ((zahl % 400) == 0) {
					System.out.print("Das eingegebene Jahr ist ein Schaltjahr.");
				} else {
					System.out.print("Das eingegebene Jahr ist kein Schaltjahr.");
				}
			} else {
				System.out.print("Das eingegebene Jahr ist ein Schaltjahr.");
			}
		} else {
			System.out.print("Das eingegebene Jahr ist kein Schaltjahr.");
		}
		scanner.close();
	}
}
