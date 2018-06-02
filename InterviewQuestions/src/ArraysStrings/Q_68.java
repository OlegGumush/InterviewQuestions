package ArraysStrings;

import java.util.Arrays;

public class Q_68 {

	public static void main(String[] args) {
		int mat[][] = new int[9][9];
		int m = 0;
		int x = 0;

		for (int i = 0; i < mat.length; i++) {
			if (i == 3 || i == 6) {
				m++;
			}
			x = m;
			for (int j = 0; j < mat.length; j++) {
				if ((x + 1) % mat.length == 0) {
					mat[i][j] = 9;
				} else {
					mat[i][j] = (x + 1) % 9;
				}
				x++;
			}
			m += 3;
		}

		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
	}

}
