package ArraysStrings;

import java.util.Arrays;

public class Q_32 {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,3,2,1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length -i -1; j++) {
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		//reverse Bubble Sort
		int arr1[]={5,4,3,2,1};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j >= 1; j--) {
				if(arr1[j]<arr1[j-1]){
					swap(arr1,j,j-1);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr1));
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
