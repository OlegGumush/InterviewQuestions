package Linked_List;

public class Linked_List_Double {

	public Node_Double head = null;
	public Node_Double tail = null;

	public void addHead(int data) {
		Node_Double n = new Node_Double(data);
		if (head == null) {
			head = n;
			tail = n;
		}
		head.prev = n;
		n.next = head;
		head = n;
	}

	public void addTail(int data) {
		Node_Double n = new Node_Double(data);
		if (head == null) {
			head = n;
			tail = n;
		}
		tail.next = n;
		n.prev = tail;
		tail = n;
	}

	public void removeElement(int data) {

		Node_Double curr = head;
		while (curr != null && curr.data != data) {
			curr = curr.next;
		}
		if (curr == null)
			return;

		if (curr == head) {
			removeHead();
		} else if (curr == tail) {
			removeTail();
		} else {
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
		}
	}

	public void removeTail() {
		if (head == null)
			return;
		if (head.next == null) {
			head = tail = null;
		}
		tail = tail.prev;
		tail.next = null;
	}

	public void removeHead() {
		if (head == null)
			return;
		if (head.next == null) {
			head = tail = null;
			return ;
		}
		head = head.next;
		head.prev = null;
	}

	public String toString() {
		String ans = "";
		Node_Double curr = head;

		while (curr != null) {
			ans += curr.toString();
			curr = curr.next;
		}
		return ans;
	}
}
