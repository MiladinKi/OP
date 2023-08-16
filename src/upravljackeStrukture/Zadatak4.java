package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak4 {

	public static void main(String[] args) {
		/* Napisati program koji odredjuje prosecnu ocenu studenta u toku jedne godine.
		 * Korisnik unosi ocenu studenta (od 5 do 10), sve dok ne unese vrednost 0.
		 */
		int ocena;
		double prosecnaOcena = 0;
		int ukupanZbirOcena = 0;
		int brojOcena = 0;
		
		do {
			System.out.println("Upisite ocenu studenta. Ocena mora biti u intervalu od 5 do 10");
			ocena = TextIO.getlnInt();
			if(ocena<5 || ocena>10) {
				System.out.println("Unesli ste ocenu van opsega. Ponovite unos");
			}
			else if(ocena !=0) {
				ukupanZbirOcena +=ocena;
				brojOcena++;
			}
			
			
		} while (ocena != 0);
		prosecnaOcena = (double)ukupanZbirOcena/(brojOcena);
//		prosecnaOcena = Math.round(prosecnaOcena);
		System.out.println("Prosecna ocena iz " + brojOcena + " predmeta je " + prosecnaOcena);

	}

}
