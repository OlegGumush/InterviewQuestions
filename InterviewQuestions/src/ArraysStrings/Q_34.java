package ArraysStrings;

public class Q_34 {
	public static void main(String[] args) {
		int n = 651232156;
		
		boolean poli = true;
		int numOfDigit=0;
		int start =1;
		int temp = n;
		while(temp!=0){
			numOfDigit++;
			start*=10;
			temp=temp/10;
		}
		start/=10;
		
		for (int i = 0; i < numOfDigit/2; i++) {
			int a = n/start%10;
			int b = n%10;
			if(a!=b){
				poli = false;
				System.out.println("No Polindrome");
			}else{
				n/=10;
				start/=100;
			}
		}
		if(poli) {
			System.out.println("Polindrome");			
		}
		
		
		
	}
}
