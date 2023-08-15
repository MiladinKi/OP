package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class SwitchPrimer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String units;
		double measurement;
		double inches = 0;
		
		System.out.println("Program za odabir jedinice u kojim da se izrazi mera");
		System.out.println("Jedinice mogu biti: inches, feet, yards ili miles!");
		System.out.println("Unesite iznos mere:");
		measurement = TextIO.getlnDouble();
		System.out.println("Unesite jedinicu u kojem zelite da prikazite meru:");
		units = TextIO.getlnString();
		
		switch(units) {
		case "inches":
			inches = measurement;
			break;
		case "feet":
			inches = measurement * 12;
			break;
		case "yards":
			inches = measurement * 36;
			break;
		case "miles":
			inches = measurement * 12 * 5280;
			break;
		default:
			System.out.println("Wait for minute! Illegal unit of measure! I quit!");
			System.exit(1);
		}
		System.out.println("Iznos mere iznosi " + inches + " i ono je izrazeno u " + units + ".");

	}

}
