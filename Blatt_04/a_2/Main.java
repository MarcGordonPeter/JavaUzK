package a_2;

import java.util.Arrays;

public class Main {
	
	public static void main(String[]args) {
		int zahl = 1099;
		
		int i = 1;
		int div = 10;
		while(zahl > div) {
			i++;
			div *= 10;
		}
		
		div /= 10;
		
		int[]z = new int[i];
		
		for(int j=0;j<z.length;j++) {
			z[j] = zahl / div;
			zahl -= z[j] * div;
			div /= 10;
		}
		
		System.out.println(i);
		System.out.println(Arrays.toString(z));
	}

}
