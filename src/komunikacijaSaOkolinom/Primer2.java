package komunikacijaSaOkolinom;

public class Primer2 {

	public static void main(String[] args) {
		/* Primer modifikacije jednostavnog programa koji racuna zaradu na godisnjem nivou tako da investiciju i
		 * kamatnu stopu unosi korisnik. Ukupna zarada i vrednost investicije posle godinu dana se ispisuje u konzolu
		 */
		
		double investicija;
		double stopa;
		double zarada;
		
		System.out.println("Unesite vredost investicije:");
		investicija = TextIO.getlnDouble();
		System.out.println("Unesite kamatnu stopu:");
		stopa = TextIO.getlnDouble();;
		zarada = investicija * stopa;
		investicija = investicija + zarada;
		
		System.out.print("Za godinu dana zaradjeno je ");
		System.out.print(zarada);
		System.out.println(" dinara.");
		System.out.print("Ukupna vrednost investicije je sada: ");
		System.out.print(investicija);
		System.out.println(" dinara.");

	}

}
