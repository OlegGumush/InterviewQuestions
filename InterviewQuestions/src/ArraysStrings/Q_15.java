package ArraysStrings;

public class Q_15 {

	public static void main(String[] args) {
		int n = 25;
		System.out.println(Irerative(n));
		System.out.println(Recursion(n));
	}

	private static int Recursion(int n) {
		if(n==0)
			return 1;
		return n*Recursion(n-1);
		
	}

	private static int Irerative(int n) {
		if(n==0)
			return 1;
		
		int temp = 1;
		for (int i = 2; i <= n; i++) {
			temp *=i;
		}
		return temp;
	}
}
