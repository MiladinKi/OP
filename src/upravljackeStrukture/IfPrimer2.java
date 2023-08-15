package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class IfPrimer2 {

	public static void main(String[] args) {
		// Implementirati program koji ispisuje koji je od dva broja veci
		int a;
		int b;
		System.out.println("Program za odredjivanje koji je broj veci");
		System.out.println("Uneti prvi broj:");
		a = TextIO.getlnInt();
		System.out.println("Uneti drugi broj:");
		b = TextIO.getlnInt();
		if(a>b) {
			System.out.println("Broj " + a + " je veci od broja " + b + ".");
		} else if(a<b) {
			System.out.println("Broj " + a + " je manji od broja " + b + ".");
		} else {
			System.out.println("Brojevi " + a + " i " + b + " su jednaki.");
		}

	}

}
