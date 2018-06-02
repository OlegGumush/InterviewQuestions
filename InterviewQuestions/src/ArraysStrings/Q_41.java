package ArraysStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Q_41 {
	public static void main(String[] args) {
		String s= "bananas";
		String ans ="";
		
		/////////////////// O(n^2) //////////////////
		for (int i = 0; i < s.length(); i++) {
			if(!ans.contains(""+s.charAt(i))){
				ans +=s.charAt(i);
			}
		}
		System.out.println(ans);
		///////////////////// O(N)///////////////////////
		
		ans = "";
		Hashtable<Character,Integer> hash = new Hashtable<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(hash.get(s.charAt(i))==null){
				hash.put(s.charAt(i),1);
				ans += s.charAt(i);
			}
		}
		System.out.println(ans);
		////////////////////////////////////////////////////
	
	}
}



