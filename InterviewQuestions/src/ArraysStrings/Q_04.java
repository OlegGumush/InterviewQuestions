package ArraysStrings;

import java.util.Arrays;

//Merge Sort according to amount of 'a' in the word

public class Q_04 {
	public static void main(String[] args) {
		String arr[]={"ann","nan","naamma","aa","aaaatrert","aabv","fsfasa"};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(String[] arr) {
		mergeSort(arr,0,arr.length-1);
	}
	private static void mergeSort(String[] arr, int start, int end) {
		
		if(start< end){
			int middle = (start+end)/2;
			mergeSort(arr,start,middle);
			mergeSort(arr,middle+1,end);
			merge(arr,start,middle,end);
		}
	}
	private static void merge(String[] arr, int start, int middle, int end) {
		String temp[] = new String[end - start + 1];
		int s1 = start;
		int s2 = middle+1;
		int k=0;
		
		while(s1<=middle && s2<=end){
			if(amountOf_A(arr[s1]) < amountOf_A(arr[s2])){
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
	private static int amountOf_A(String s) {
		int counter =0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a')
				counter++;
		}
		return counter;
	}
}





