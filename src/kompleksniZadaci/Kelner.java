package kompleksniZadaci;

import komunikacijaSaOkolinom.TextIO;

public class Kelner {

	public static void main(String[] args) {
		/* Program za pracenje rada kelnera.
		 * Kelner prodaje 10 vrsta pica. Svakog sata radnog vremena (8 sati) belezi se kelnerov
		 * prihod po vrsti pica. Program treba da omoguci:
		 * 1. Unos ostvarenog prihoda za zadati sat i vrstu pica
		 * 2. Izmenu ostvarenog prihoda za zadati sat i vrstu pica
		 * 3. Prikaz prihoda po satima za izabranu vrsta pica
		 * 4. Prikaz prihoda po vrstima pica za izabrani sat
		 * 5. Izracunavanje i prikaz najprodavanije vrste pica  i prihod ostvaren njenom prodajom
		 * 6. Izracunavanje i prikaz ukupnog dnevnog prihoda
		 * 7. Izracunavanje i prikaz prosecnog prihoda za svaki sat
		 * 8. Meni iz kojeg se biraju ponudjene funkcije
		 */

		double [][]prodaja = new double[8][10];
		int izbor = 0;
		do {
			ispisMeni();
		do {
			izbor = TextIO.getlnInt();
			if (izbor<0 || izbor> 8) {
				System.out.println("Izabrali ste broj van opsega, ponovite izbor");
			}
			
		} while (izbor<0 || izbor> 8);
		switch(izbor) {
		case 1:
			unos(prodaja);
			break;
		case 2:
			izmenaUnosa(prodaja);
			break;
		case 3:
			ispisPoSatu(prodaja);
			break;
		case 4:
			ispisPoPicu(prodaja);
			break;
		case 5:
			ispisNajprodavanijegPica(prodaja);
			break;
		case 6:
			ispisUkupnogPrihoda(prodaja);
			break;
		case 7:
			ispisProsecnogPrihodaPoSatu(prodaja);
			break;
		case 8:
			prikazMatrice(prodaja);
		}
			
		} while (izbor != 0);
	}

	static void ispisMeni() {
		System.out.println("Program za evidenciju rada kelnera");
		System.out.println("----------------------------------");
		System.out.println("Izaberite jednu od ponudjenih opcija");
		System.out.println("\t Unos ostvarenog prihoda za zeljeni sat i vrstu pica");
		System.out.println("\t 2. Izmenu ostvarenog prihoda za zeljeni sat i vrstu pica");
		System.out.println("\t 3. Prikaz prihoda po satima za izabranu vrsta pica");
		System.out.println("\t 4. Prikaz prihoda po vrstima pica za izabrani sat");
		System.out.println("\t 5. Izracunavanje i prikaz najprodavanije vrste pica  i prihod ostvaren njenom prodajom");
		System.out.println("\t 6. Izracunavanje i prikaz ukupnog dnevnog prihoda");
		System.out.println("\t 7. Izracunavanje i prikaz prosecnog prihoda za svaki sat");
		System.out.println("\t 8. Prikaz matrice");
		System.out.println("\t 0. Izlazak iz programa");
	}
	static void prikazMatrice(double [][] matrica) {
		for(int i=0; i<matrica.length; i++) {
			System.out.printf("%d:h", (i+1));
			for(int j=0; j<matrica[i].length; j++) {
				System.out.printf("|%10.2f", matrica[i][j]);
			}
			System.out.println();
		}
	}
	static void unos(double[][]matrica) {
		int sat = 0;
		int pice = 0;
		do {
			System.out.println("Unesite zeljeni sat (od 1 do 8) za koji zelite da unesete podatak:");
			sat = TextIO.getlnInt();
			if (sat<1 || sat>8) {
				System.out.println("Uneli ste pogresan podatak, ponovite unos");
			}
			
		} while (sat<1 || sat>8);
		sat--;
		do {
			System.out.println("Unesite zeljeno pice (od 1 do 10) za koji zelite da unesete podatak:");
			pice = TextIO.getlnInt();
			if (pice<1 || pice>10) {
				System.out.println("Uneli ste pogresan podatak, ponovite unos");
			}
			
		} while (pice<1 || pice>10);
		pice--;
		
		System.out.println("Unesite ostvareni prihod:");
		matrica[sat][pice] = TextIO.getlnDouble();
		System.out.println();
	}
	
