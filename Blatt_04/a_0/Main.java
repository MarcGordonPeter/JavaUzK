package a_0;

import java.util.Scanner;

public class Main {
	
	static char [][] schluessel = {
			{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ä', 'ö', 'ü', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '.', ',', '!', '?'},
			{'?', '!', ',', '.', ' ', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0', 'ü', 'ö', 'ä', 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'}
	};

	public static void main(String[]args ) {
		
		Scanner scanner = new Scanner(System.in);
		String zeile = new String();
		zeile = scanner.nextLine();
		
		
		String verschluesselt = Verschluesseln(zeile);
		String entschluesselt = Entschluesseln(verschluesselt);
		
		System.out.println(verschluesselt);
		System.out.println(entschluesselt);
	}
	
	public static String Verschluesseln(String pEingabe) {
		char[] eingabe = pEingabe.toCharArray();
		char[] res = new char[eingabe.length];
		
		for(int i=0; i < eingabe.length; i++) {
			for(int j=0; j< schluessel[0].length;j++) {
				if(eingabe[i] == schluessel[0][j]) {
					res[i] = schluessel[1][j];
					break;
				}
			}
		}
		
		String resString = new String(res);
		
		return resString;
	}
	
	public static String Entschluesseln(String pEingabe) {
		char[] eingabe = pEingabe.toCharArray();
		char[] res = new char[eingabe.length];
		
		for(int i=0; i < eingabe.length; i++) {
			for(int j=0; j< schluessel[1].length;j++) {
				if(eingabe[i] == schluessel[1][j]) {
					res[i] = schluessel[0][j];
					break;
				}
			}
		}
		
		String resString = new String(res);
		
		return resString;
	}
}
