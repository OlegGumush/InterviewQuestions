package ArraysStrings;

import java.util.ArrayList;

public class Q_56 {
	public static void main(String[] args) {
		int arr1[] = { 1,2,3,4,5,100,1000,2000 };
		int arr2[] = { 6,7,8,9,10,98,100 };
		int arr3[] = { 11,12,13,14,15,99,100};

		//****************SHORT SOLUTION************************************
		System.out.println(newFun(arr1,arr2,arr3));
		
		
		//****************LONG SOLUTION************************************
		//remove duplicates O(3n)
		arr1 = removeDuplicates(arr1);
		arr2 = removeDuplicates(arr2);
		arr3 = removeDuplicates(arr3);

		//merge O(4n)
		int arr[] = merge(arr1, arr2);
		arr = merge(arr, arr3);
		
		//pass arr O(3n)
		for (int i = 0; i < arr.length-2; i++) {
			if(arr[i]==arr[i+1] && arr[i]==arr[i+2]){
				System.out.println(arr[i]);
				break;
			}
		}
		
		//O(10n)=O(n)
	}

	private static int newFun(int[] arr1, int[] arr2, int[] arr3) {
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length && k<arr3.length ){
			if(arr1[i] == arr2[j] && arr1[i] == arr3[k]){
				return arr1[i];
			}
			if(arr1[i] < arr2[j] || arr1[i] < arr3[k]){
				i++;
			}else if(arr2[j] < arr1[i]){
				j++;
			}else if(arr3[k] < arr1[i]){
				k++;
			}
		}
		return -1;
	}

	private static int[] merge(int a[], int[] b) {
		int i = 0;
		int j = 0;
		int temp[] = new int[a.length + b.length];
		int k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = b[j++];
			}
		}

		while (i < a.length) {
			temp[k++] = a[i++];
		}
		while (j < b.length) {
			temp[k++] = b[j++];
		}
		
		return temp;
	}

	private static int[] removeDuplicates(int[] arr) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				a.add(arr[0]);
			} else if (arr[i] != arr[i - 1]) {
				a.add(arr[i]);
			}
		}
		int temp[] = new int[a.size()];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = a.get(i);
		}
		return temp;
	}
}
