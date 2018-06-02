package Linked_List;

public class Q_20 {
	public static void main(String[] args) {

		Linked_List_Single l1 = new Linked_List_Single();
		l1.addTail(3);
		l1.addTail(1);
		l1.addTail(5);

		Linked_List_Single l2 = new Linked_List_Single();
		l2.addTail(5);
		l2.addTail(9);
		l2.addTail(2);

		System.out.println(sumLists(l1, l2));
	}

	///////////////////////////// Q_20//////////////////////////////
	public static Linked_List_Single sumLists(Linked_List_Single l1 , Linked_List_Single l2) {
		Linked_List_Single ans = new Linked_List_Single();

		Node_Single curr1 = l1.head;
		Node_Single curr2 = l2.head;

		int remineder = 0;

		while (curr1 != null && curr2 != null) {
			int sum = curr1.data + curr2.data + remineder;
			if (sum < 10) {
				ans.addTail(sum);
				remineder = 0;
			} else {
				ans.addTail(sum % 10);
				remineder = sum / 10;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		while (curr1 != null) {
			int sum = curr1.data + remineder;
			if (sum < 10) {
				ans.addTail(sum);
				remineder = 0;
			} else {
				ans.addTail(sum % 10);
				remineder = sum / 10;
			}
			curr1 = curr1.next;
		}
		while (curr2 != null) {
			int sum = curr2.data + remineder;
			if (sum < 10) {
				ans.addTail(sum);
				remineder = 0;
			} else {
				ans.addTail(sum % 10);
				remineder = sum / 10;
			}
			curr2 = curr2.next;
		}
		if (remineder != 0) {
			ans.addTail(remineder);
		}

		return ans;
	}
}
