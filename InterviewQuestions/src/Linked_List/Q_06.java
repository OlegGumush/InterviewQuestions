package Linked_List;

public class Q_06 {

	public static void main(String[] args) {
		Linked_List_Single l1 = new Linked_List_Single();
		l1.addTail(1);
		l1.addTail(3);
		l1.addTail(5);

		Linked_List_Single l2 = new Linked_List_Single();
		l2.addHead(2);
		l2.addTail(4);
		l2.addTail(6);
		l2.addTail(8);

		Linked_List_Single l3 = merge(l1, l2);
		System.out.println(l3);
	}

	private static Linked_List_Single merge(Linked_List_Single l1, Linked_List_Single l2) {
		Linked_List_Single l3 = new Linked_List_Single();
		Node_Single curr1 = l1.head;
		Node_Single curr2 = l2.head;

		while (curr1 != null && curr2 != null) {
			if (curr1.data < curr2.data) {
				l3.addTail(curr1.data);
				curr1 = curr1.next;
			} else {
				l3.addTail(curr2.data);
				curr2 = curr2.next;
			}
		}
		while (curr1 != null) {
			l3.addTail(curr1.data);
			curr1 = curr1.next;
		}
		while (curr2 != null) {
			l3.addTail(curr2.data);
			curr2 = curr2.next;
		}
		

		return l3;
	}
}
