package kompleksniZadaci;

import komunikacijaSaOkolinom.TextIO;

public class AgentOsiguranja {
	static final int KATEGORIJE = 5;
	static final int DANI = 30;

	public static void main(String[] args) {
		/*
		 * Program za pracenje poslovanja agenta za osiguranje Evidencija prodaje
		 * osiguranja organizovana je u 5 kategorija i belezi se za svaki dan u mesecu
		 * (pretpostaviti da ih ima 30). Program treba da omoguci: - Unos ostvarenog
		 * prihoda za zadatu kategoriju osiguranja i dan u mesecu - Izmenu ostvarenog
		 * prihoda za zadatu kategoriju osiguranja i dan u mesecu - Prikaz rezultata
		 * sortiran po kategorijama osiguranja za izabrani dan u mesecu - Prikaz
		 * rezultata sortiran po danim u mesecu za izabranu kategoriju - Izracunavanje i
		 * prikaz dana kada je ostvaren najmanji prihod i koliko on iznosi -
		 * Izracunavanje i prikaz ukupnog mesecnog prihoda za svaku kategoriju
		 * osiguranja - Izracunavanje i prikaz mesecnog prihoda - Meni iz kojeg se
		 * biraju ponudjene funkcije
		 */
		double[][] EvidOsig = new double[DANI][KATEGORIJE];
		char izbor = '0';
		do {
			prikazMenija();
			izbor = preuzmiChar('0', '8', " ", "Morate odabrati vrednost u opsegu od 0 do 8");
			switch (izbor) {
			case '1':
				unesiPrihod(EvidOsig);
				break;
			case '2':
				izmenaPrihoda(EvidOsig);
				break;
			case '3':
				prikazZaDan(EvidOsig);
			case '4':
				prikazDanaZaKateg(EvidOsig);
			case '5':
				danSaNajmanjimPrihodom(EvidOsig);
			case '6':
				prihodKategor(EvidOsig);
			case '7':
				mesecniPrihod(EvidOsig);
			case '8':
				prikaziMatricu(EvidOsig, "DANI", "KATEGORIJE");
			}

		} while (izbor != '0');

	}

	static void prikazMenija() {
		System.out.println("Program za vodjenja evidencije za agenta osiguranja");
		System.out.println("Molimo Vas da izaberete jednu od ponudjenih opcija:");
		System.out.println("\t 1. Unos ostvarenog prihoda za zeljenu kategoriju osiguranja i dan u mesecu");
		System.out.println("\t 2. Izmenu ostvarenog prihoda za zeljenu kategoriju osiguranja i dan u mesecu");
		System.out.println("\t 3. Prikaz rezultata sortiran po kategorijama osiguranja za izabrani dan u mesecu");
		System.out.println("\t 4. Prikaz rezultata sortiran po danim u mesecu za izabranu kategoriju");
		System.out.println("\t 5. Izracunavanje i prikaz dana kada je ostvaren najmanji prihod i koliko on iznosi");
		System.out.println("\t 6. Izracunavanje i prikaz ukupnog mesecnog prihoda za svaku kategoriju osiguranja");
		System.out.println("\t 7. Izracunavanje i prikaz mesecnog prihoda");
		System.out.println("\t 8. Prikazi matricu");
		System.out.println("\t 0. Izlazak iz programa");
	}

	static char preuzmiChar(char donja, char gornja, String poruka, String porukaGreska) {
		char vrednost = '0';
		do {
			System.out.println(poruka);
			vrednost = TextIO.getlnChar();
			if ((vrednost > gornja) || (vrednost < donja)) {
				System.out.println(porukaGreska);
			}
		} while ((vrednost > gornja) || (vrednost < donja));
		return vrednost;
	}

	static int preuzmiInt(int donja, int gornja, String poruka, String porukaGreska) {
		int vrednost = 0;
		do {
			System.out.println(poruka);
			vrednost = TextIO.getlnInt();
			if ((vrednost > gornja) || (vrednost < donja)) {
				System.out.println(porukaGreska);
			}
		} while ((vrednost > gornja) || (vrednost < donja));
		return vrednost;
	}

	static void unesiPrihod(double[][] eo) {
		int dan, kat;
		char odg;
		do {
			dan = preuzmiInt(1, DANI, "Unesite dan za koji zelite prihod: ", "Dan mora biti u opsegu od 1 do " + DANI);
			kat = preuzmiInt(1, KATEGORIJE, "Unesite kategoriju za koji zelite prihod: ",
					"Kategorija mora biti u opsegu od 1 do " + KATEGORIJE);
			System.out.println("Unesite prihod za odabrani dan i kategoriju:");
			eo[dan - 1][kat - 1] = TextIO.getlnDouble();
//			prikaziMatricu(eo, "DANI", "KATEGORIJE");
			System.out.println("Za unos jos jednog prihoda pritisnuti taster d");
			odg = TextIO.getlnChar();
		} while (odg == 'd' || odg == 'D');
	}

