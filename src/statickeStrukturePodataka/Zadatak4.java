package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak4 {

	public static void main(String[] args) {
		/*Dat je niz C od maksimalno 15 karaktera. Ucitati n karaktera u niz C i formirati niz A 
		 * pri cemu su elementi niza C samo brojevi niza A
		 */

		int max_br_el = 15;
		int br_el;
		char []nizA = new char[max_br_el];
		
		do {
			System.out.println("Unesite broj elemenata niza (opseg 1-15:)");
			br_el = TextIO.getlnInt();
			if(br_el<1 || br_el>15) {
				System.out.println("Uneli ste vrednost van opsega, ponovite unos:");
			}
		} while (br_el<1 || br_el>15);
		
		for(int i=0; i<br_el; i++) {
			System.out.println("Unesite " + (i+1) + ". elemena niza:");
			nizA[i] = TextIO.getChar();
		}
		
		int brojac = 0;
		for(int i=0; i<br_el; i++) {
			if('0'<=nizA[i] && nizA[i]<='9') {
				brojac++;
			}
		}
		
		char[] nizC = new char[brojac];
		brojac = 0;
		for(int i=0; i<br_el; i++) {
			if('0'<=nizA[i] && nizA[i]<='9') {
				nizC[brojac] = nizA[i];
				brojac++;
			}
		}
		
		System.out.println("Elementi niza C su:");
		for(int i=0; i<brojac; i++) {
			System.out.println(nizC[i] + " ");
		}
		
	}

}
