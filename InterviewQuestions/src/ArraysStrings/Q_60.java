package ArraysStrings;


public class Q_60 {
	public static void main(String[] args) {
		int mat[][]={{1,2,3},{4,5,6},{7,0,8}};
		boolean rows[]=new boolean[mat.length];
		boolean cols[]=new boolean[mat[0].length];
		
		//O(N^2)
		for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < cols.length; j++) {
				if(mat[i][j]==0){
					rows[i]=true;
					cols[j]=true;
				}
			}
		}
		
		//O(N^2)
		for (int i = 0; i < rows.length; i++) {
			if(rows[i]){
				for (int j = 0; j < cols.length; j++) {
					mat[i][j]=0;
				}
			}
		}
		
		//O(N^2)
		for (int i = 0; i < cols.length; i++) {
			if(cols[i]){
				for (int j = 0; j < cols.length; j++) {
					mat[j][i]=0;
				}
			}
		}
	}
}
