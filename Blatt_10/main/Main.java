package main;

import werkzeuge.HalloWelt;
import werkzeuge.math.*;

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
	}
}
