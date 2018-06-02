package ArraysStrings;

import java.util.HashMap;

public class Q_25 {

	public static void main(String[] args) {
		String s= "aabccdefgghjiii";
		HashMap<Character, Integer> hash = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(hash.get(s.charAt(i))==null){
				hash.put(s.charAt(i), 1);
			}else{
				hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
			}
		}
		for (char key : hash.keySet()) {
			if(hash.get(key)>1)
				System.out.println(key);
		}
	}
}
