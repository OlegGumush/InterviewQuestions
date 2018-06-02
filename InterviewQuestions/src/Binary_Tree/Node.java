package Binary_Tree;

class Node {
	Node left;
	Node right;
	int data;

	public Node(int data) {
		this.data = data;
	}

	public String toString(){
		return ""+data;
	}

	@Override
	public boolean equals(Object obj) {
		if (data == ((Node) obj).data) {
			return true;
		}
		return false;
	}

}
