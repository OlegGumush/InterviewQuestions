package ArraysStrings;

public class Q_08 {
	public static void main(String[] args) {
		int n = 100;
		
		for (int i = 2; i <= n; i++) {
			boolean ans = checkIfPrime(i);
			
			if(ans)
				System.out.println(i);
		}
	}

	private static boolean checkIfPrime(int i) {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if(i%j==0)
				return false;
		}
		return true;
	}
}
