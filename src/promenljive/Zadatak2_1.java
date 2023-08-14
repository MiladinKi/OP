package promenljive;

public class Zadatak2_1 {

	public static void main(String[] args) {
		// Program koji implementira algoritam zamene sadrzaja dve memorijske lokacije A i B

		int a = 5;
		int b = 2;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Nakon zamene a iznosi " + a + ", a b iznosi " + b + ".");
		
	}

}
