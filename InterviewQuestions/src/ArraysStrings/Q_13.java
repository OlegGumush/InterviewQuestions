package ArraysStrings;

//Binary Search Between
public class Q_13 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 10, 15, 120, 145, 190, 200 };
		int n = 121;
		System.out.println(binarySearchBetween(arr, n));
	}

	private static int binarySearchBetween(int[] arr, int n) {
		if (n < arr[0])
			return 0;
		if (n > arr[arr.length - 1])
			return arr.length;

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			if (start == end)
				return start;

			int mid = (start + end) / 2;

			if (arr[mid] == n)
				return mid;
			else if (arr[mid] < n) {
				start = mid + 1;
			} else {
				end = mid ;
			}
		}
		return -1;
	}
}
