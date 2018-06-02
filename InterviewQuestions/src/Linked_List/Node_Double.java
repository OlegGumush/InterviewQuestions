package Linked_List;

public class Node_Double {

	Node_Double next =null;
	Node_Double prev =null;
	int data;
	
	public Node_Double(int data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "->"+data+"->";
	}
	
}
