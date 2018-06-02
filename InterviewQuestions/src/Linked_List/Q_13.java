package Linked_List;

public class Q_13 {

	public static void main(String[] args) {
		Linked_List_Single l = new Linked_List_Single();
		l.addTail(1);
		l.addTail(3);
		l.addTail(5);
		l.addTail(1);
		l.addTail(3);
		l.addTail(5);
		
		System.out.println(sumNodes(l));
	}

	private static int sumNodes(Linked_List_Single l) {
		return sumNodes(l.head);
	}

	private static int sumNodes(Node_Single n) {
		if(n==null)
			return 0;
		return sumNodes(n.next)+1;
	}
}
