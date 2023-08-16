package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class IfPrimer1 {

	public static void main(String[] args) {
		//Primer programa za ispis uspeha na osnovu unete ocene (verzija sa visestrukom if selekcijom)
		
		int ocena;
//		System.out.println("Program za ispis uspeha na osnovu unete ocene. Ocena mora biti od 1 do 5!");
//		System.out.println("Unesite ocenu:");
//		ocena = TextIO.getlnInt();
		
		do {
			System.out.println("Program za ispis uspeha na osnovu unete ocene. Ocena mora biti od 1 do 5!");
			System.out.println("Unesite ocenu:");
			ocena = TextIO.getlnInt();
		if (ocena<1 || ocena>5) {
			System.out.println("Uneli ste ocenu van opsega, ponovite unos");
		}
		}while (ocena<1 || ocena>5);
		if(ocena==1) {
			System.out.println("Nedovoljan");
		} else if(ocena==2) {
			System.out.println("Dovoljan");
		} else if (ocena==3) {
			System.out.println("Dobar");
		} else if(ocena==4) {
			System.out.println("Vrlo dobar");
		} else if(ocena==5){
			System.out.println("Odlican");
		}
		

	}

}
