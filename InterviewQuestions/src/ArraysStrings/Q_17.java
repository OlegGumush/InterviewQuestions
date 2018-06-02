package ArraysStrings;

import java.util.Arrays;

public class Q_17 {

	public static void main(String[] args) {
		int mat[][]={{1,2,3},{2,3,1},{3,1,2}};
		
		System.out.println(Sudoku(mat));
	}

	private static boolean Sudoku(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		
		int row[] = new int[mat.length];
		int col[] = new int[mat.length];

		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < row.length; j++) {
				row[mat[i][j]-1]++;
				col[mat[j][i]-1]++;
			}
			for (int j = 0; j < row.length; j++) {
				if(row[j]==0 || row[j]>1 || col[j]==0 || col[j]>1){
					return false;
				}
				row[j]=0;
				col[j]=0;
			}
		}
		
		return true;
	}
}
