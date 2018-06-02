package ArraysStrings;

public class Q_11 {
	public static void main(String[] args) {
		String a = "abacaba";
		System.out.println(Polindrome(a));
	}

	private static boolean Polindrome(String a) {

		int len = a.length();

		for (int i = 0; i < a.length() / 2; i++) {
			if (a.charAt(i) != a.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
