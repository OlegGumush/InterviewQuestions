package ArraysStrings;

public class Q_54 {

	public static void main(String[] args) {
		String s = "yokabakyotat";
		lcs(s, reverse(s));
	}

	private static String reverse(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			temp +=s.charAt(s.length()-1-i);
		}
		return temp;
	}

	private static void lcs(String s1, String s2) {
		int mat[][] = new int[s1.length() + 1][s1.length() + 1];

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					mat[i + 1][j + 1] = mat[i][j] + 1;
				} else {
					mat[i + 1][j + 1] = Math.max(mat[i + 1][j], mat[i][j + 1]);
				}
			}
		}

		int i = s1.length() - 1;
		int j = s2.length() - 1;
		String ans = "";

		while (i >= 0 && j >= 0) {
			if (s1.charAt(i) == s2.charAt(j)) {
				ans = s1.charAt(i) + ans;
				i--;
				j--;
			} else {
				if (mat[i + 1][j] > mat[i][j + 1]) {
					j--;
				} else {
					i--;
				}
			}
		}
		
		System.out.println(ans);

	}
}
