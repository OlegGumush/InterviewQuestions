package ArraysStrings;

import java.util.Arrays;

public class Q_06 {
	public static void main(String[] args) {
		int arr[]={2,2,90,1,2,1};
		int index = SumBeforeAfterWithArrays(arr);
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println("ans : "+index);
	}

	private static int SumBeforeAfterWithArrays(int[] arr) {
		int t1[] = new int[arr.length];
		int t2[] = new int[arr.length];
		
		t1[0]=arr[0];
		for (int i = 1; i < t1.length; i++) {
			t1[i] = t1[i-1]+arr[i];
		}
		
		t2[t2.length-1]=arr[arr.length-1];
		for (int i = arr.length-2 ; i >= 0; i--) {
			t2[i] = t2[i+1]+arr[i];
		}
		
		for (int i = 0; i < t2.length; i++) {
			if(t1[i]==t2[i]){
				return i;
			}
		}
		return -1;
	}
}
