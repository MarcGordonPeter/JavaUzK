package a_4;

public class Main {

	public static void main(String[]args) {
		int[]a = {0,7,8,0,5,4,7,7,0,5};
		int[]count = new int[a.length];
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i] == a[j]) {
					count[i]++;
				}
			}
			System.out.println("Zahl " + a[i] + " kommt " + count[i] + " mal vor.");
		}
	}
	
}
