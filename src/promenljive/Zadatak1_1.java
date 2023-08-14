package promenljive;

public class Zadatak1_1 {

	public static void main(String[] args) {
		/* Program koji obracunava transakciju dinara u evro po 
		 kursu 117.5, pretpostaviti da se menja 155000 dinara*/

		int iznos;
		double kurs = 117.5;
		double promenjenIznos;
		
		iznos = 155000;
		promenjenIznos = iznos / kurs;
		
		System.out.println("Nakon transakcije " + iznos + " dinara po kursu " + kurs +
				" dobijeno je " + promenjenIznos + " dinara.");
	}

}
