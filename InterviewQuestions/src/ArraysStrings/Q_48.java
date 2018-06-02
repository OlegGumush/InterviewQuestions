package ArraysStrings;

public class Q_48 {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		
		
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high){
			int mid = (low+high)/2;
			
			if(arr[mid]==mid +1){
				low = mid +1;
			}else{
				high = mid -1;
			}
		}
		
		System.out.println(low+1);
		
		
		
	}
}
