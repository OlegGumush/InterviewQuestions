package ArraysStrings;

public class Q_33 {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		
		int n = 20;
		System.out.print(n1+" "+n2);
		
		for (int i = 0; i < n-2; i++) {
			n2=n1+n2;
			System.out.print(" "+n2);
			n1 = n2 - n1;
		}
	}
}
