package promenljive;

public class Zadatak1_2 {

	public static void main(String[] args) {
		/* Program koji racuna prosecnu potrosnju goriva na predjenih 100 km, 
		 * ako je predjeno 350 km, a potroseno je 17L goriva
		 */
		int predjeniPut;
		int potrosenoGoriva = 17;
		double prosecnaPotrosnja;
		
		predjeniPut = 350;
		potrosenoGoriva = 17;
		prosecnaPotrosnja = (potrosenoGoriva * 100) / predjeniPut;
		
		System.out.println("Prosecna potrosnja na predjenih " + predjeniPut + 
				" kilometara iznosi " + prosecnaPotrosnja + ".");

	}

}
