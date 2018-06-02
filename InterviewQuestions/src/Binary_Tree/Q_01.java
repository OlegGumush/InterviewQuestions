package Binary_Tree;

public class Q_01 {
	public static void main(String[] args) {
		Binary_Tree t = new Binary_Tree();
		t.add(1);
		t.add(2);
		t.add(0);
		
		//t.inOrder();
		//System.out.println(t.height());
		//System.out.println(t.contains(4));
	}
}
class Binary_Tree{
	class Node{
		int data;
		Node left = null;
		Node right = null;
		
		public Node(int data){
			this.data=data;
		}	
	}
	
	Node head = null;
	
	public void add(int data){
		head = add(head , data);
	}
	private Node add(Node tree, int data) {
		if(tree == null){
			return new Node(data); 
		}else{
			if(tree.data < data){
				tree.right = add(tree.right , data);
			}else{
				tree.left = add(tree.left , data);
			}
		}
		return tree;
	}
	
	public void inOrder() {
		inOrder(head);
	}
	private void inOrder(Node t) {
		if(t==null)
			return;
		inOrder(t.left);
		System.out.println(t.data);
		inOrder(t.right);
	}
	public void preOrder() {
		preOrder(head);
	}
	private void preOrder(Node t) {
		if(t==null)
			return;		
		System.out.println(t.data);
		preOrder(t.left);
		preOrder(t.right);
	}
	
	public int height(){
		return height(head);
	}
	private int height(Node t) {
		if(t == null)
			return 0;
		return Math.max(height(t.left), height(t.right))+1;
	}
	
	public boolean contains(int data){
		return contains(head , data);
	}
	private boolean contains(Node t, int data) {
		if(t==null)
			return false;
		
		if(t.data == data)
			return true;
		
		if(t.data < data){
			return contains(t.right , data);
		}else{
			return contains(t.left, data);
		}
	}
	
	
	
}
