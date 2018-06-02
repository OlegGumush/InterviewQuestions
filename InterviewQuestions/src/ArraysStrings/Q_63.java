package ArraysStrings;

public class Q_63 {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 2, 7, 7, 9, 4, 6, 8, 10 };

		int i = 0;
		while (i < arr.length) {
			if (arr[i] == i + 1) {
				i++;
			} else {
				if (arr[i] == arr[arr[i]]) {
					System.out.println(arr[i]);
					break;
				}
				int temp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = temp;
				if (arr[i] != i + 1) {
					i--;
				}
			}
		}
	}
}