	static void prikaziMatricu(double[][] eo, String imeVr, String imeKol) {
		int i = 0, j = 0;
		int brVr = eo.length;
		int brKol = eo[0].length;
		int brKarakterVrsta = imeVr.length();
		
		System.out.println(brKarakterVrsta);
		System.out.println(" " + imeKol);
		
		System.out.println(imeVr);
		
		for (i = 0; i < brVr; i++) {
			System.out.println(brKarakterVrsta);
			for (j = 0; j < brKol; j++) {
				System.out.printf(" %8.2f", eo[i][j]);
				System.out.println();
			}
		}
	}
	static void ispisiPraznaMesta(int vel) {
		for(int k=0; k<=vel; k++) {
			System.out.println(" ");
		}
	}
	static void izmenaPrihoda(double [][] eo) {
		int dan, kat;
		char odg;
		do {
			dan = preuzmiInt(1, DANI, "Unesite dan za koji zelite prihod: ", "Dan mora biti u opsegu od 1 do " + DANI);
			kat = preuzmiInt(1, KATEGORIJE, "Unesite kategoriju za koji zelite prihod: ",
					"Kategorija mora biti u opsegu od 1 do " + KATEGORIJE);
			System.out.println("Unesite prihod za odabrani dan i kategoriju:");
			eo[dan - 1][kat - 1] += TextIO.getlnDouble();
//			prikaziMatricu(eo, "DANI", "KATEGORIJE");
			System.out.println("Za unos jos jednog prihoda pritisnuti taster d");
			odg = TextIO.getlnChar();
		} while (odg == 'd' || odg == 'D');
	}
	static void prikazZaDan(double [][] eo) {
		int dan;
		char odg = 0;
		int brKol = eo[0].length;
		do {
			dan = preuzmiInt(1, DANI, "Unesite dan za koji zelite prihod: ", "Dan mora biti u opsegu od 1 do " + DANI);
			System.out.println("Prodaja kategorija za " + dan + " izgleda: ");
			for(int i=0; i<brKol; i++) {
				System.out.println("Kategorija " + (i+1 + ": " + eo[dan-1][i]));
				System.out.println("Za pregled novog dana pritisnite d");
				odg = TextIO.getlnChar();
			} 
		}while (odg =='d' || odg=='D');
	}
	
	static void prikazDanaZaKateg(double [][]eo) {
		int kat;
		char odg = 0;
		int brVr = eo.length;
		do {
			kat = preuzmiInt(1, KATEGORIJE, "Unesite kategoriju za koji zelite prihod: ",
					"Kategorija mora biti u opsegu od 1 do " + KATEGORIJE);
			System.out.println("Prodaja po danima za " + kat + ". izgleda:");
			for(int i=0; i<brVr; i++) {
				System.out.println((i+1) + ". dan: " + eo[i][kat-1]);
				System.out.println("Za pregled nove kategorije pritisnite d");
				odg = TextIO.getlnChar();
			}
			
		}while (odg =='d' || odg=='D');
	}
	
	static void danSaNajmanjimPrihodom(double [][]eo) {
		int brKol = eo[0].length;
		int brVr = eo.length;
		double [] prihodDani = new double[brVr];
		int i, j;
		int pozMin;
		
		for(i=0; i<brVr; i++) {
			for(j=0; j<brKol; j++) {
				prihodDani[i] += eo[i][j];
			}
		}
		pozMin = 0;
		for(i=0; i<brVr; i++) {
			if(prihodDani[pozMin]>prihodDani[i]) {
				pozMin = i;
				System.out.println((pozMin+1 + ". dana je ostvareno najmanji prihod u iznosu od: " + prihodDani[pozMin]));
			}
		}
	}
	
	static void prihodKategor (double [][] eo) {
		int brKol = eo[0].length;
		int brVr = eo.length;
		double []prihodKategorije = new double [brKol];
		int i, j;
		for(j=0; j<brKol; j++) {
			for(i=0; i<brVr; i++) {
				prihodKategorije[j] += eo[i][j];
				
				}
			}
		for(j=0; j<brKol; j++) {
			System.out.println((j+1) + ". kategorija je ostvarila sledeci prihod " + prihodKategorije[j]);
		}
	}
	static void mesecniPrihod (double [][] eo) {
		int brVr = eo.length;
		int brKol = eo[0].length;
		int i, j;
		double suma = 0;
		
		for(i=0; i<brVr; i++) {
			for(j=0; j<brKol; j++) {
				suma += eo[i][j];
			}
		}
		System.out.println("Ukupni mesecni prihod iznosi " + suma);
		
	}
}