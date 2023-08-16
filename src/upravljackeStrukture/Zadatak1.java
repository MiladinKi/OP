package upravljackeStrukture;

import komunikacijaSaOkolinom.TextIO;

public class Zadatak1 {

    public static void main(String[] args) {
        System.out.println("Program za izračunavanje prosečnog broja studenata po smerovima");
        int brSmerova;
        int brStudenata;
        System.out.println("Unesite broj smerova");
        brSmerova = TextIO.getlnInt();
        int ukBrStudenata = 0;
        double prosecanBrSt = 0;

        for (int i = 0; i < brSmerova; i++) {
            do {
                System.out.println("Unesite broj studenata na smeru. "
                        + "Na smeru se može nalaziti broj studenata između 0 i 160.");
                brStudenata = TextIO.getlnInt();
                if (brStudenata < 0 || brStudenata > 160) {
                    System.out.println("Uneli ste broj studenata van opsega, ponovite unos");
                }
            } while (brStudenata < 0 || brStudenata > 160);
            
            if (brStudenata == 0) {
            	break;
            }

            ukBrStudenata += brStudenata;
        }

        if (brSmerova > 0) {
            prosecanBrSt = (double) ukBrStudenata / brSmerova;
            prosecanBrSt = Math.ceil(prosecanBrSt);
            System.out.println("Prosečan broj studenata po smerovima je: " + prosecanBrSt);
        } else {
            System.out.println("Nema unetih smerova.");
        }
    }
}
