package a_0;

public class Main {
	
	public static void main(String[]args) {
		int a = 3;
		int b = 5;
		int c = 6;
		double x = 1.5;
		double y = 2.3;
		int ires;
		double dres;
		
		ires = c - a* 3;
		System.out.println(ires); // -3
		
		ires = c / b;
		System.out.println(ires); // 1
		
		ires = a + b /c;
		System.out.println(ires); // 3
		
		dres = c / b;
		System.out.println(dres); // 1.0
		
		dres = c + a / b;
		System.out.println(dres); // 6
		
		dres = x + y * b;
		System.out.println(dres); // 13
	}
}
