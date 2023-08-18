package statickeStrukturePodataka;

public class NizZadaciString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] niz = new String[] { "ako", "imas", "nesto", "da", "mi", "das" };
		int min;
		min = niz[0].length();
		String minRec = "";
		int pozMin = 0;
		// najkraca rec
		for (int i = 0; i < niz.length; i++) {
			if (niz[i].length() < min) {
				min = niz[i].length();
				minRec = niz[i];
				minRec = minRec.toUpperCase();
				pozMin = i;
			}
		}

		System.out.println(
				"Najkraca rec je " + minRec + "se nalazi na poziciji " + (pozMin + 1) + " i ima " + min + " slova.");
		System.out.println();
		// broj svih reci
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			brojac++;
		}
		System.out.println("Ovaj niz ima " + brojac + " reci.");
		System.out.println();

		// broj slova u nizu
		int ukBrojSlova = 0;
		for (int i = 0; i < niz.length; i++) {
			ukBrojSlova += niz[i].length();
		}
		System.out.println("Ovaj niz ima ukupno " + ukBrojSlova + " slova.");
		System.out.println();
		// sortiranje niza
		String temp = "";
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i].compareToIgnoreCase(niz[j]) > 0) {
					temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
		System.out.println("Stringovi su poredjani po redosledu od a do z: ");
		for (int i = 0; i < niz.length - 1; i++) {
			System.out.print(niz[i] + " ");
		}

	}
}
