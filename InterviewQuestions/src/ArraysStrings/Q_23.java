package ArraysStrings;

import java.util.Arrays;

public class Q_23 {
	public static void main(String[] args) {
		int arr[]={1,2,3};
		int n =1;
		
		Onk(arr, n);
		
		int arr1[]={1,2,3};
		int n1 =1;
		On(arr1, n1);
	}

	private static void Onk(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length; j++) {
				int temp1 = arr[(j+1)%arr.length];
				arr[(j+1)%arr.length]=temp;
				temp=temp1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	private static void On(int[] arr, int n) {
		
		reverse(0, n , arr);
		reverse(n, arr.length, arr);
		reverse(0, arr.length, arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void reverse(int i , int j , int arr[]) {
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j - 1];
			arr[j - 1] = temp;
			i++;
			j--;
		}
	}
}
