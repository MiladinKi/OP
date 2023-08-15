package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class SwitchPrimer5 {

	public static void main(String[] args) {
		// Program za pisanje tekstualnog menija
		int opcija;
		
		System.out.println("Izaberite jednu od ponudjenih opcija");
		System.out.println();
		System.out.println("    1. Unos studenata");
		System.out.println("    2. Izmena studenata");
		System.out.println("    3. Brisanje studenata");
		System.out.println("    4. Prikaz studenata");
		System.out.println();
		opcija = TextIO.getlnInt();
		
		switch (opcija) {
		case 1: System.out.println("Izabrali ste prvu opciju.");
			break;
		case 2: System.out.println("Izabrali ste drugu opciju.");
		break;
		case 3: System.out.println("Izabrali ste trecu opciju.");
		break;
		case 4: System.out.println("Izabrali ste cetvrtu opciju.");
		break;
		default: System.out.println("Niste izabrali ni jednu od ponudjenih opcija!");
			System.exit(1);
		}

	}

}
