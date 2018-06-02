package ArraysStrings;

import java.util.Arrays;

public class Q_40 {
	public static void main(String[] args) {
		String s = "Java is best programming language"; 
		char arr[]=s.toCharArray();
		

		reverse(arr,0,arr.length-1);

		int start = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==' '){
				reverse(arr,start,i-1);
				start = i+1;
			}else if(i== arr.length -1){
				reverse(arr,start,i);
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void reverse(char arr[],int s,int e){
		int len = (e - s + 1);
		for (int i = 0; i < len/2; i++) {
			char temp = arr[i+s];
			arr[i+s]=arr[e - i];
			arr[e-i]=temp;
		}
	}
}
