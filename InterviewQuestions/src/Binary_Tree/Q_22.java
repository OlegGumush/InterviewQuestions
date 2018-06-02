package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;

import Binary_Tree.Binary_Tree.Node;

public class Q_22 {

	// לעביר עץ למערך
	public static void main(String[] args) {
		Binary_Tree t = new Binary_Tree();
		t.add(10);
		t.add(5);
		t.add(3);
		t.add(7);
		t.add(15);
		t.add(18);
		t.add(16);
		t.add(20);

		t.inOrder();
		System.out.println();
		ArrayList<Integer> a = new ArrayList<>();

		saveTree(t.head, a);

		Binary_Tree t1 = new Binary_Tree();

		for (int i = 0; i < a.size(); i++) {
			t1.add(a.get(i));
		}

		t1.inOrder();
	}

	private static void saveTree(Node tree, ArrayList<Integer> a) {
		if (tree != null) {
			a.add(tree.data);
			saveTree(tree.left, a);
			saveTree(tree.right, a);
		}
	}
}
