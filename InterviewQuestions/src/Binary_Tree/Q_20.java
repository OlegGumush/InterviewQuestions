package Binary_Tree;


public class Q_20 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6 };
		Node tree = buildTree(arr);
		
	}

	public static Node buildTree(int[] arr) {
		return buildTree(arr, 0, arr.length - 1);
	}

	private static Node buildTree(int[] arr, int s, int e) {

		if (s > e) {
			return null;
		}
		int mid = (s + e) / 2;

		Node n = new Node(arr[mid]);

		n.left = buildTree(arr, s, mid - 1);
		n.right = buildTree(arr, mid + 1, e);
		
		return n;
	}
}
