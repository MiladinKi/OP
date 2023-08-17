package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak2 {

	public static void main(String[] args) {
		/* Dat je niz X od maksimalno 10 realnih elemenata. Ucitati N elemenata  u niz X
		 * i formirati nizove A i B, pri cemu su elementi niza A elementi niza X sa parnim indeksom, 
		 * a elementi niza B su elementi niza X sa neparnim indeksom
		 */
		
		int max_br_el = 10;
		int br_elem;
		int []nizX = new int[max_br_el];
		do {
		System.out.println("Unesite broj elemenata niza:");
		br_elem = TextIO.getlnInt();
		if (br_elem<0 || br_elem>10) {
			System.out.println("Uneli ste broj elemenata van opsega, ponovite unos");
		}
		} while (br_elem<0 || br_elem>10);
		
		int parniIndex = 0;
		int neparniIndex = 0;
		for(int i=0; i<br_elem; i++) {
			System.out.println("Unesite " + (i+1) + ". elemenat niza:");
			nizX[i] = TextIO.getlnInt();
			if(i%2==0) {
				parniIndex++;
			} else {
				neparniIndex++;
			}
		}
		
		int[]nizA = new int[parniIndex];
		int[] nizB = new int[neparniIndex];
		parniIndex = 0;
		neparniIndex = 0;
		for(int i=0; i<br_elem; i++) {
			if(i%2==0) {
				nizA[parniIndex] = nizX[i];
				parniIndex++;
			} else {
				nizB[neparniIndex] = nizX[i];
				neparniIndex++;
			}
		}
		
		System.out.println("Elementi niza A su:");
		for(int i=0; i<parniIndex; i++) {
			System.out.print(nizA[i] + " ");
		}
		System.out.println();
		System.out.println("Elementi niza B su:");
		for(int i=0; i<neparniIndex; i++) {
			System.out.print(nizB[i] + " ");
		}
	}

}
