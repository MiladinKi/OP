package operatori;

public class LogickiOperatori {

	public static void main(String[] args) {
		// Primer kako rade logicki operatori
		boolean a = true, b = false;
		//Negacija
		System.out.println("Negacija od true je " + !a);
		System.out.println("Negacija od false je " + !b);
		System.out.println();
		//I operacija
		System.out.println("true i false je " + (a&&b));
		System.out.println("false i true je " + (b&&a));
		System.out.println("true i true je " + (a&&a));
		System.out.println("false i false je " + (b&&b));
		System.out.println();
		//ILI operacija
		System.out.println("true ili false je " + (a||b));
		System.out.println("false ili true je " + (b||a));
		System.out.println("true ili true je " + (a||a));
		System.out.println("false ili false je " + (b||b));
		System.out.println();
		//Ekskluzivno ILI opracija
		System.out.println("true EXILI false je: " + (a ^ b));
		System.out.println("false EXILI true je " + (b ^ a));
		System.out.println("true EXILI true je " + (a ^ a));
		System.out.println("false EXILI false je " + (b ^ b));
	}

}
