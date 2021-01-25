package main;

import werkzeuge.HalloWelt;
import werkzeuge.math.*;
import werkzeuge.zahlen.*;

public class Main {

	public static void main(String[]args) {
		werkzeuge.HalloWelt.hallo_welt();
		werkzeuge.HalloWelt.hallo();
		
		HalloWelt.hallo_welt();
		HalloWelt.hallo();
		
		System.out.println(werkzeuge.math.Fibonacci.berechne(12));
		System.out.println(werkzeuge.math.Fakultaet.berechne(6));
		
		System.out.println(Fibonacci.berechne(12));
		System.out.println(Fakultaet.berechne(6));
		
		Bruch a = new Bruch(2,3);
		Bruch2 b = new Bruch2(2,3);
		
		a.print();
		b.print();
		
		System.out.println(a.groesser_als(b));
		System.out.println(b.kleiner_als(a));
	}
}
