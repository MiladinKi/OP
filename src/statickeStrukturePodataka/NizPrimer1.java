package statickeStrukturePodataka;

import komunikacijaSaOkolinom.TextIO;

public class NizPrimer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max_br_el = 10;
		int br_elem = 1;
		int[]nizInt = new int[10];
		do {
		System.out.println("Unesite broj elemenata (maks.10)");
		br_elem = TextIO.getlnInt();
		if(br_elem>10) {
			System.out.println("Ponovite unos, uneli ste broj elemenata van opsega");
		}
		}while(br_elem>10);
		
		for(int i=0; i<br_elem; i++) {
			System.out.println("Unesite " + (i+1) + ". elemenat niza:");
			nizInt[i] = TextIO.getlnInt();
			
		}
		System.out.println("Elementi niza su:");
		for(int i=0; i<br_elem; i++) {
			System.out.print(nizInt[i] + " ");
		}
		

	}

}
