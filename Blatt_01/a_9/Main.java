package a_9;

import java.util.Scanner;

public class Main {
		
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String zeile = new String();
		zeile = scanner.nextLine();
		int zahl = 0;
		int teiler = 5;
		
		try {
			zahl = Integer.valueOf(zeile);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Es muss eine Zahl eingegeben werden!");
		}
		
		while((teiler* (zahl / teiler)) != zahl) {
			zahl++;
		}
		
		System.out.println(zahl);
		scanner.close();
	}
}