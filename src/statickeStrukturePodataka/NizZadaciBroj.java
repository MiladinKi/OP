package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class NizZadaciBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] niz = new int[] { 3, 6, 5, 88, 1, 9, 1 };
		int suma = 0;

		// suma elemenata niza
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		System.out.println("Suma elemenata niza je: " + suma);
		System.out.println();
		// prosecna vrednost elemenata niza
		double prosecnaVr = 0;
		prosecnaVr = suma / niz.length;
		System.out.println("Prosecna vrednost niza je: " + prosecnaVr);
		System.out.println();
		// minimalni elemenat niza i pozicija minimalnog elementa niza
		int min;
		min = niz[0];
		int pozMin = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < min) {
				min = niz[i];
				pozMin = i;
			}
		}
		System.out.println("Minimalna vrednost u nizu je: " + min + " i on se nalazi na poziciji " + (pozMin + 1));
		System.out.println();
		// maksimalan elemenat niza
		int max;
		max = niz[0];
		int pozMax = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
				pozMax = i;
			}
		}
		System.out.println("Najveca vrednost u nizu je: " + max + " i on se nalazi na poziciji " + (pozMax + 1));
		System.out.println();
		// pronalazenje tacne pozicije neke zadate vrednosti unutar niza
		int n;
		int pozicija = 0;
		System.out.println("Uneti broj u nizu: ");
		n = TextIO.getlnInt();
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == n) {
				pozicija = i;
			}
		}
		System.out.println("Broj " + n + " se nalazi na poziciji " + (pozicija + 1) + " u nizu.");
		System.out.println();
		/*
		 * pronalazenje vrednosti koje zadovoljavaju neki slozeni kriterijum (npr. sve
		 * vrednosti manje od nekog broja a vece od drugog broja
		 */
		int granicaMin;
		int granicaMax;

		int brojac = 0;
		System.out.println("Unesite granicu za najmanji broj:");
		granicaMin = TextIO.getlnInt();
		System.out.println("Unesite granicu za najveci broj");
		granicaMax = TextIO.getlnInt();
		for (int i = 0; i < niz.length; i++) {
			if(niz[i]>granicaMin || niz[i]<granicaMax) {
				brojac++;
			}
		}
		int[]noviNiz = new int [brojac];
		brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			if(niz[i]>granicaMin && niz[i]<granicaMax) {
				noviNiz[brojac] = niz[i];
				brojac++;
			}
		}
		System.out.println("Vrednosti unutar granica su: ");
		for (int i = 0; i < brojac; i++) {
			System.out.print(noviNiz[i] + " ");
		}
		System.out.println();
		//sortiranje elemenata niza po nekom kriterijumu
		int temp;
		for (int i = 0; i < niz.length-1; i++) {
			for(int j = i+1; j<niz.length; j++) {
				if(niz[i]>niz[j]) {
					temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
		System.out.println("Sortirani elementi niza:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

}
