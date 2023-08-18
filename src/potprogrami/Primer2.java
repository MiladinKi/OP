package potprogrami;

import komunikacijaSaOkolinom.TextIO;

public class Primer2 {

	public static void main(String[] args) {
		/* Primer programa za racunanje sume vrednosti elemenata niza pririodnih brojeva koji sadrzi maksimum 
		 * 50 elemenata. Program prihvata od korisnika broj elemenata (0<N<=50) i vrednost svakog pojedinacnog elementa.
		 * unos elemenata i racunanje sume su realizovani kao zasebni potprogrami
		 */
		int max_br_ele = 50;
		int [] niz = new int [max_br_ele];
		int n = 1;
		int x;
		n = unosBrojaElemenata();
		unosElNiza(n, niz);
		do {
			System.out.println("Unesite odabir funkcije: 1. suma niza, 2. srednja vrednost niza, "
					+ "3. minimum niza, 4. pozicija minimalnog el niza, 0. izlaz");
			x = TextIO.getlnInt();
//		suma(n, niz);
			if (x ==1) {
		System.out.println("Suma vrednosti elemenata niza iznosi " + suma(n, niz));
			} else if (x ==2) {
				System.out.println("Srednja vrednost elemenata niza je: " + srVrednost(n, niz));
			} else if (x == 3){
				System.out.println("Minimalna vrednost elementa niza je: " + min(n, niz));
			} else if (x == 4){
				System.out.println("Pozicija najmanjeg elementa niza je " + pozMin(n, niz));
			} else if (x == 0) {
				System.out.println("Izlaz iz programa");
			}
		} while (x !=0);
		
		
		
		

	}
	
	static int unosBrojaElemenata() {
		System.out.println("Unesite zeljeni broj elemenata");
		int br_el = 0;
		br_el = TextIO.getlnInt();
		return br_el;
	}
	
	static void unosElNiza(int n, int [] niz) {
		for(int i = 0; i<n; i++) {
			System.out.println("Unesite " + (i+1) + ". elemenat niza");
			niz[i] = TextIO.getlnInt();
		}
	}
	static int suma (int n, int [] niz) {
		int suma = 0;
		for(int i = 0; i<n; i++) {
		suma +=niz[i];
		}
		return suma;
	}
	static double srVrednost(int n, int [] niz) {
		int suma = 0;
		double srVr = 0;
		for(int i = 0; i<n; i++) {
		suma +=niz[i];
		srVr = suma / n;
		}
		return srVr;
	}
	
	static int min (int n, int [] niz) {
		int minimum = 0;
		minimum = niz[0];
		for(int i = 0; i<n; i++) {
			if(minimum>niz[i]) {
				minimum = niz[i];
			}
		}
		return minimum;
	}
	
	static int pozMin (int n, int [] niz) {
		int minimum = 0;
		minimum = niz[0];
		int pozM = 0;
		for(int i = 0; i<n; i++) {
			if(minimum>niz[i]) {
				minimum = niz[i];
				pozM = i;
			}
		}
		return (pozM + 1);
	}
	
	
}
