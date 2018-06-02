package ArraysStrings;

import java.util.Arrays;

public class Q_53 {
	static void permute(int arr[], int k) {
		for (int i = k; i < arr.length; i++) {
			swap(arr, i, k);
			permute(arr, k + 1);
			swap(arr, k, i);
		}
		if (k == arr.length - 1) {
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void swap(int[] arr, int i, int k) {
		int temp=arr[i];
		arr[i]=arr[k];
		arr[k]=temp;
	}

	public static void main(String[] args) {
		int arr[]={1,2,3};

		permute(arr, 0);
	}
}
