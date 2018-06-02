package ArraysStrings;

import java.util.ArrayList;

public class Q_36 {
	public static void main(String[] args) {
		int n = 81*1024*125;
		int k = 2;
		ArrayList<Integer> a = new ArrayList<>();

		while (n != 1) {
			if (n % k == 0) {
				n /= k;
				a.add(k);
//              only primaries without pow's
//				while(n%k ==0){
//					n/=k;
//				}
			} else {
				k++;
			}
		}
		System.out.println(a);
	}
}
