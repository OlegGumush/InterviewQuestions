package ArraysStrings;

public class Q_16 {

	public static void main(String[] args) {
		String s = "  sdsd sdsd   sdsd   sd   sd   s ";
		int counter =0;
		
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)!= ' ' && s.charAt(i+1)==' ' ){
				counter++;
			}
		}
		if(s.charAt(s.length()-1)!=' '){
			counter++;
		}
		System.out.println(counter);
		
	}
}
