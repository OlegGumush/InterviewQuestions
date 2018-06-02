package Binary_Tree;

public class Q_11 {

	public static void main(String[] args) {
		Node n = new Node(10);
		n.left = new Node(5);
		n.right = new Node(15);

		n.left.left = new Node(3);
		n.left.right = new Node(7);

		n.right.right = new Node(18);

		n.right.right.left = new Node(16);
		n.right.right.right = new Node(20);

		System.out.println(checkIfBinary(n));
	}

	private static boolean checkIfBinary(Node n) {
		if (n.left != null && n.right != null) {
			if (n.left.data < n.data && n.right.data > n.data)
				return checkIfBinary(n.left) && checkIfBinary(n.right);
			else
				return false;
		} else if (n.left != null && n.right == null) {
			if (n.left.data < n.data)
				return checkIfBinary(n.left);
			else
				return false;
		} else if (n.left == null && n.right != null) {
			if (n.right.data > n.data)
				return checkIfBinary(n.right);
			else
				return false;
		} else {
			return true;
		}

	}
}
