package ArraysStrings;

import java.util.HashMap;

public class Q_69 {

	public static void main(String[] args) {
		int arr[] = { -1,7,5, 3, 2, 6, 4, 1, 1, 3, 3, 0 };
		f(arr, 6);
	}

	private static void f(int[] arr, int n) {
		HashMap<Integer, Integer> h = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (h.get(arr[i]) != null && h.get(arr[i]) != 0) {
				System.out.println(n - arr[i] + " " + arr[i]);
			}
			if (h.get(n - arr[i]) == null) {
				h.put(n - arr[i], 1);
			} else
				h.put(n - arr[i], h.get(n - arr[i] + 1));
		}
	}
}
