package Stack_Queue;

import java.util.LinkedList;

public class Q_02 {
	public static void main(String[] args) {
		Stack1 s= new Stack1();
		s.add(1);
		s.add(2);
		s.pop();
		System.out.println(s.peek());
		s.pop();
		s.pop();
		s.add(12);
	}
}
class Stack1{
	LinkedList<Integer> l = new LinkedList<>();
	
	public void add(int val){
		l.add(val);
	}
	public Integer pop(){
		if(l.size()==0)
			return null;
		return l.removeLast();
	}
	public Integer peek(){
		return l.getLast();
	}
}