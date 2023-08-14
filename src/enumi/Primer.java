package enumi;

public class Primer {

	enum Dan {PONEDELJAK, UTORAK, SREDA, CETVRTAK, PETAK, SUBOTA, NEDELJA}
	enum Mesec {JANUAR, FEBRUAR, MART, APRIL, MAJ, JUN, JUL, AVGUST, SEPTEMBAR,
		OKTOBAR, NOVEMBAR, DECEMBAR}
	public static void main(String[] args) {
		// Program koji koristi enumeraciju za dan u nedelji i mesece u godini i ispisuje podatke o njima
	Dan danRodjenja;
	Mesec mesecRodjenja;
	danRodjenja = Dan.SREDA;
	mesecRodjenja = Mesec.AVGUST;
	System.out.println("Moj znak je Lav jer sam rodjen u " + mesecRodjenja + "u.");
	System.out.println("To je " + (mesecRodjenja.ordinal() + 1) + ". mesec u godini.");
	System.out.println("Dan kada sam se rodio je bio " + danRodjenja + ", a to je "
	+ (danRodjenja.ordinal() + 1) + ". u nedelji.");

	}

}
