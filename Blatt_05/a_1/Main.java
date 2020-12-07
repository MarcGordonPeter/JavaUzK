package a_1;

public class Main {

	public static void main(String[]args) {
		String s = "Winterzeit";
		int[] a = {0,4,5,6};
		
		char[] c = new char[a.length];
		
		System.out.println(s);
		System.out.println("Index: ");
		
		for(int i=0; i<a.length; i++) {
			c[i] = s.charAt(a[i]);
			System.out.println(a[i] + ": " + c[i]);
		}
		
		
		
		
		
	}
}
