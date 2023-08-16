package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class ForPrimer2 {

	public static void main(String[] args) {
		/* Implementirati program koji preuzima jednu liniju teksta od korisnika i 
		 * ispisuje koja se sva slova nalaze u tom tekstu i koliko ima ukupno razlicitih slova
		 */
		
		String str;
		int ukSlova = 0;
		char slovo;
		int i;
		System.out.println("Unesite tekst:");
		str = TextIO.getlnWord();
		str = str.toUpperCase();
		
		System.out.println("Vas tekst sasrzi sledeca slova:");
		for(slovo = 'A'; slovo<='Z'; slovo++) {
			for(i=0; i<str.length(); i++) {
				if(slovo == str.charAt(i)) {
					System.out.print(slovo);
					System.out.println(" ");
					ukSlova++;
					break;
				}
			}
		}

		System.out.println("Otkriveno je ukupno " + ukSlova + " razlicitih slova.");

	}

}
