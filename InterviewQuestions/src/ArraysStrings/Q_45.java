package ArraysStrings;

public class Q_45 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 4 };
		int n = 2;

		int ans = binarySearchRecursive(arr, n);
		System.out.println(ans);
		ans = binarySearchIterative(arr, n);
		System.out.println(ans);
	}

	////////////////////////// binarySearchIterative
	////////////////////////// ////////////////////////////
	private static int binarySearchIterative(int[] arr, int n) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (high + low) / 2;

			if (arr[mid] == n)
				return mid;

			// if low .... mid sorted
			if (arr[low] <= arr[mid]) {
				// check if my element here
				if (arr[low] >= n && n < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
				// second half must be sorted
			} else {
				// check if my element here
				if (arr[mid] < n && n <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}
		return -1;
	}

	///////////////////////// Recursive //////////////////////////////
	private static int binarySearchRecursive(int[] arr, int n) {
		return binarySearchRecursive(arr, n, 0, arr.length - 1);
	}

	private static int binarySearchRecursive(int[] arr, int n, int low, int high) {
		if (high < low)
			return -1;

		int mid = (low + high) / 2;
		if (n == arr[mid])
			return mid;

		// if low .... middle sorted
		if (arr[low] < arr[mid]) {
			// check if key placed in this half
			if (n >= arr[low] && n <= arr[mid]) {
				return binarySearchRecursive(arr, n, low, mid - 1);
				// in the second half
			} else {
				return binarySearchRecursive(arr, n, mid + 1, high);

			}
			// if first half not sorted them mid .... high must be sorted
		} else {
			if (n >= arr[mid] && n <= arr[high]) {
				return binarySearchRecursive(arr, n, mid + 1, high);
			} else {
				return binarySearchRecursive(arr, n, low, mid - 1);
			}
		}
	}

}
