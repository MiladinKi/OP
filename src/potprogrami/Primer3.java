package potprogrami;

import komunikacijaSaOkolinom.TextIO;

public class Primer3 {

	static int MAX_POLAZNIKA = 40;
	public static void main(String[] args) {
		/*Napraviti program koji prihvata podatke o polaznicima (ime, prezime, jmbg, grad),
		 * dobijene podatke sortira po jmbg-u i prikazuje ih korisniku. Podaci se smestaju u
		 * niz, moze biti maksimalno 40 polaznika. Implementirati unos, prikaz i 
		 * sortiranje kao zasebne potprograme
		 */
		String [][] listaPolaznika = new String[MAX_POLAZNIKA][4];
		int brPolaznika = 0;
		System.out.println("---Program za unos i sortiranje liste polaznika");
		brPolaznika = unosBrojaPolaznika();
		unosPolaznika(brPolaznika, listaPolaznika);
		sortiranjePoJMBG(brPolaznika, listaPolaznika);
		prikazPolaznika(listaPolaznika, brPolaznika, null);

	}
	
	static int unosBrojaPolaznika() {
		int brojEl = 0;
		System.out.println("Unesite broj polaznika (maks 40)");
		brojEl = TextIO.getlnInt();
		return brojEl;
	}
	static void unosPolaznika(int brojPol, String [][]polaznici) {
		int i = 0;
		System.out.println();
		for(i = 0; i<brojPol; i++) {
			System.out.println("Unesite podatke za " + (i+1) + ". polaznika:");
			System.out.println("Ime:\t\t");
			polaznici[i][0] = TextIO.getlnString();
			System.out.println("Prezime\t\t:");
			polaznici[i][1] = TextIO.getlnString();
			System.out.println("JMBG:\t\t");
			polaznici[i][2] = TextIO.getlnWord();
			System.out.println("Grad:\t\t");
			polaznici[i][3] = TextIO.getlnWord();
			System.out.println();
		}
	}
	static void sortiranjePoJMBG(int brPol, String [][]polaz) {
		int i, j;
		for(i = 0; i<brPol; i++) {
			for(j = i+1; j<brPol; j++) {
			if(polaz[i][2].compareTo(polaz[j][2])> 0) {
				zamena(polaz, j, i);
			}
			}
		}
	}
	
	static void zamena(String [][]polaznici, int koga, int kim) {
		int i = 0;
		String temp;
		for(i=0; i<4; i++) {
			temp = polaznici[koga][i];
			polaznici[koga][i] = polaznici[kim][i];
			polaznici[kim][i] = temp;
		}
	}
	static void prikazPolaznika(String[][]polaznici, int brPolazika, String vrstaSorta) {
		int i;
		System.out.println("Lista polaznika sortirana po + " + vrstaSorta + ":");
		System.out.println("--------------------------------------------------");
		for(i=0; i<brPolazika; i++) {
			System.out.println("R.br:\t\t_" + (i+1) + "_");
			System.out.println("Ime:\t\t" + polaznici[i][0]);
			System.out.println("Prezime:\t\t" + polaznici[i][1]);
			System.out.println("JMBG:\t\t" + polaznici[i][2]);
			System.out.println("Grad:\t\t" + polaznici[i][3]);
		}
	}

}
