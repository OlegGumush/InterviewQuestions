package ArraysStrings;

import java.util.Arrays;

public class Q_38 {
	public static void main(String[] args) {
		/////////////////////////// 90 ///////////////////////////////
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		int temp[][]=new int[mat.length][mat[0].length];
		
		System.out.println("Original");
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		System.out.println();
		
		int end = mat[0].length-1;
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				temp[j][end]=mat[i][j];
			}
			end--;
		}
		
		System.out.println("90");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(Arrays.toString(temp[i]));
		}
		
		System.out.println();
		
		/////////////////////////////// 180 ///////////////////////////
		end = mat.length-1;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				temp[end][mat[0].length-j-1]=mat[i][j];
			}
			end--;
		}
		System.out.println("180");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(Arrays.toString(temp[i]));
		}
		
	}
}
