package promenljive;

public class Primer2 {

	public static void main(String[] args) {
		/* Primer jednostavnog programa koji racuna zaradu na godisnjem nivou za investiciju od
		1000 dinara po godisnjeoj kamatnoj stopi od 0.027. Ukupna zarada i vrednost investicije 
		posle godinu dana se ispisuje u konzoli*/

		double investicija;
		double stopa;
		double zarada;
		
		investicija = 1000;
		stopa = 0.027;
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
