package a_1;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1,4,2,4,6,1,4,5,6};
		
		for (int i=0; i< arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("\n");
		
		Einfach_verkettete_Liste liste = new Einfach_verkettete_Liste(arr);
		liste.print();
		
	}
}
