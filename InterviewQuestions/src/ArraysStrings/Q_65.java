package ArraysStrings;

public class Q_65 {

	public static void main(String[] args) {
		int mat[][] = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 } };
		size(mat);
	}

	private static void size(int[][] mat) {
		int temp[][] = new int[mat.length][mat[0].length];

		// fill first row , column
		for (int i = 0; i < mat.length; i++) {
			temp[i][0] = mat[i][0];
		}
		for (int i = 0; i < temp[0].length; i++) {
			temp[0][i] = mat[0][i];
		}

		for (int i = 1; i < temp.length; i++) {
			for (int j = 1; j < temp[0].length; j++) {
				if (mat[i][j] == 1) {
					temp[i][j] = min(temp[i - 1][j - 1], temp[i - 1][j], temp[i][j - 1]) + 1;
				} else {
					temp[i][j] = 0;
				}
			}
		}
		
		int max = -1;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				if(temp[i][j]>max){
					max = temp[i][j];
				}
			}
		}
		System.out.println(max+"*"+max);
	}

	private static int min(int i, int j, int k) {
		if (i > j)
			i = j;
		if (i > k)
			i = k;
		return i;
	}
}
