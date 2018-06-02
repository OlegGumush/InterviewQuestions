package ArraysStrings;

import java.util.HashMap;

public class Q_42 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = "acefbd";
		
		System.out.println(F(s1,s2 , s3));
	}

	private static boolean F(String s1 , String s2 , String s3) {
		if(s1.length() + s2.length() != s3.length())
			return false;
		
		HashMap<Character,Integer> a = new HashMap<>();
		
		for (int i = 0; i < s3.length(); i++) {
			if(a.get(s3.charAt(i))==null){
				a.put(s3.charAt(i),1);
			}else{
				a.put(s3.charAt(i), a.get(s3.charAt(i))+1);
			}
		}
		
		for (int i = 0; i < s1.length(); i++) {
			if(a.get(s1.charAt(i))==null || a.get(s1.charAt(i))==0){
				return false;
			}else{
				a.put(s1.charAt(i), a.get(s1.charAt(i))-1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if(a.get(s2.charAt(i))==null || a.get(s2.charAt(i))==0){
				return false;
			}else{
				a.put(s2.charAt(i), a.get(s2.charAt(i))-1);
			}
		}
		
		return true;
	}
}
