package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class ForPrimer1 {

	public static void main(String[] args) {
		// Kod za prikazivanje prvih 100 prirodnih brojeva
		int i;
		for(i=1; i<=100; i++) {
			System.out.printf("\n%d\n",i);
		}
		//odrediti sumu prvih N prirodnih brojeva pri cemu se N zadaje na pocetku programa od strane korisnika
		int n;
		int suma = 0;
		System.out.println("Unesite n:");
		n = TextIO.getlnInt();
		for(int j=0; j<=n; j++) {
			suma += j;
		}
		System.out.println("Suma prvih " + n + " brojeva iznosi " + suma);
	}

}
