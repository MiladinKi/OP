package ugradjeniObjekti;

public class Zadatak2 {

	public static void main(String[] args) {
		// Napisati program za zaokruzivanje realne vrednosti na celobrojnu vrednost
		
		double broj;
		double zaokruzeno;
		
		broj = 7.51;
		
		zaokruzeno = Math.floor(broj);
		System.out.println("Zaokruzen broj " + broj + " na prvi veci iznosi " + zaokruzeno);
		zaokruzeno = Math.ceil(broj);
		System.out.println("Zaokruzen broj " + broj + " na prvi veci iznosi " + zaokruzeno);
		

	}

}