	static void izmenaUnosa(double[][]matrica) {
		int sat = 0;
		int pice = 0;
		do {
			System.out.println("Unesite zeljeni sat (od 1 do 8) za koji zelite da unesete podatak:");
			sat = TextIO.getlnInt();
			if (sat<1 || sat>8) {
				System.out.println("Uneli ste pogresan podatak, ponovite unos");
			}
			
		} while (sat<1 || sat>8);
		sat--;
		do {
			System.out.println("Unesite zeljeno pice (od 1 do 10) za koji zelite da unesete podatak:");
			pice = TextIO.getlnInt();
			if (pice<1 || pice>10) {
				System.out.println("Uneli ste pogresan podatak, ponovite unos");
			}
			
		} while (pice<1 || pice>10);
		pice--;
		
		System.out.println("Unesite ostvareni prihod:");
		matrica[sat][pice] += TextIO.getlnDouble();
	}
	static void ispisPoSatu(double[][]matrica) {
		int sat = 0;
		do {
			System.out.println("Unesite zeljeni sat (od 1 do 8) za koji zelite da prikazete podatak:");
			sat = TextIO.getlnInt();
			if (sat<1 || sat>8) {
				System.out.println("Uneli ste pogresan podatak, ponovite unos");
			}
			
		} while (sat<1 || sat>8);
		sat--;
		System.out.println("Prikazujemo zaradu za sva pica po satima");
		for(int i = 0; i<matrica.length; i++) {
			System.out.printf("|%10.2f", matrica[sat][i]);
		}
	}
	static void ispisPoPicu(double[][]matrica) {
		int pice = 0;
		do {
			System.out.println("Unesite zeljeno pice (od 1 do 10) za koji zelite da unesete podatak:");
			pice = TextIO.getlnInt();
			if (pice<1 || pice>10) {
				System.out.println("Uneli ste pogresan podatak, ponovite unos");
			}
			
		} while (pice<1 || pice>10);
		pice--;
		System.out.println("Prikazujemo zaradu po picu u toku dana:");
		for(int i=0; i<matrica.length; i++) {
			System.out.printf("%d:h |%10.2f\n", (i+1), matrica[i][pice]);
		}
		System.out.println();
		
	}
	static void ispisNajprodavanijegPica(double[][]matrica) {
		double[]sumaPica = new double[10];
		for(int i= 0; i<matrica[0].length; i++) {
			for(int j=0; j<matrica.length; j++) {
				sumaPica[i] +=matrica[j][i];
			}
		}
		double maksProdajaPica = sumaPica[0];
		int idxMaksProdPica = 0;
		for(int i=0; i<sumaPica.length; i++) {
			if(maksProdajaPica<sumaPica[i]) {
				maksProdajaPica = sumaPica[i];
				idxMaksProdPica = i;
			}
		}
		System.out.println("Najprovadanije vrste pica je " + (idxMaksProdPica+1) + " i zaradili smo " + maksProdajaPica + ".");
	}
	
	static void ispisUkupnogPrihoda(double [][] matrica) {
		int i, j;
		double suma=0;
		for(i=0; i<matrica.length; i++) {
			for(j=0; j<matrica[0].length; j++) {
				suma += matrica[i][j];
			}
		}
		System.out.println("Ukupna zarada u toku dana od svih pica je: " + suma);
	}
	
	static void ispisProsecnogPrihodaPoSatu(double [][] matrica) {
		int i, j;
		double suma=0;
		double srVr = 0;
		for(i=0; i<matrica.length; i++) {
			for(j=0; j<matrica[0].length; j++) {
				suma += matrica[i][j];
				srVr = suma/8;
			}
		}
		System.out.println("Ukupna zarada u toku dana od svih pica je: " + srVr);
	}
}
