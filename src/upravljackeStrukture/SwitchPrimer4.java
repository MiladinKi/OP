package upravljackeStrukture;

import java.time.format.TextStyle;

import komunikacijaSaOkolinom.TextIO;

public class SwitchPrimer4 {
	enum Season{WINTER, SPRING, SUMMER, FALL}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite godisnje doba da bi se ispisali koji meseci pripadaju tom godinjem dobu.");
		String currentSeason;
		currentSeason = TextIO.getln();
		currentSeason = currentSeason.toUpperCase();
		switch (currentSeason) {
		case "WINTER":
			System.out.println("December, January, February");
			break;
		case "SPRING":
			System.out.println("March, April, May");
			break;
		case "SUMMER":
			System.out.println("June, July, Avgust");
			break;
		case "FALL":
			System.out.println("September, October, November");
			break;
		default:
			System.out.println("Odabrali ste pogresno godinje doba!");
			System.exit(1);
		}

	}

}
