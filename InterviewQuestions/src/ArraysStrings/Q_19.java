package ArraysStrings;

public class Q_19 {

	public static void main(String[] args) {
		String s1 = "999999969999999999abcd000000000000000000000";
		String s2 = "869abcd888888888888888888888888888";

		LCS(s1,s2);
	}

	private static void LCS(String s1, String s2) {
		int mat[][]=new int[s1.length()+1][s2.length()+1];
		

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					mat[i][j]=mat[i-1][j-1]+1;
				}else{
					mat[i][j]=Math.max(mat[i][j-1],mat[i-1][j]);
				}
			}
		}
		System.out.println(mat[s1.length()][s2.length()]);
		
		String ans ="";
		
		int i = s1.length();
		int j = s2.length();
		
		while(i!=0 && j!=0){
			if(s1.charAt(i-1)==s2.charAt(j-1)){
				ans = s1.charAt(i-1) + ans;
				i--;
				j--;
			}else if (mat[i-1][j] > mat[i][j-1]){
				i--;
			}else{
				j--;
			}
		}
		System.out.println(ans);
	}
}
