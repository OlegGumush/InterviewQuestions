package ArraysStrings;

import java.util.Arrays;

public class Q_70 {

	public static void main(String[] args) {
		int mat[][] = { { 1, 1, 0, 1 }, { 1, 1, 0, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 },
				{ 1, 0, 0, 1 } };
		System.out.println(path(mat));
	}

	private static boolean path(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		return path(mat, 0, 0);
	}

	private static boolean path(int[][] mat, int i, int j) {
		boolean b = false;

		if (mat[i][j] == 0)
			return false;
		if (i == mat.length - 1 && j == mat[0].length - 1)
			return true;

		if (i < mat.length - 1) {
			b = path(mat, i + 1, j);
		}
		return b || path(mat, i, j + 1);
	}
}
