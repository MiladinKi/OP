package ugradjeniObjekti;

public class Primer1 {

	public static void main(String[] args) {
		/* Program koji obavlja odredjene matematicke proracune pomocu Math klase i ispisuje rezultat. 
		 * U primeru se koristi i konstanta PI. Takodje koristi se ugradjena i metoda System.currentTimeMillis
		 * kako bi preuzelo trenutno vreme.
		 */
		
		long vremePocetka;
		long vremeKraja;
		double vreme;
		double sirina = 42.0, visina = 17.0, hipotenuza;
		
		vremePocetka = System.currentTimeMillis();
		hipotenuza = Math.sqrt(sirina * sirina + visina * visina);
		
		System.out.print("Pravougli trougao cije su stranice " + sirina + " i " + visina);
		System.out.println(" ima hipotenuzu " + hipotenuza + ".");
		System.out.print("sin(1)*sin(1) + cos(1)*cos(1) - 1 je ");
		System.out.println(Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) -1);
		System.out.print("Slucajno generisana vrednost je ");
		System.out.println(Math.random());
		System.out.println("Broj PI ima vrednost " + Math.PI);
		
		vremeKraja = System.currentTimeMillis();
		vreme = vremeKraja - vremePocetka;
		System.out.println("Ukupno trajanje programa u sekundama je " + vreme);

	}

}
