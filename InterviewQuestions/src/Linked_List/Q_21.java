package Linked_List;

public class Q_21{
	public static void main(String[] args) {
		Linked_List_Single l1 = new Linked_List_Single();		
		l1.addTail(1);
		l1.addTail(3);
		l1.addTail(5);

		Linked_List_Single l2 = new Linked_List_Single();
		l2.addHead(2);
		l2.addTail(4);
		l2.addTail(6);
		l2.addTail(8);

		merge(l1 , l2);
		System.out.println(l1);
	}
	public static void merge(Linked_List_Single l1, Linked_List_Single l2) {
		Node_Single curr1 = l1.head;
		Node_Single curr2 = l2.head;
		
		while(curr1 != null && curr2 !=null){
			//שומר את המצביע הבא
			Node_Single curr1_next = curr1.next;
			//שומר את מי שאני רוצה להוסיף
			Node_Single curr2_first = curr2;
			
			//מוחק את זה שאני רוצה להוסיף מהרשימה השנייה
			l2.head = l2.head.next;
			curr2 = l2.head;
			
			//מוסיף להבא שלי את הראשון שלו
			curr1.next = curr2_first;
			//מחזיר לעצמי את שאר הרשימה ששמרתי בהתחלה
			curr1.next.next = curr1_next;
		
			//מקדם 2 מקומות כי הוספתי איבר באמצע
			curr1 = curr1.next.next;
		}
	}
}