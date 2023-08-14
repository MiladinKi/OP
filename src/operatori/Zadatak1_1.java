package operatori;

public class Zadatak1_1 {

	public static void main(String[] args) {
		/* Napisati program koji izracunava zapreminu kupe sa poluprecnikom r i 
		 * visinom H (V = 1/3*r*r*H*PI)
		 */
		double poluprecnik;
		int visina;
		final double PI = Math.PI;
		double zapremina;
		
		poluprecnik = 23.4;
		visina = 6;
		zapremina = (1.0/3) * poluprecnik * poluprecnik * visina * PI;
		
		System.out.println("Zapremina kupe ciji poluprecnik " + poluprecnik
	+ " i cija je visina " + visina +  " iznosi " + zapremina);
	}

}
