package Stack_Queue;

import java.util.LinkedList;

public class Q_04 {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		try {
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Queue{
	LinkedList<Integer> l = new LinkedList<>();

	public void add(Integer val){
		l.addFirst(val);
	}
	public Integer pop() throws Exception{
		if(l.size()==0)
			throw new Exception();
		return l.removeFirst();
	}
	
}