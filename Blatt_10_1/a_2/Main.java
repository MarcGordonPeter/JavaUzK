package a_2;

import a_1.*;

public class Main {
	
	public static void main(String[]args) {
		int[]arr = rand_million();
		
		Einfach_verkettete_Liste liste = new Einfach_verkettete_Liste(arr);
		
		long start1 = System.currentTimeMillis();
		for(int i=0; i < arr.length; i++) {
			arr[i] = 0;
		}
		long ende1 = System.currentTimeMillis();
		
		
		long start2 = System.currentTimeMillis();
		for(Knoten k = liste.kopf; k!= null; k = k.next) {
			k.wert = 0;
		}
		long ende2 = System.currentTimeMillis();
		
		System.out.println("Millisekunden seit 1970: " + System.currentTimeMillis());
		System.out.println(ende1 - start1);
		System.out.println(ende2 - start2);
	}
	
	
	static int[] rand_million() {
		int[] arr = new int[(int)Math.pow(10,6)];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) (100 * Math.random());
		}
		return arr;
	}

}
