package ArraysStrings;

import java.util.ArrayList;
import java.util.Stack;

class Node {
	private int data;
	private Stack<Integer> st;
	
	public Node(int data) {
		this.data = data;
		st = new Stack<Integer>();
	}
	
	public int getData() {
		return data;
	}
	
	public Stack<Integer> getStack() {
		return st;
	}
}

public class Q_37 {
	

	public static void main(String[] args) {
		int arr[]={1,2,3,4,2,1,2,3,4,90,12,2,3,76};
		ArrayList<Node> a = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			a.add(new Node(arr[i]));
		}
		
		int i =0;
		
		while(a.size()!=1){
			if(a.get(i%a.size()).getData() > a.get((i+1)%a.size()).getData()){
				a.get(i%a.size()).getStack().push(a.get((i+1)%a.size()).getData());
				a.remove((i+1)%a.size());
			}else{
				a.get((i+1)%a.size()).getStack().push(a.get((i)%a.size()).getData());
				a.remove((i)%a.size());
			}
		}
		
		int max1 = a.get(0).getData();
		int max2 = Integer.MIN_VALUE;
		
		for (int val : a.get(0).getStack()) {
			if(val > max2){
				max2 = val;
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}
}
