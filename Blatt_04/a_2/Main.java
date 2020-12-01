package a_2;

import java.util.Arrays;

public class Main {
	
	public static void main(String[]args) {
		int zahl = 1099;
		
		String zahlString = String.valueOf(zahl);
				
		int[] z = new int[zahlString.length()];
		
		for (int i = 0; i < zahlString.length(); i++) {
		    z[i] = zahlString.charAt(i) - '0';
		}
		
		System.out.println(z.length);
		System.out.println(Arrays.toString(z));
		
	}

}
