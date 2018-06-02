package Stack_Queue;

import java.util.Stack;

public class Q_13 {

	public static void main(String[] args) {
		Heap_Stacks h = new Heap_Stacks(10, 3);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(7);
		h.add(8);

	}
}
class Heap_Stacks{
	
	Stack arr[];
	int stack_size;
	int curr =0;
	
	public Heap_Stacks(int heap_size , int stack_size){
		arr = new Stack[heap_size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new Stack<>();
		}
		this.stack_size=stack_size;
	}
	
	public void add(int val){
		if(arr[curr].size() == stack_size){
			curr++;
		}
		arr[curr].add(val);
	}
	public int pop(){
		if(arr[curr].size()==0 && curr == 0){
			System.out.println("cant pop");
			return Integer.MIN_VALUE;
		}
		
		int val = (int)arr[curr].pop();
		if(arr[curr].size() ==0){
			curr--;
		}
		return val;
	}
	
}
