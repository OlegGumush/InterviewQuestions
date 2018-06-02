
package Stack_Queue;

public class Q_12 {
	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.add(10);
		s.add(2);
		s.add(15);
		s.add(12);
		s.add(4);
		s.add(20);
		
		System.out.println(s.peek_max());
		s.pop();
		System.out.println(s.peek_max());
		s.pop();
		System.out.println(s.peek_max());
		s.pop();
		System.out.println(s.peek_max());
		s.pop();
		System.out.println(s.peek_max());
	}
}
class Stack {
	int stack[];
	int max[];
	int index_stack=0;
	int index_max=0;
	
	public Stack(int size){
		stack = new int[size];
		max = new int[size];
	}
	
	public void add(int val){
		if(index_stack == stack.length){
			return ;
		}
		
		if(index_max==0){
			max[index_max++]=val;
			stack[index_stack++]=val;
		}else{
			stack[index_stack++]=val;
			if(val > max[index_max-1]){
				max[index_max++]=val;
			}
		}
	}
	
	public int pop(){
		if(index_stack ==0){
			return Integer.MIN_VALUE;
		}
		int val = stack[index_stack-1];
		index_stack--;
		if(val == max[index_max-1]){
			index_max --;
		}
		return val;
	}
	
	public int peek_max(){
		return max[index_max-1];
	}
}






