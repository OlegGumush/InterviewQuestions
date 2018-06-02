package ArraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q_22 {

	public static void main(String[] args) {
		int a1[]={1,2,3};
		int a2[]={3,5,6};

		HashMap<Integer, Integer> hash = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0; i < a2.length; i++) {
			set.add(a2[i]);
		}
		
		for (int i = 0; i < a1.length; i++) {
			int key =a1[i];
			if(hash.get(key)==null){
				hash.put(key, 1);
			}else{
				hash.put(key, hash.get(key)+1);
			}
		}
		
		for (int key : set) {
			if(hash.get(key)==null){
				ans.add(key);
			}else{
				hash.remove(key);
			}
		}
		ans.addAll(hash.keySet());
		
		System.out.println(Arrays.toString(ans.toArray()));
	}
}
