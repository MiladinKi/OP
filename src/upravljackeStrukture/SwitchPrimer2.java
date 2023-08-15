package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class SwitchPrimer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int status;
		String potez;
		System.out.println("Program za prikaz da li se igrac pomerao");
		System.out.println("Unesite broj (status) igraca");
		status = TextIO.getlnInt();
		
		switch (status) {
		case 1: 
			potez = "pomerio gore";
			break;
		case 2:
			potez = "pomerio dole";
			break;
		case 3:
			potez = "pomerio levo";
			break;
		case 4:
			potez = "pomerio desno";
			break;
		default: 
			potez = "nije pomerio";
		}
		System.out.println("Igrac se " + potez);

	}

}
