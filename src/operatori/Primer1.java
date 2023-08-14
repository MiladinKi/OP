package operatori;

public class Primer1 {

	public static void main(String[] args) {
		// Primer jednostavnog programa koji racuna predjeni put i to prikazuje korisniku
		
		double ubrazanje = 2.0;
		double pocetnaBrzina = 3.0;
		double vreme = 10.0;
		
		double predjeniPut = 0.5 * ubrazanje * vreme * vreme;
		predjeniPut = predjeniPut + pocetnaBrzina * vreme;
		
		System.out.print("Predjeni put nakon " + vreme + " sekundi je ");
		System.out.println(predjeniPut + "m.");

	}

}
