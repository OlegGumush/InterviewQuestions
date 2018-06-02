package ArraysStrings;

public class Q_28 {
	public static void main(String[] args) {
		String s="123";
		int ans =0;
		
		for (int i = s.length()-1; i >=0; i--) {
			ans *=10;
			ans = Integer.parseInt(""+s.charAt(i))+ans;
		}
		System.out.println(ans);
	}
}
