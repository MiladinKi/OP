package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak3 {

	public static void main(String[] args) {
		/*Napisati program koji odredjuje koji broj je najmanji u sekvenci od N brojeva.
		 * Korisnik unosi N, a zatim brojeve (-10...100)
		 */
		int n;
		int broj;
		int min=101;
		System.out.println("Unesite ukupan broj brojeva:");
		n = TextIO.getlnInt();
		
		for(int i=0; i<n; i++) {
			do {
			System.out.println("Unesite broj, broj mora biti u intervalu od -10 do 100");
			broj = TextIO.getlnInt();
			if (broj<-10 || broj>100) {
				System.out.println("Uneli ste broj van opsega, ponovite unos");
			}
			if(broj<min) {
				min=broj;
			}
			}while (broj<-10 || broj>100);
		}
		System.out.println("Najmanji broj u sekvenci je " + min);

	}

}
