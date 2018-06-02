package ArraysStrings;

public class Q_30 {

	public static void main(String[] args) {
		String s = "abcdedtkieacdeler";
		int counter=1;
		int maxCounter=1;

		String ans=""+s.charAt(0);
		String maxAns="";

		
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)-s.charAt(i-1)==1){
				counter++;
				ans +=s.charAt(i);
				if(counter>maxCounter){
					maxCounter=counter;
					maxAns=ans;
				}
			}else{
				ans = ""+s.charAt(i);
				counter=1;
			}
		}
		
		System.out.println(maxAns);
		
	}
}
