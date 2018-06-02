package ArraysStrings;

import java.util.Arrays;
import java.util.HashSet;

public class Q_39 {
	
	public static void main(String[] args) {
		String s[]={"aas","we","re","we","aas"};
		
		HashSet<String> a = new HashSet<>();
		
		for (int i = 0; i < s.length; i++) {
			a.add(s[i]);
		}
		
		System.out.println(Arrays.toString(a.toArray()));
	}
}
