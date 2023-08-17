package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class NizZadatak1 {

	public static void main(String[] args) {
		/*
		 * Implementirati program za racunanje sume vrednosti elemenata niza prirodnih
		 * brojeva koji sadrzi maksimum 50 elemenata. Program prihvata od korisnika broj
		 * elemenata i vrednost svakog pojedinacnog elementa
		 */

		int maks_br_elem = 50;
		int br_elem;
		int[] nizPrirodnihBrojeva = new int[50];
		int suma = 0;
		do {
			System.out.println("Uneti broj elemenata niza. Mora biti u opsegu od 0 do 50");
			br_elem = TextIO.getlnInt();
			if (br_elem < 0 || br_elem > 50) {
				System.out.println("Uneli ste broj elemenata van opsega, ponovite unos:");
			}
		} while (br_elem < 0 || br_elem > 50);
		
		for(int i=0; i<br_elem; i++) {
			System.out.println("Unesite " + (i+1) + ". elemenat niza:");
			nizPrirodnihBrojeva[i] = TextIO.getlnInt();
			suma +=nizPrirodnihBrojeva[i];
		}
		System.out.println("Suma prirodnih brojeva niza je: " + suma);
	}

}
