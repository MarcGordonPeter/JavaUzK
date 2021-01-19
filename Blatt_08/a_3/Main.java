package a_3;

public class Main {
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void mergesort(int[] arr, int tiefe) {
		String praefix = "";
		for (int i=0; i<tiefe;i++) {
			praefix += "\t";
		}
		System.out.print(praefix);
		print(arr);
		
		if (arr.length == 0 || arr.length == 1) {
			return;
		}
		
		int half = arr.length / 2;
		int[] left_arr = new int[half], right_arr = new int[arr.length - half];
		
		for (int i = 0; i < arr.length; i++) {
			if (i < half) {
				left_arr[i] = arr[i];
			} else {
				right_arr[i - half] = arr[i];
			}
		}
		mergesort(left_arr, tiefe++);
		mergesort(right_arr, tiefe++);
		
		
		/* fuege sortierte Arrays left_arr und right_arr zusammen */ 
		for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
			arr[i] = (j == left_arr.length) ? right_arr[k++]
					: (k == right_arr.length) ? left_arr[j++]
					: (left_arr[j] < right_arr[k]) ? left_arr[j++] 
					: right_arr[k++];
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 33, 4, 15, -2, 52, 249, 24, 14, 25 };
		//print(arr);
		mergesort(arr, 0);
		//print(arr);
	}
}
