package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak1 {

	public static void main(String[] args) {
		/* Dat je niz od maksimalno 12 celobrojnih elemenata. Ucitati n elemenata
		 * u niz X i formirati nizove A i B, pri cemu su elementi niza A parni elementi niza X, 
		 * a elementi niza B su neparni elementi niza X 
		 */
		
		int max_br_el = 12;
		int [] nizX = new int [max_br_el];
		int n;
		int parni = 0;
		int neparni = 0;
		
		System.out.println("Uneti broj elemenata niza X");
		n = TextIO.getlnInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Uneti " + (i+1) + ". elemenata niza X");
			nizX[i] = TextIO.getlnInt();
			if(nizX[i]%2==0) {
				parni++;
			} else {
				neparni++;
			}
		}
		

		int []nizA = new int[parni];
		int []nizB = new int[neparni];
		parni = 0;
		neparni = 0;
		for(int i = 0; i<n; i++) {
			if(nizX[i]%2==0) {
				nizA[parni] = nizX[i];
				parni++;
			} else {
				nizB[neparni] = nizX[i];
				neparni++;
			}
		}
		System.out.println("Elementi niza A su: ");
		for(int i=0; i<parni; i++) {
		System.out.print(nizA[i] + " ");
		}
		System.out.println();
		System.out.println("Elementi niza B su: ");
		for(int i=0; i<neparni; i++) {
		System.out.print(nizB[i] + " ");
		}
	}

}
