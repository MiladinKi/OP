package operatori;

public class Zadatak1_4 {

	public static void main(String[] args) {
		// Napisati program koji izracunava povrsinu valjka sa poluprecnikom r 
		//i visinom H (A = 2*r*(r+H)*PI)
		
		double poluprecnik;
		int visina;
		final double PI = Math.PI;
		double povrsina;
		
		poluprecnik = 44.76;
		visina = 4;
		povrsina = 2 * poluprecnik * (poluprecnik + visina) * PI;
		
		System.out.println("Povrsina valjka ciji je poluprecnik " + poluprecnik +
				 " i visina " + visina + " iznosi " + povrsina + ".");

	}

}
