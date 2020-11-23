package a_2;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String zeile = new String();
		zeile = scanner.nextLine();
		double zahl = 0;
	
		try {
			zahl = Double.valueOf(zeile);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Es muss eine Zahl eingegeben werden!");
		}
	
		double[]wert = {500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
		
		int[]anzahl = new int[15];
		
		for (int i=0; i < anzahl.length; i++) {
			anzahl[i] = 0;
		}
		
		for(int i = 0; i<wert.length; i++) {
			if (wert[i] <= zahl) {// + 0.001) {
				System.out.println(zahl);
				anzahl[i] += 1;
				Math.round(zahl -= wert[i]);
				System.out.println(zahl);
				i -= 1;
			}
		}
		
		System.out.println("Der eingegebene Betrag: " + Double.valueOf(zeile) + "€ kann wie folgt bezahlt werden:");
		double betrag_neu = 0;
		for (int i=0;i<anzahl.length;i++) {
			if(anzahl[i]>0) {
				betrag_neu += anzahl[i] * wert[i];
				System.out.println(anzahl[i] + "x " + wert[i] + "€");
			}
			
		}
		System.out.println(betrag_neu);
		
	}
	
	
}
