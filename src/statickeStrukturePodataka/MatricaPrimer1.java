package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class MatricaPrimer1 {

	public static void main(String[] args) {
		/*
		 * Implementirati program za racunanje srednje vrednosti elemenata matrice
		 * prirodnih brojeva koji sadrzi maksimum 10 vrsta i 20 kolona. Program prihvata
		 * od korisnika broj vrsta i kolona i vrednost svakog pojedinacnog elementa.
		 */
		int max_br_vrsta = 10;
		int max_br_kolona = 20;
		int br_vrsta = 0;
		int br_kolona;
		double srednjaVrednost;
		double suma = 0;

		int[][] matricaPrirodnihBrojeva = new int[max_br_vrsta][max_br_kolona];
		System.out.println("Unesite broj vrste:");
		br_vrsta = TextIO.getlnInt();
		System.out.println("Unesite broj kolona:");
		br_kolona = TextIO.getlnInt();
		for (int i = 0; i < br_vrsta; i++) {
			for (int j = 0; j < br_kolona; j++) {
				System.out.println("Unesite " + (i + 1) + ". elemenat vrste i " + (j + 1) + ". elemenat kolone");
				matricaPrirodnihBrojeva[i][j] = TextIO.getlnInt();
			}
		}
		for (int i = 0; i < br_vrsta; i++) {
			for (int j = 0; j < br_kolona; j++) {
				suma += matricaPrirodnihBrojeva[i][j];
			}
		}
		srednjaVrednost = suma / (br_kolona * br_vrsta);
		System.out.printf("Srednja vrednost elemenata matrice iznosi: %2.2f", srednjaVrednost);
		System.out.println();
		
		int[] sumaVrste = new int[br_vrsta];
		for (int i = 0; i < br_vrsta; i++) {
			for (int j = 0; j < br_kolona; j++) {
				sumaVrste[i] += matricaPrirodnihBrojeva[i][j];
			}
		}

		System.out.println("Suma po vrstama:");
		for (int i = 0; i < br_vrsta; i++) {
			System.out.println("Vrsta [" + (i + 1) + "]=" + sumaVrste[i]);
		}
		System.out.println();

		int suma1Vrste = 0;
		for (int j = 0; j < br_kolona; j++) {
			suma1Vrste += matricaPrirodnihBrojeva[0][j];
		}
		System.out.println("Suma prve vrste: " + suma1Vrste);
		System.out.println();
		
		int[] sumaKolona = new int[br_kolona];
		for(int j=0; j<br_kolona; j++) {
			for(int i=0; i<br_vrsta; i++) {
				sumaKolona[j] +=matricaPrirodnihBrojeva[i][j];
			}
		}
		System.out.println("Suma po kolonama:");
		for(int j=0; j<br_kolona; j++) {
			System.out.println("Kolona [" + (j+1) + "]=" + sumaKolona[j]);
		}
		System.out.println();
		int suma2Kolone = 0;
		for(int i=0; i<br_vrsta; i++) {
			suma2Kolone +=matricaPrirodnihBrojeva[i][1];
		}
		System.out.println("Suma druge kolone: " + suma2Kolone);

	}

}
