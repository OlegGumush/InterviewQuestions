package Linked_List;

public class Q_14 {
	public static void main(String[] args) {
		Linked_List_Single l = new Linked_List_Single();
		l.addTail(1);
		l.addTail(2);
		l.addTail(3);
		l.addTail(4);

		reverseRecursive(l);
		System.out.println(l);
	}

	private static void reverse1(Linked_List_Single l) {

		if (l.head == null)
			return;
		if (l.head.next == null)
			return;

		Node_Single curr = l.head;
		Node_Single prev = null;
		Node_Single next = l.head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		l.head = prev;
	}

	private static void reverseRecursive(Linked_List_Single n) {
		n.head = reverseRecursive(n.head);
	}

	private static Node_Single reverseRecursive(Node_Single n) {
		if (n.next != null) {
			Node_Single temp = reverseRecursive(n.next);
			Node_Single curr = temp;
			while (curr.next != null) {
				curr = curr.next;
			}
			n.next = null;
			curr.next = n;
			return temp;
		}
		return n;
	}

	private static void reverseIterative(Linked_List_Single l) {
		Node_Single n = null;

		Node_Single curr = l.head;

		while (curr != null) {
			Node_Single temp = new Node_Single(curr.data);
			curr = curr.next;
			if (n == null) {
				n = temp;
			} else {
				temp.next = n;
				n = temp;
			}
		}

		l.head = n;

	}
}