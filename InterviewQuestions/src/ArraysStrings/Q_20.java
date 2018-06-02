package ArraysStrings;

public class Q_20 {

	public static void main(String[] args) {
		int n=3;
		int m=3;
		int mat[][] = new int[n][m];
		
		for (int i = 0; i < mat[0].length; i++) {
			mat[0][i]=1;
		}
		for (int i = 0; i < mat.length; i++) {
			mat[i][0]=1;
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[0].length; j++) {
				mat[i][j]=mat[i-1][j]+mat[i][j-1];
			}
		}
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		System.out.println(mat[n-1][m-1]);
	}
}
