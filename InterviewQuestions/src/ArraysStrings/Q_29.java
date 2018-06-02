package ArraysStrings;

import java.util.Arrays;

public class Q_29 {

	public static void main(String[] args) {
		String a="aaa bbb ccc  ddd";
		int counter=0;
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)==' ')
				counter++;
		}
		
		char temp[]=new char[a.length()+2*(counter)];
		int k=0;
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)!=' '){
				temp[k++]=a.charAt(i);
			}else{
				temp[k++]='%';		
				temp[k++]='2';
				temp[k++]='0';
			}
		}
		System.out.println(Arrays.toString(temp));
		
	}
}
