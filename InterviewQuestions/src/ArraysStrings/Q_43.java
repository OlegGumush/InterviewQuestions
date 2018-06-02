package ArraysStrings;

import java.util.Arrays;

public class Q_43 {
	public static void main(String[] args) {
		String a = "aeafaga";
		char val ='a';
		
		char arr[]=a.toCharArray();
		int counter=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==val){
				counter++;
			}
		}
		
		arr=new char[arr.length-counter];
		int k=0;
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)!='a'){
				arr[k++]=a.charAt(i);
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
