package a_2;

public class Main {
	
	public static void main(String[]args) {
		int x = 0;
		while(x<=10) {
			x = x + 1;
			System.out.println(x);
		}
		
		int y;
		for(y = 1; y<=11; y++) {
			System.out.println(y);
		}
		y--;
		
		int z = 0;
		do {
			z++;
			System.out.println(z);
		} while (z<=10);
	}

}
