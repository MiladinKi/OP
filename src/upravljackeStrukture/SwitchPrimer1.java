package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class SwitchPrimer1 {

	public static void main(String[] args) {
		// Primer programa za ispis uspeha na osnovu unete ocene (switch verzija)
		int ocena;
		System.out.println("Program za ispis uspeha na osnovu unete ocene. Ocena mora biti od 1 do 5!");
		System.out.println("Unesite ocenu:");
		ocena = TextIO.getlnInt();
		
		switch(ocena) {
			case 1: System.out.println("Nedovoljan");
			break;
			case 2: System.out.println("Dovoljan");
			break;
			case 3: System.out.println("Dobar");
			break;
			case 4: System.out.println("Vrlo dobar");
			break;
			case 5: System.out.println("Odlican");
			break;
			default: System.out.println("Ocena mora biti od 1 do 5");
		}

	}

}
