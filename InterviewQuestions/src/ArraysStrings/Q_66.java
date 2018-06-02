package ArraysStrings;

public class Q_66 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3,-6, 7, 8,-20, 1, 2, 3 };

		Best(arr);
	}

	private static void Best(int[] arr) {
		int sum = 0;
		int start =0;
		int indexStart = 0;
		int indexEnd =0;
		int bestSum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if(sum > bestSum){
				indexStart = start;
				bestSum = sum;
				indexEnd = i;
			}else if(sum <=0){
				start = i+1;
				sum =0;
			}
		}
		
		for (int i = indexStart; i <= indexEnd; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
