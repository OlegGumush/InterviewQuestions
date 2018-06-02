package Linked_List;

public class Q_12 {
	public static void main(String[] args) {
		Linked_List_Single l = new Linked_List_Single();
		l.addTail(1);
		l.addTail(2);
		l.addTail(3);
		l.addTail(4);
		l.addTail(5);
		l.addTail(6);
		l.addTail(7);
		l.addTail(8);
		l.addTail(9);
		l.addTail(10);

		int n = 3;
		System.out.println(NthElement(l , n));
	}

	///////////////////////////// Q_12//////////////////////////////
	public static int NthElement(Linked_List_Single l, int n) {
		Node_Single runner1 = l.head;
		int counter = 0;

		while (counter < n) {
			runner1 = runner1.next;
			counter++;
		}

		Node_Single runner2 = l.head;

		while (runner1 != null) {
			runner1 = runner1.next;
			runner2 = runner2.next;
		}
		return runner2.data;
	}
}
