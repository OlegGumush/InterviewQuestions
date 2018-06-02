package ArraysStrings;

public class Q_31 {

	public static void main(String[] args) {
		String big = "abcd";
		String small ="abcde";
		
		int ans = IndexOf(big,small);
		System.out.println(ans);

	}

	private static int IndexOf(String big, String small) {
		if(big.length()<small.length())
			return -1;
		for (int i = 0; i < big.length(); i++) {
			if(big.charAt(i)==small.charAt(0)){
				int counter=0;
				int j=0;
				int k=i;
				
				while(j < small.length()) {
					if(big.charAt(k)==small.charAt(j)){
						k++;
						counter++;
						if(counter==small.length())
							return i;
					}else{
						break;
					}
					j++;
				}
			}
		}	
		return -1;
	}
}
