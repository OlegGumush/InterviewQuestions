package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q_21 {

	public static void main(String[] args) {
		Node n = new Node(10);
		n.left = new Node(5);
		n.right = new Node(15);

		n.left.left = new Node(3);
		n.left.right = new Node(7);

		n.right.right = new Node(18);

		n.right.right.left = new Node(16);
		n.right.right.right = new Node(20);

		ArrayList<LinkedList<Node>> arr = AllHeights(n);

		System.out.println(arr);
	}

	private static ArrayList<LinkedList<Node>> AllHeights(Node n) {

		ArrayList<LinkedList<Node>> result = new ArrayList<>();
		int lvl = 0;
		boolean stop = false;
		result.add(new LinkedList<>());
		result.get(lvl).add(n);

		while (!stop) {
			LinkedList<Node> list = new LinkedList<>();

			for (int i = 0; i < result.get(lvl).size(); i++) {
				Node node = result.get(lvl).get(i);

				if (n != null) {
					if (node.left != null) {
						list.add(node.left);
					}
					if (node.right != null) {
						list.add(node.right);
					}
				}
			}
			if (list.size() > 0) {
				result.add(list);
				lvl++;
			}else{
				stop=true;
			}
		}
		return result;
	}

}
