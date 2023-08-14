package ugradjeniObjekti;

public class Zadatak1 {

	public static void main(String[] args) {
		// Napisati program koji izracunava apsolutnu vrednost nekog broja
		
		double broj;
		double rez;
		broj = -2;
		long vremePocetka, vremeKraja, vremeTrajanja;
	
		vremePocetka = System.currentTimeMillis();
		rez = Math.abs(broj);
		System.out.println("Apsolutna vrednost broja " + broj + " je " + rez + ".");
		vremeKraja = System.currentTimeMillis();
		vremeTrajanja = vremeKraja - vremePocetka;
		System.out.println("Vreme trajanja izvrsenja programa je " + vremeTrajanja + " sekundi.");

	}

}
