package a_2;

public class Main {
	public static void print(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void selection_sort(int[] arr) {
		for (int i = 0; i + 1 < arr.length; i++) {
			/* finde Index ind des kleinsten Elementes (ab Index i) */ 
			int ind = i;
			for (int j = ind + 1; j < arr.length; j++) {
				if (arr[j] < arr[ind]) { 
					ind = j;
				}
			}
			System.out.println("Position: " + i + " min: " + arr[ind]);
			/* tausche das kleinste Element mit dem an Stelle i */ 
			int tmp = arr[i];
			arr[i] = arr[ind];
			arr[ind] = tmp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{ 1, 33, 4, 15, -2, 52, 249, 24, 14, 25 };
		print(arr);
		selection_sort(arr);
		print(arr);
	}
	
}
