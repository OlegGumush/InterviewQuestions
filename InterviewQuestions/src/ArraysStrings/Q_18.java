package ArraysStrings;

import java.util.HashMap;

public class Q_18 {
	public static void main(String[] args) {
		String arr[]={"aaa","aaa","cac","jinga","cac","ji","cac","tata","tata","yoyo"};
		
		HashMap<String, Integer> hash = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			String key =arr[i];
			if(hash.get(key)==null){
				hash.put(key, 1);
			}else{
				hash.put(key, hash.get(key)+1);
			}
		}
		System.out.println(hash);
		System.out.println(hash.keySet());
		System.out.println(hash.values());

	}
}
