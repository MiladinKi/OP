package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak5 {

	public static void main(String[] args) {
		/*
		 * Dat je niz A od maksimalno 40 celobrojnih elemenata. Ucitati n elemenata u
		 * niz A i formirati niz X pri cemu su elementi niza X apsolutne vrednosti
		 * negativnih elemenata niza A. Korititi abs funkciju
		 */
		int max_br_el = 40;
		int br_el;
		int [] nizA = new int [max_br_el];

		do {
			System.out.println("Uneti broj elemenata niza A (0-40): ");
			br_el = TextIO.getlnInt();
			if (br_el < 0 || br_el > 40) {
				System.out.println("Uneli ste broj van opsega, ponovite unos:");
			}
		} while (br_el < 0 || br_el > 40);
		
		for(int i=0; i<br_el; i++) {
			System.out.println("Uneti " + (i+1) + ". elemenat niza A:");
			nizA[i] = TextIO.getlnInt();
		}
		 int brojac = 0;
			for(int i=0; i<br_el; i++) {
				if(nizA[i]<0) {
					brojac++;
				}
			}
			

			  int [] nizX = new int[brojac];
			  brojac = 0;
				for(int i=0; i<br_el; i++) {
					if(nizA[i]<0) {
						nizX[brojac] = Math.abs(nizA[i]);
						brojac++;
					}
				}
				
				System.out.println("Elementi niza X su: ");
				for(int i=0; i<brojac; i++) {
					System.out.print(nizX[i] + " ");
				}

	}

}
