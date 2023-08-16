package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak2 {

	public static void main(String[] args) {
		/*Napisati program koji odredjuje ukupan broj brojeva deljivih sa 7.
		 * Korisnik unosi brojeve sve dok ne unese vrednost -1. 
		 * uneti broj mora biti u intervalu od 6 do 142
		 */
		
		int unetiBroj;
		int ukDeljSa7 = 0;
		
		do {
			System.out.println("Unesite broj, broj mora biti u opsegu od 6 do 142: ");
			unetiBroj = TextIO.getlnInt();
			if(unetiBroj == -1) {
				break;
			}
			else if (unetiBroj<6 || unetiBroj>142) {
				System.out.println("Ponoviti unos broja. Broj mora biti u opsegu");
			}
			
			else if(unetiBroj%7 == 0) {
				ukDeljSa7++;
			}
			
		} while (true);
		
		System.out.println("Uneli ste ukupno " + ukDeljSa7 + " brojeva koji su deljivi sa 7.");

	}

}
