package Stack_Queue;

import java.util.Stack;

public class Q_14 {

	public static void main(String[] args) {
		//java stack
		Stack <Integer>s= new Stack();
		s.add(0);
		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		Stack <Integer>temp = new Stack<>();
		
		while(!s.isEmpty()){
			int var = s.pop();
			while(!temp.isEmpty() && temp.peek() > var){
				s.push((Integer) temp.pop());
			}
			temp.push(var);
		}
		System.out.println(temp);
	}
}
