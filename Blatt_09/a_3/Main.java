package a_3;

import java.lang.Math.*;

public class Main {
	public static void main(String[]args) {
		int[] arr = rand_million();
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static int[] rand_million() {
		int[] arr = new int[(int)Math.pow(10,6)];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) (100 * Math.random());
		}
		return arr;
	}
}
