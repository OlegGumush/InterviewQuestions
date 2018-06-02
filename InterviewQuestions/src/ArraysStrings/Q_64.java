package ArraysStrings;

public class Q_64 {

	public static void main(String[] args) {
		int arr[] = { 90, 91, 92, 93, 80, 81, 82, 83, 84, 70, 71, 72 };
		LIS(arr);
	}

	private static void LIS(int[] arr) {
		int temp[] = new int[arr.length];
		int len = 1;
		temp[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int index = BinaryBetween(temp, arr[i], len);
			if (index == len) {
				len++;
			}
			temp[index] = arr[i];
		}
		System.out.println(len);
	}

	private static int BinaryBetween(int[] temp, int n, int len) {

		if (temp[0] > n)
			return 0;
		if (temp[len - 1] < n)
			return len;

		int low = 0;
		int end = len - 1;

		while (low <= end) {
			int mid = (low + end) / 2;
			if (low == end) {
				return low;
			}
			if (temp[mid] == mid) {
				return mid;
			} else if (temp[mid] < n) {
				low = mid + 1;
			} else {
				end = mid;
			}
		}
		return 0;
	}
}
