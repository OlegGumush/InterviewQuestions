package Binary_Tree;

import Binary_Tree.Binary_Tree.Node;

public class Q_19 {
	public static void main(String[] args) {
		Binary_Tree b = new Binary_Tree();
		b.add(0);
		b.add(-1);
		b.add(1);
		b.add(2);
		//b.add(3); false
		System.out.println(ifBalanced(b));
	}
	private static int Min(Node root) {
		if(root == null)
			return 0;
		
		return Math.min(Max(root.left), Max(root.right)) +1;
	}

	private static int Max(Node root) {
		if(root == null)
			return 0;
		
		return Math.max(Max(root.left), Max(root.right)) +1;
	}
	
	public static boolean ifBalanced(Binary_Tree b){
		if(Max(b.head) - Min(b.head) >1){
			return false;
		}	
		return true;
	}
}
