package ArraysStrings;

import java.util.Arrays;

public class Q_67 {

	// red = 0
	// yellow = 1
	// green = 2;

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 2, 2, 2, 1, 1, 1, 2, 0, 0, 0, 0, 1, 2, 2, 1, 2, 2, 0, 1, 2, 0, 1, 2 };

		int s = 0;
		int e = arr.length - 1;

		while (s < e) {
			if (arr[s] == 0) {
				s++;
			} else if (arr[e] != 0) {
				e--;
			} else {
				swap(arr, s, e);
			}
		}
		System.out.println(Arrays.toString(arr));

		e = arr.length - 1;
		while (s < e) {
			if (arr[s] == 1) {
				s++;
			} else if (arr[e] == 2) {
				e--;
			} else {
				swap(arr, s, e);
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
}
