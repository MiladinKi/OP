package string;

public class Primer2 {

	public static void main(String[] args) {
		// Program koji demonstrira operacije s stringovima
		String s1 = "Program";
		String s2 = "iranje";
		String s3 = " i programski jezici";
		
		System.out.println("String s1: " + s1);
		s1 = s1 + s2;
		System.out.println("String s1 nakon prve konkatanacije: " + s1);
		s1 = s1 + s3;
		System.out.println("String s1 nakon druge konkatanacije: " + s1);
		System.out.println("String s1 konvertovan u mala slova: " + s1.toLowerCase());
		System.out.println("String s1 konvertovan u velika slova: " + s1.toUpperCase());
		System.out.println("Karakter na trecoj poziciji u stringu s1 je: " + s1.charAt(2));
		System.out.println("Rezultat poredjenja stringova s1 i s3 je: " + s1.compareTo(s3));
		System.out.println("Rezultat poredjenja da li su stringovi s2 i s3 jednaki: " + s2.equals(s3));
		System.out.println("Podstring stringa s1 izmedju 4 i 10 karaktera je: " + s1.substring(3, 9));

	}

}
