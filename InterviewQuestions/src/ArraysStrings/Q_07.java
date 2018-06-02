package ArraysStrings;

public class Q_07 {
	public static void main(String[] args) {
		int arr[]={1,15,90,901,1001};
		int k = 105;
		System.out.println(TwoElementsWithSum_K(arr,k));
	}
	private static boolean TwoElementsWithSum_K(int[] arr, int k) {
		
		int start =0;
		int end = arr.length-1;
		
		while( start < end){
			int sum = arr[start]+arr[end];
			if(sum==k){
				return true;
			}
			if(sum > k){
				end--;
			}else{
				start++;
			}
		}
		return false;
	}
}
