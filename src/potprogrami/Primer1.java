package potprogrami;

import komunikacijaSaOkolinom.TextIO;

public class Primer1 {

	public static void main(String[] args) {
		/*
		 * Primer programa koji racuna sumu, tazliku, proizvod i kolicnik dva broja.
		 * Brojeve zadaje korsinik preko tastature. Unos, sabiranje, oduzimanje,
		 * mnozenje, deljenje i prikaz rezultata implementirane su kao zasebne funkcije
		 */
		double operand1;
		double operand2;
		double zbir = 0, razlika = 0, proizvod = 0, kolicnik = 0;
		int unos;
		System.out.println("Program za simuliranje kalkulatora, za izlaz iz programa pritisnuti \"0\" ");
		operand1 = unosOperanda("Unesite prvi operand");
		operand2 = unosOperanda("Unesite drugi operand");
		System.out.println("---------------------------------");
		
		do {
			System.out.println("Unesite broj za zeljenu operaciju:"
					+ "1. sabiranje, 2. oduzimanje, 3. mnozenje, 4. deljenje ili 0. za izlaz");
			unos = TextIO.getlnInt();
			if(unos == 1) {
		zbir = sabiranje(operand1, operand2);
			} else if (unos ==2) {
		razlika = oduzimanje(operand1, operand2);
			} else if (unos == 3) {
		proizvod = mnozenje(operand1, operand2);
			} else if (unos == 4) {
		kolicnik = deljenje(operand1, operand2);
			} else if (unos == 0) {
				System.exit(1);
			}
		prikazRezultata(operand1, operand2, zbir, razlika, proizvod, kolicnik);
		} while (unos !=0);
		

	}
	
	static double unosOperanda(String poruka) {
		double operand = 0;
		System.out.println(poruka);
		operand = TextIO.getlnDouble();
		return operand;
	}
	
	static double sabiranje(double op1, double op2) {
		double zbir = 0;
		zbir = op1 + op2;
		return zbir;
	}
	
	static double oduzimanje (double op1, double op2) {
		return op1 - op2;
	}
	static double mnozenje(double op1, double op2) {
		return op1 * op2;
	}
	static double deljenje(double op1, double op2) {
		return op1/op2;
	}
	
	static void prikazRezultata(double op1, double op2, double zb, double rz, double pr, double kl) {
		System.out.println("\n---Rezultati osnovnih operacija su:---");
		System.out.printf("\n%8.2f + %8.2f = %8.2f\n", op1, op2, zb);
		System.out.printf("\n%8.2f + %8.2f = %8.2f\n", op1, op2, rz);
		System.out.printf("\n%8.2f + %8.2f = %8.2f\n", op1, op2, pr);
		System.out.printf("\n%8.2f + %8.2f = %8.2f\n", op1, op2, kl);
	}

}
