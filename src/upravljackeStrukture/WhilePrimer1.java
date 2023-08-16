package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class WhilePrimer1 {

	public static void main(String[] args) {
		//Primer programa za racunanje faktorijela celog broja koji definise korisnik
		
		int n, i = 1, fakt = 1;
		System.out.println("Program za racunanje faktorijela unetog broja");
		System.out.println("Unesite broj:");
		n = TextIO.getlnInt();
		do {
			if(n<0) {
				System.out.println("Uneti broj mora biti veci ili jednak 0. Unesite broj ponovo:");
			}
		} while (n<0);
		
		while(i<=n) {
			fakt = fakt * i;
			i++;
		}
		System.out.println("Faktorijel broja " + n + " iznosi " + fakt);
	}

}
