package kompleksniZadaci;

import komunikacijaSaOkolinom.TextIO;

public class Banka {

	public static void main(String[] args) {
		/*
		 * Banka posluje u gradu putem 10 poslovnica i za svaki mesec belezi se njen
		 * prihod. Program treba da omoguci: 1. Unos ostvarenog prihoda za zadatu
		 * poslovnicu i mesec. 2. Izmenu ostvarenog prihoda za zadatu poslovnicu i
		 * mesec. 3. Prikaz mesecnih prihoda za izabranu poslovnicu. 4. Prikaz prihoda
		 * pojedinacnih poslovnica za izabrani mesec 5. Izracunavanje i prikaz meseca u
		 * kojem je ukupni prihod najveci i koliko on iznosi 6. Izracunavanje i prikaz
		 * ukupnog godisnjeg prihoda 7. Izracunavanje i prikaz prosecnog prihoda za
		 * svaku poslovnicu 8. Meni iz kojeg se biraju ponudjene funkcije
		 */

		double[][] prihod = new double[10][30];
		char izbor = '0';
		do {
			ispisMeni();
			izbor = TextIO.getlnChar();
			do {
				if (izbor < '0' || izbor > '8') {
					System.out.println("Unesli ste broj van opsega. Ponovite izbor");
				}
			} while (izbor < '0' || izbor > '8');
			switch (izbor) {
			case '1':
				unosPrihoda(prihod);
				break;
			case '2':
				izmenaPrihoda(prihod);
				break;
			case '3':
				prikazPrihodaPoslovnica(prihod);
				break;
			case '4':
				prikazPoPoslIMesec(prihod);
				break;
			case '5':
				maxPrihod(prihod);
				break;
			case '6':
				ukupanPrihod(prihod);
				break;
			case '7':
				prosecanPrihodPoslovnice(prihod);
				break;
			case '8':
				prikazMatrice(prihod);
				break;
			}
		} while (izbor != '0');

	}

	static void ispisMeni() {
		System.out.println("Program za vodjenje evidencije rada banke");
		System.out.println("--------------------------------------------");
		System.out.println("Izaberite jednu od ponudjenih opcija");
		System.out.println("\t 1. Unos ostvarenog prihoda za zeljenu poslovnicu i mesec.");
		System.out.println("\t 2. Izmenu ostvarenog prihoda za zeljenu poslovnicu i mesec.");
		System.out.println("\t 3. Prikaz mesecnih prihoda za izabranu poslovnicu.");
		System.out.println("\t 4. Prikaz prihoda pojedinacnih poslovnica za izabrani mesec");
		System.out.println("\t 5. Izracunavanje i prikaz meseca u kojem je ukupni prihod najveci i koliko on iznosi");
		System.out.println("\t 6. Izracunavanje i prikaz ukupnog godisnjeg prihoda");
		System.out.println("\t 7. Izracunavanje i prikaz prosecnog prihoda za svaku poslovnicu");
		System.out.println("\t 8. Prikaz matrice");
		System.out.println("\t 0. Izlaz iz programa");
	}

