package ArraysStrings;

import java.util.HashMap;

public class Q_26 {
	public static void main(String[] args) {
		String s="abcde";
		String s1="bcade";
		boolean b = true;
		HashMap<Character, Integer> hash = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(hash.get(s.charAt(i))==null){
				hash.put(s.charAt(i), 1);
			}else{
				hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
			}
		}
		
		for (int i = 0; i < s1.length(); i++) {
			if(hash.get(s1.charAt(i))==null){
				System.out.println("not Anagram");
				b=false;
				break;
			}else{
				hash.put(s1.charAt(i), hash.get(s1.charAt(i))-1);
			}
		}
		
		for (Integer i : hash.values()) {
			if(i!=0){
				System.out.println("not Anagram");
				b=false;
				break;
			}
		}
		if(b)
			System.out.println("Anagram");
	}
}
