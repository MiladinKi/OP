package operatori;

public class Zadatak1_2 {

	public static void main(String[] args) {
		/* Napisati program koji izracunava otpornost bakarnog provodnika duzina l i precnika d.
		 * Specificna otpornost bakra RCu iznosi 1.588e-8 (R=RCu*4*l/(d*d*3.14))
		 */
		
		double duzina;
		double precnik;
		double RCu = 1.588e-8;
		double otpornost_bak_pr;
		
		duzina = 23.5;
		precnik = 23.1;
		otpornost_bak_pr = RCu * 4 * duzina / (precnik * precnik * 3.14);
		
		System.out.println("Otpornost bakarnog provodnika duzine " + duzina + 
				" i precnika " + precnik + " iznosi " + otpornost_bak_pr + "."); 

	}

}