	static void prikazMatrice(double[][] matrica) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d:p", (i + 1));
			for (int j = 0; j < 12; j++) {
				System.out.printf("|%10.2f", matrica[i][j]);
			}
			System.out.println();
		}
	}

	static void unosPrihoda(double[][] matrica) {
		int poslovnica = 0;
		int mesec = 0;

		System.out.println("Unesite broj poslovnice u opsegu od 1 do 10");
		poslovnica = TextIO.getlnInt();
		do {
			if (poslovnica < 1 || poslovnica > 10) {
				System.out.println("Izabrali ste broj van opsega, ponovite izbor");
			}
		} while (poslovnica < 1 || poslovnica > 10);
		poslovnica--;

		System.out.println("Unesite broj meseca (od 1 do 12): ");
		mesec = TextIO.getlnInt();
		do {
			if (mesec < 1 || mesec > 12) {
				System.out.println("Izabrali ste broj van opsega, ponovite izbor");
			}
		} while (mesec < 1 || mesec > 12);
		mesec--;

		System.out.println("Unesite ostvareni prihod za " + poslovnica + " u mesecu " + mesec + ".");
		matrica[poslovnica][mesec] = TextIO.getlnDouble();
	}
	
	static void izmenaPrihoda(double [][]matrica) {
		int poslovnica = 0;
		int mesec = 0;

		System.out.println("Unesite broj poslovnice u opsegu od 1 do 10");
		poslovnica = TextIO.getlnInt();
		do {
			if (poslovnica < 1 || poslovnica > 10) {
				System.out.println("Izabrali ste broj van opsega, ponovite izbor");
			}
		} while (poslovnica < 1 || poslovnica > 10);
		poslovnica--;

		System.out.println("Unesite broj meseca (od 1 do 12): ");
		mesec = TextIO.getlnInt();
		do {
			if (mesec < 1 || mesec > 12) {
				System.out.println("Izabrali ste broj van opsega, ponovite izbor");
			}
		} while (mesec < 1 || mesec > 12);
		mesec--;

		System.out.println("Unesite ostvareni prihod za " + poslovnica + " u mesecu " + mesec + ".");
		matrica[poslovnica][mesec] += TextIO.getlnDouble();
	}

	static void prikazPrihodaPoslovnica(double[][]matrica) {
		int i, j;
		int posl;
		double prihodP = 0;
		System.out.println("Unesite broj poslovnice u opsegu od 1 do 10");
		posl = TextIO.getlnInt();
		do {
			if (posl < 1 || posl > 10) {
				System.out.println("Izabrali ste broj van opsega, ponovite izbor");
			}
		} while (posl < 1 || posl > 10);
		
		for(j=0; j<posl; j++){
			prihodP += matrica[posl][j];
		}
		System.out.println("Prihod poslovnice broj " + posl + " iznosi " + prihodP);
	}
	
	static void prikazPoPoslIMesec(double[][]matrica) {
		int i, j;
		int mesec;
		double[] prihodPM = new double[10];
		System.out.println("Izaberite mesec za koji zelite pregled");
		mesec = TextIO.getlnInt();
		do {
			if (mesec < 1 || mesec > 12) {
				System.out.println("Izabrali ste broj van opsega, ponovite izbor");
			}
		} while (mesec < 1 || mesec > 12);
		
		for(i=0; i<matrica.length; i++) {
			prihodPM[i] = matrica[i][mesec];
		}
		for(i=0; i<matrica.length; i++) {
			System.out.println("Prihod " + (i+1) + ". poslovnice za mesec " + mesec + ".");
		}
	}
	static void maxPrihod(double[][] matrica) {
		double[]prihMesec = new double[12];
		int i, j;
		for(i=0; i<matrica[0].length; i++) {
			for(j=0; j<matrica.length; j++) {
				prihMesec[i] +=matrica[j][i];
			}
		}
		double maksMesec = prihMesec[0];
		int idxMesec = 0;
		for(i=0; i<matrica.length; i++) {
			if(maksMesec < prihMesec[i]) {
				maksMesec = prihMesec[i];
				idxMesec = i;
			}
		}
		System.out.println("Mesec u godini u kome je ostvaren najveci prihod je " + (idxMesec+1) + " i prihod iznosi " + maksMesec);
	}
	static void ukupanPrihod(double[][]matrica) {
		int i, j;
		double ukupanPrihod = 0;
		for(i=0; i<matrica.length; i++) {
			for(j=0; j<matrica[i].length; j++) {
				ukupanPrihod += matrica[i][j];
			}
		}
		System.out.println("Ukupan godisnji prihod je: " + ukupanPrihod);
	}
	static void prosecanPrihodPoslovnice (double[][]matrica) {
		int i, j;
		double ukupanPrihod = 0;
		for(i=0; i<matrica.length; i++) {
			for(j=0; j<matrica[i].length; j++) {
				ukupanPrihod += matrica[i][j];
			}
		}
		System.out.println("Prosecan prihod poslovnice je: " + ukupanPrihod/10);
	}
}
