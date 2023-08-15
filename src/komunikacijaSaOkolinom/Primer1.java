package komunikacijaSaOkolinom;

public class Primer1 {

	public static void main(String[] args) {
		/* Primer jednostavnog programa u kojem korisnik unosi ceo broj, racuna njegov kvadrat i to se ispisuje 
		 * korisniku
		 */
		int broj;
		int kvadrat;
		
		System.out.println("Unesite vrednost celog broja:");
		broj = TextIO.getInt();
		kvadrat = broj * broj;
		System.out.println("Broj koji ste uneli je " + broj);
		System.out.println("Kvadrat unetog broja je: " + kvadrat);

	}

}
