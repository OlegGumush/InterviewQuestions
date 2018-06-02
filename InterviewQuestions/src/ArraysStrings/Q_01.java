package ArraysStrings;


public class Q_01 {

	public static void main(String[] args) {
		char arr[] = { 't', 'b', 'c', 'd', 't', 't', 'e', 't', 'b', 'c', 'd', 'a', 'a', 'e' };
		int b[] = new int[26];
		for (int i = 0; i < arr.length; i++) {
			int index = arr[i];
			b[index - 'a']++;
		}

		// find maximum
		int max = b[0];
		char ans = 'a';

		for (int i = 1; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
				ans = (char) (i + 'a');
			}
		}
		System.out.println(ans);
	}
}
