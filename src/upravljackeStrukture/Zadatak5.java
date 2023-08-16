package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak5 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji odredjuje procenat projeva deljivih sa 3 od N brojeva.
		 * Korisnik unosi N, a zatim brojeve u opsegu od 15 do 62
		 */
		int n;
		int broj;
		int deljSa3 = 0;
		double procenatDeljSa3;

		System.out.println("Unesite koliko brojeva zelite da unesete:");
		n = TextIO.getlnInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Uneti broj:");
			broj = TextIO.getlnInt();
			if (broj < 15 || broj > 62) {
				System.out.println("Uneli ste broj van opsega, ponovite unos:");
			} else if (broj % 3 == 0) {
				deljSa3++;
			}

		}
		procenatDeljSa3 = (double) deljSa3 / n;
		System.out.println("Procenat brojeva  koji su deljivi sa 3 od " + n + " broj(ev)a je: " + procenatDeljSa3);
	}

}
