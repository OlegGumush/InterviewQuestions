package ArraysStrings;

import java.util.Arrays;

//Merge Sort

public class Q_03 {
	public static void main(String[] args) {
		int arr[]={2,1,3,1,1,1,1,1,2,3,4,5,6,7,8,9};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr) {
		mergeSort(arr,0,arr.length-1);
	}
	private static void mergeSort(int[] arr, int start, int end) {
		
		if(start< end){
			int middle = (start+end)/2;
			mergeSort(arr,start,middle);
			mergeSort(arr,middle+1,end);
			merge(arr,start,middle,end);
		}
	}
	private static void merge(int[] arr, int start, int middle, int end) {
		int temp[] = new int[end - start + 1];
		int s1 = start;
		int s2 = middle+1;
		int k=0;
		
		while(s1<=middle && s2<=end){
			if(arr[s1]<arr[s2]){
				temp[k++]=arr[s1++];
			}else{
				temp[k++]=arr[s2++];
			}
		}
		while(s1<=middle){
			temp[k++]=arr[s1++];
		}
		while(s2<=end){
			temp[k++]=arr[s2++];
		}
		
		for (int i = 0; i < temp.length; i++) {
			arr[start+i]=temp[i];
		}
	}
}





