package ArraysStrings;

import java.util.Arrays;

//Bucket Sort

public class Q_05 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1 };
		BucketSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void BucketSort(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
		}

		int temp[] = new int[max - min + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[arr[i] - min]++;
		}

		int k = 0;

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i]; j++) {
				arr[k++] = i + min;
			}
		}
	}
}
