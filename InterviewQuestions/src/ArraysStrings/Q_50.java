package ArraysStrings;

import java.util.ArrayList;

public class Q_50 {


	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		int counter[] = new int[arr.length];
		
		for (int i = 0; i < Math.pow(2 , arr.length); i++) {	
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0; j < counter.length; j++) {
				if(counter[j] ==1){
					temp.add(arr[j]);
				}
			}
			a.add(temp);
			counterUp(counter);
		}
		
		//bubble sort
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size() -i -1; j++) {
				if(a.get(j).size() > a.get(j+1).size()){
					swap(a,j,j+1);
				}
			}
		}
		
		System.out.println(a);
	}


	private static void swap(ArrayList<ArrayList<Integer>> a, int i, int j) {
		ArrayList<Integer> temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}


	private static void counterUp(int[] counter) {
		for (int i = 0; i < counter.length; i++) {
			if(counter[i]==0){
				counter[i] =1 ;
				break;
			}else{
				counter[i]=0;
			}
		}
	}
	
	
	
}
