package Stack_Queue;

public class Q_12_A {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node headS = null;
	private Node headM = null;

	public void add(int data) {
		if (headS == null) {
			headS = new Node(data);
			headM = new Node(data);
		} else {
			Node n = new Node(data);
			n.next = headS;
			headS = n;

			if (data > headM.data) {
				Node n1 = new Node(data);
				n1.next = headM;
				headM = n1;
			}
		}
	}

	public String toString() {
		String s = "Regular : ";
		Node curr = headS;

		while (curr != null) {
			s += curr.data + "->";
			curr = curr.next;
		}
		s += "\nMaximum : ";
		curr = headM;

		while (curr != null) {
			s += curr.data + "->";
			curr = curr.next;
		}
		return s;
	}

	public int pop() {
		if (headS == null)
			return -10000;
		if (headS.next == null) {
			int data = headS.data;
			headS = headS.next;
			headM = headM.next;
			return data;
		}
		int data = headS.data;
		headS = headS.next;
		if (data == headM.data) {
			headM = headM.next;
		}
		return data;

	}

	public int getMax() {
		if (headM == null)
			return -1;
		return headM.data;
	}

	public static void main(String[] args) {
		Q_12_A a = new Q_12_A();
		a.add(78);
		a.add(3);
		a.add(45);
		a.add(123);
		a.add(34);
		a.add(23);

		a.pop();
		System.out.println(a);
		System.out.println(a.getMax());
		a.pop();
		System.out.println(a);
		System.out.println(a.getMax());

		a.pop();
		System.out.println(a);
		System.out.println(a.getMax());

		a.pop();
		System.out.println(a);
		System.out.println(a.getMax());

		a.pop();
		System.out.println(a);
		System.out.println(a.getMax());

		a.pop();
		System.out.println(a);
		System.out.println(a.getMax());
	}
}
