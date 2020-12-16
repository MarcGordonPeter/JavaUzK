package a_1;

public class Main {

	public static void main(String[]args) {
		Bruch a = new Bruch(5,1);
		Bruch b = new Bruch(1,5);
		Bruch c = new Bruch(1,0);
		int mult = 5;
		
		System.out.println("a ist gültig: " + a.gueltig());
		System.out.println("b ist gültig: " + b.gueltig());
		System.out.println("c ist gültig: " + c.gueltig());
		
		System.out.println("a ist groesser als b: " + a.groesser_als(b));
		System.out.println("b ist groesser als a: " + b.groesser_als(a));
		
		/*
		System.out.println("a*5:");
		a.multipliziere(5);
		a.print();
		*/
		
		System.out.println("b*a:");
		b.multipliziere(a);
		b.print();
		
		System.out.println("a ist groesser als 5: " + a.groesser_als(mult));
		System.out.println("b ist groesser als 5: " + b.groesser_als(mult));
		
	}
	
}
