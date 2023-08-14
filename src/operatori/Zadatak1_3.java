package operatori;

public class Zadatak1_3 {

	public static void main(String[] args) {
		/* Napisati program koji odredjuje pritisak jednog mola (kolicina gasa - n) 
		 * idealnog gasa p na osnovu zapremine gasa V i temperature T. Pritisak idealnog gasa se
		 * odredjuje prema sledecoj formuli: p=n*R*T/V, gde je r - univerzalna gasna 
		 * konstanta i iznosi 8.314472 j/(mol*K)
		 */
		double n;
		double zapremina;
		double temperatura;
		double R = 8.314472;
		double pritisak_1mola;
		
		n = 34.6;
		temperatura = 71.2;
		zapremina = 33.3;
		pritisak_1mola = (n * R * temperatura)/zapremina;
		
		System.out.println("Pritisak jednog mola idealnog gasa cija je temperatura " + temperatura + 
				" i zapremina iznosi " + pritisak_1mola + ".");

	}

}
