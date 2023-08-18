package statickeStrukturePodataka;

public class MatricaZadaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 88, 9 }, { 5, 3, -1 }, { 9, 4, 1 } };
		int brVr = 5;
		int brKol = 3;
		int i, j;

		// ispisivanje matrice
		for (i = 0; i < brVr; i++) {
			for (j = 0; j < brKol; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// koji je najveci broj druge vrste
		int maks;
		int maks_i;
		int maks_j;
		maks = mat[1][0];
		for (j = 0; j < brKol; j++) {
			if (maks < mat[1][j]) {
				maks = mat[1][j];
			}
		}
		System.out.println("Najveci broj druge vrste je " + maks);
		System.out.println();
		// pozicija maksimuma cele matrice
		maks_i = 0;
		maks_j = 0;
		int maksM = mat[maks_i][maks_j];
		for (i = 0; i < brVr; i++) {
			for (j = 0; j < brKol; j++) {
				if (maksM > mat[i][j]) {
					maksM = mat[i][j];
					maks_i = i;
					maks_j = j;
				}
			}
		}
		System.out.println("Najveci broj u matrici je " + maksM + " i on se nalazi u " + (maks_i + 1) + ". vrsti i "
				+ (maks_j + 1) + ". koloni.");
		System.out.println();
		// suma po koloni
		int[] sumaKol = new int[brKol];
		for (j = 0; j < brKol; j++) {
			for (i = 0; i < brVr; i++) {
				sumaKol[j] += mat[i][j];
			}
		}
		System.out.println("Suma vrednosti po kolonama je: ");
		for (j = 0; j < brKol; j++) {
			System.out.println(sumaKol[j]);
		}
		System.out.println();
		// suma po vrsti
		int[] sumaVr = new int[brVr];
		for (i = 0; i < brVr; i++) {
			for (j = 0; j < brKol; j++) {
				sumaVr[i] += mat[i][j];
			}
		}
		System.out.println("Suma vrednosti po vrstama je: ");
		for (j = 0; j < brVr; j++) {
			System.out.println(sumaVr[j]);
		}
		System.out.println();
		// suma druge kolone
		int suma2Kol = 0;
		for (i = 0; i < brVr; i++) {
			suma2Kol += mat[i][1];
		}
		System.out.println("Suma elemenata druge kolone iznosi: " + suma2Kol);
		// suma druge vrste
		int suma2Vr = 0;
		for (j = 0; j < brKol; j++) {
			suma2Vr += mat[1][j];
		}
		System.out.println("Suma elemenata druge vrste iznosi: " + suma2Vr);
	}
}
