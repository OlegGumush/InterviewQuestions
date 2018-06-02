package ArraysStrings;

public class Q_57 {
	
	
	public static void main(String[] args) {
		String s2 = "a*b?*?";
		String s1 = "azzbtzzu";
		System.out.println(f("geeks", "g*ks")); // Yes
		System.out.println(f("geeksforgeeks", "ge?ks*")); // Yes
		System.out.println(f("gee", "g*k"));  // No because 'k' is not in second
		System.out.println(f("pqrst", "*pqrs")); // No because 't' is not in first
		System.out.println(f("abcdhghgbcd", "abc*bcd")); // Yes
		System.out.println(f("abcd", "abc*c?d")); // No because second must have 2
	                             // instances of 'c'
		System.out.println(f("abcd", "*b*d")); // Yes
		System.out.println(f("abcdojaaa", "*?c*d*aaa")); // Yes
		
		
	}

	private static boolean f(String s1, String s2) {
		if(s1.equals("") && s2.equals(""))
			return true;
		if(s1.equals("") && s2.equals("*"))
			return true;
		if(!s1.equals("") && s2.equals("*"))
			return true;
		if(s1.equals("") && !s2.equals(""))
			return false;
		if(!s1.equals("") && s2.equals(""))
			return false;
		
		if(s1.charAt(0) == s2.charAt(0) || s2.charAt(0)=='?')
			return f(s1.substring(1) , s2.substring(1));
		else if(s2.charAt(0) == '*'){
			return f(s1.substring(0),s2.substring(1)) || f(s1.substring(1),s2.substring(0));
		}else{
			return false;
		}
	}
}
