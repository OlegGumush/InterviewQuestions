package Linked_List;

// remove Duplicates from Single linked list

public class Q_11 {
	public static void main(String[] args) {
		Linked_List_Single l = new Linked_List_Single();
		l.addTail(1);
		l.addTail(2);
		l.addTail(1);
		l.addTail(2);
		l.addTail(5);

		removeDuplicates(l);
		System.out.println(l.toString());
	}

	public static void removeDuplicates(Linked_List_Single l) {
		if( l== null){
			return;
		}
		if (l.head == null)
			return;
		if (l.head.next == null)
			return;

		for (Node_Single i = l.head.next; i != null; i = i.next) {
			Node_Single prev = l.head;
			Node_Single curr = l.head;

			while (curr != i) {
				if (curr.data == i.data) {
					if (curr == l.head) {
						l.head = l.head.next;
						prev = l.head;
						curr = l.head;
					} else {
						prev.next = curr.next;
						curr = prev.next;
					}
				} else {
					if (curr == prev) {
						curr = curr.next;
					} else {
						curr = curr.next;
						prev = prev.next;
					}
				}
			}
		}
	}
}
