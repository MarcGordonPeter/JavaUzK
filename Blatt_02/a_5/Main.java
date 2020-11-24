package a_5;
import java.util.Random;

public class Main {

	public static void main(String[]args) {
		int var1 = rand();
		int var2 = rand();
		int var3 = rand();
		
		if(var1 < var2) {
			if (var1 < var3) {
				System.out.println("var 1 am kleinsten");
			} else {
				System.out.println("var 3 am kleinsten");
			}
		} else {
			if (var2 < var3) {
				System.out.println("var 2 am kleinsten");
			} else {
				System.out.println("var 3 am kleinsten");
			}
		}
		
		if(var1 > var2) {
			if (var1 > var3) {
				System.out.println("var 1 am groessten");
			} else {
				System.out.println("var 3 am groessten");
			}
		} else {
			if (var2 > var3) {
				System.out.println("var 2 am groessten");
			} else {
				System.out.println("var 3 am groessten");
			}
		}
	}
	
	public static int rand() {
		Random r = new Random();
		return r.nextInt();
	}
}
