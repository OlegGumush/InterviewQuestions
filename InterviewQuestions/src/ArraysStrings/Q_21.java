package ArraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q_21 {
	public static void main(String[] args) {
		int a1[]={1,3,5,7,9,11,13,15,17,19};
		int a2[]={2,4,6,7,8,10,12,13,15,16,17};

		HashMap<Integer, Integer> hash = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int i = 0; i < a1.length; i++) {
			int key =a1[i];
			if(hash.get(key)==null){
				hash.put(key, 1);
			}else{
				hash.put(key, hash.get(key)+1);
			}
		}
		
		for (int i = 0; i < a2.length; i++) {
			if(hash.get(a2[i])!=null){
				ans.add(a2[i]);
			}
		}
		
		System.out.println(Arrays.toString(ans.toArray()));
	}
}
