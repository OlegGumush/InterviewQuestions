package ArraysStrings;

public class Q_61 {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "deabc";
		
		s1 +=s1;
		System.out.println(s1);
		// contains = isSubstring 
		System.out.println(s1.contains(s2));
	}
}
