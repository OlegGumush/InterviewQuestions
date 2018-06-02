package ArraysStrings;

import java.util.Arrays;

public class Q_14 {

	public static void main(String[] args) {
		int arr[]={1,3,5,7,9,11,13,15,17,19};
		int arr1[]={2,4,6,8,10,12,14,16,18,20};
		
		System.out.println(Arrays.toString(merge(arr,arr1)));
		
	}

	private static int[] merge(int[] arr, int[] arr1) {
		int temp []=new int[arr.length+arr1.length];
		int s1 = 0;
		int s2 = 0;
		int k=0;
		
		while(s1<arr.length && s2<arr1.length){
			if(arr[s1] < arr1[s2]){
				temp[k++]=arr[s1++];
			}else{
				temp[k++]=arr1[s2++];
			}
		}
		while(s1< arr.length){
			temp[k++]=arr[s1++];
		}
		while(s2< arr1.length){
			temp[k++]=arr1[s2++];
		}
		return temp;
	}
}
