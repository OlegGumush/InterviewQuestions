package ArraysStrings;

public class Q_59 {
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(check(s));
	}

	private static boolean check(String s) {
		int checker=0;
		
		for (int i = 0; i < s.length(); i++) {
			if((checker & (1 << s.charAt(i)-'a')) > 0){
				return false;
			}
			checker = checker | (1 << s.charAt(i) - 'a');
		}
		return true;
	}
}
