package Linked_List;

public class Linked_List_Single {
	Node_Single head = null;

	public void addHead(int data) {
		Node_Single n = new Node_Single(data);

		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void addTail(int data) {
		Node_Single n = new Node_Single(data);

		if (head == null) {
			head = n;
		} else {
			Node_Single curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = n;
		}
	}

	public void removeFirst() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		}
		head = head.next;
	}

	public void removeLast() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		}
		Node_Single curr = head;
		Node_Single prev = head;

		while (curr.next != null) {
			if (curr == prev) {
				curr = curr.next;
			} else {
				curr = curr.next;
				prev = prev.next;
			}
		}
		prev.next = null;
	}

	public String toString() {
		String ans = "";

		Node_Single curr = head;

		while (curr != null) {
			ans = ans + curr.data + "->";
			curr = curr.next;
		}
		return ans;
	}
}
