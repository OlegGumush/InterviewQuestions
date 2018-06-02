package ArraysStrings;

import java.util.HashMap;

public class Q_46 {

	public static void main(String[] args) {
		String s = "abccdeeopllcgyu";
		HashMap<Character, Integer> hash = new HashMap<>();
		String ans = "";
		String maxAns = "";
		int counter = 0;
		int maxCounter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (hash.get(s.charAt(i)) == null) {
				hash.put(s.charAt(i), 1);
				ans += s.charAt(i);
				counter++;
				if(counter > maxCounter){
					maxCounter=counter;
					maxAns=ans;
				}
			}else{
				hash.clear();
				counter =0;
				ans = "";
				i--;
			}
		}
		
		System.out.println(maxAns);

	}
}
