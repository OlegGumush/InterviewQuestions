package ArraysStrings;

import java.util.Arrays;

public class Q_62 {
	public static void main(String[] args) {
		int A[] = { 10, 11, 12,13, 14,15,22,0, 0, 0, 0, 0 };
		int B[] = {21,22,23,24,25};

		merge(A, B);
	}

	private static void merge(int[] a, int[] b) {
		int end_big = a.length - 1;
		int end_b = b.length - 1;
		int end_a = 0;
		while (a[end_a] != 0) {
			end_a++;
		}
		end_a--;

		while (end_b >= 0 && end_a >= 0) {
			if (a[end_a] > b[end_b]) {
				a[end_big--] = a[end_a--];
			} else {
				a[end_big--] = b[end_b--];
			}
		}
		while(end_b >= 0){
			a[end_big--] = b[end_b--];
		}
		System.out.println(Arrays.toString(a));
	}
}
