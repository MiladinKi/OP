package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak6 {

	public static void main(String[] args) {
		/* Dat je niz C od maksimalno 15 karaktera. Ucitati n karaktera u niz C
		 * i formirati niz A, pri cemu su elementi niza A samo mala slova niza C
		 */
		int max_br_el = 15;
		int br_el;
		char [] nizC = new char [max_br_el];

		do {
			System.out.println("Uneti broj elemenata niza A (0-15): ");
			br_el = TextIO.getlnInt();
			if (br_el < 0 || br_el > 15) {
				System.out.println("Uneli ste broj van opsega, ponovite unos:");
			}
		} while (br_el < 0 || br_el > 15);
		
		for(int i=0; i<br_el; i++) {
			System.out.println("Uneti " + (i+1) + ". elemenat niza C");
			nizC[i] = TextIO.getlnChar();
		}
		int brojac = 0;
		for(int i=0; i<br_el; i++) {
			if(nizC[i] >='a' && nizC[i]<='z') {
				brojac++;
			}
		}
		
		char[] nizA = new char[brojac];
		brojac = 0;
		for(int i=0; i<br_el; i++) {
			if(nizC[i] >='a' && nizC[i]<='z') {
				nizA[brojac] = nizC[i];
				brojac++;
			}
		}
		
		System.out.println("Elementi niza A su ");
		for(int i=0; i<brojac; i++) {
			System.out.print(nizA[i] + " ");
		}

	}

}
