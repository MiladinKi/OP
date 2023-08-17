package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
		 * Dat je niz A od maksimalno 20 celobrojnih elemenata. Ucitati n elemenata,
		 * zatim ucitati ceo broj br. Na izlazu ispisati ceo niz i broj pojavljivanja br
		 * u nizu
		 */
		int max_br_el = 20;
		int br_el;
		int br;
		int[] nizA = new int[max_br_el];


		do {
			System.out.println("Upisati broj elemenata u nizu");
			br_el = TextIO.getlnInt();
			if (br_el < 0 || br_el > 20) {
				System.out.println("Broj elemenata je van opsega (1-20), ponoviti unos:");
			}
		} while (br_el < 0 || br_el > 20);

		for (int i = 0; i < br_el; i++) {
			System.out.println("Uneti " + (i + 1) + ". elemenat niza A:");
			nizA[i] = TextIO.getlnInt();
		}
		
		int brojac = 0;
		System.out.println("Unesite trazeni broj u nizu: ");
		br = TextIO.getlnInt();
		
		for (int i = 0; i < br_el; i++) {
			if(br == nizA[i]) {
				brojac++;
			} 
		}
		
		System.out.println("Elementi niza A su:");
		for (int i = 0; i < br_el; i++) {
			System.out.print(nizA[i] + " ");
		}
		System.out.println();
		
		
	
			System.out.println("Broj " + br + " se pojavljuje " + brojac + " puta u nizu A.");
	

	}

}
