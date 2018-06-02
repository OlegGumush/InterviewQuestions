package ArraysStrings;

public class Q_02 {

	public static void main(String[] args) {
		int arr[]={2,2,2,1,1,1,1};
		int ans = arr[0];
		int counter = 1;
		
		for (int i =1; i < arr.length; i++) {
			if(ans == arr[i]){
				counter++;
			}else{
				counter--;
				if(counter < 0){
					ans = arr[i];
					counter=1;
				}
			}
		}
		
		counter=0;
		for (int i = 0; i < arr.length; i++) {
			if(ans == arr[i]){
				counter++;
			}
		}
		
		if(counter>arr.length/2){
			System.out.println(ans);
		}else{
			System.out.println("No answer");
		}
	}
}
