package ArraysStrings;

//Binary Search Iterative + Recursive
public class Q_12 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 10, 15, 120, 145, 190, 200 };
		int n = 200;
		System.out.println(binarySearchRecursive(arr, n));
		System.out.println(binarySearch(arr, n));
	}

	private static int binarySearch(int[] arr, int n) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == n)
				return mid;
			else if (arr[mid] > n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	private static int binarySearchRecursive(int[] arr, int n) {
		return binarySearchRecursive(arr, 0, arr.length - 1, n);
	}

	private static int binarySearchRecursive(int[] arr, int start, int end, int n) {

		if (start > end)
			return -1;

		int mid = (start + end) / 2;
		if (arr[mid] == n) {
			return mid;
		}
		if (arr[mid] > n) {
			return binarySearchRecursive(arr, start, mid - 1, n);
		} else {
			return binarySearchRecursive(arr, mid + 1, end, n);
		}
	}
}
