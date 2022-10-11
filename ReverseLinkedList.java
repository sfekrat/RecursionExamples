
public class ReverseLinkedList {
	static Node head = null;
	private static class Node {
		int data;
		Node next;
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, null)))))));
		printList(head);
		Node revList = reversedList(head);
		printList(revList);
	}
	public static Node reversedList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node p = reversedList(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null) 
				System.out.print("-->");
			temp = temp.next;
		}
		System.out.println();
	}

}
