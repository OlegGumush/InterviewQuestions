package ArraysStrings;

public class Q_49 {
	public static void main(String[] args) {
		String s1 = "gmikomikp";
		String s2 = "kimp";

		int counter = 0;
		int bucket[] = new int[26];
		int start = 0;
		boolean start_b = false;
		prepare(bucket, s2);

		for (int i = 0; i < s1.length(); i++) {
			if (counter == 0 && bucket[s1.charAt(i) - 'a'] != 0) {
				start = i;
				start_b = true;
				counter++;
				bucket[s1.charAt(i) - 'a']--;
				if (counter == s2.length()) {
					System.out.println(start + " " + counter);
					break;
				}
			} else if (bucket[s1.charAt(i) - 'a'] != 0) {
				counter++;
				bucket[s1.charAt(i) - 'a']--;
				if (counter == s2.length()) {
					System.out.println("fiks!!");
					break;
				}
			} else {
				counter = 0;
				if (start_b) {
					i = start;
					start_b = false;
				}
				prepare(bucket, s2);
			}
		}

	}

	private static void prepare(int[] bucket, String s2) {
		for (int i = 0; i < s2.length(); i++) {
			bucket[s2.charAt(i) - 'a']++;
		}
	}

}
