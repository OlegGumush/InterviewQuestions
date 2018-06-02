package ArraysStrings;

import java.util.Arrays;

public class Q_09 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			if (arr[start] % 2 == 0 && arr[end] % 2 == 1) {
				start++;
				end--;
			} else if (arr[start] % 2 == 0 && arr[end] % 2 == 0) {
				start++;
			} else if (arr[start] % 2 == 1 && arr[end] % 2 == 1) {
				end--;
			} else {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
