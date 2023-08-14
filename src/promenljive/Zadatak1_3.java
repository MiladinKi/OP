package promenljive;

public class Zadatak1_3 {

	public static void main(String[] args) {
		// Program koji racuna povrsinu i obim kruga poluprecnika r=20

		int poluprecnik;
		final double PI = Math.PI;
		double povrsina;
		double obim;
		
		poluprecnik = 20;
		povrsina = poluprecnik*poluprecnik*PI;
		obim = 2*poluprecnik*PI;
		
		System.out.println("Povrsina kruga ciji je poluprecnik " + poluprecnik
				+ " iznosi " + povrsina + ".");
		System.out.println("Obim kruga ciji je poluprecnik " + poluprecnik
				+ " iznosi " + obim + ".");
	}

}
