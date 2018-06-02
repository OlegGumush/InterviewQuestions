package ArraysStrings;

import java.util.Arrays;
import java.util.Collections;

public class Q_35 {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		/////////////////////////// not my
		/////////////////////////// answer///////////////////////////////////
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(Arrays.toString(arr));
			int minVal = findMinimum(arr);
			System.out.println(" Min is " + minVal);
			Collections.rotate(Arrays.asList(arr), 1);
		}
	}

	private static int MinBinarySearch(Integer[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int min = arr[0];

		if (arr[0] < arr[arr.length - 1])
			return arr[0];

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] < min) {
				min = arr[mid];
			} else if (arr[mid] < arr[end]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return min;
	}

	private static int MaxBinarySearch(Integer[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int max = arr[0];

		if (arr[0] < arr[arr.length - 1])
			return arr[arr.length - 1];

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > max) {
				max = arr[mid];
			} else if (arr[mid] < arr[end]) {
				if (arr[end] > max) {
					max = arr[end];
				}
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return max;
	}

	private static int findMinimum(Integer[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			
			int mid = (start + end) / 2;

			if (arr[mid] < arr[end]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}

		return arr[start];
	}
}
