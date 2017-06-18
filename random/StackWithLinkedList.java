public class StackWithLinkedList {

	static class Node{
		public int data;
		public Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	private static Node head;
	private static Node tail;

	public StackWithLinkedList() {
		this.head = null;
		this.tail = null;
	}
	public static void push(int val) {
		Node temp = new Node(val);
		if(tail != null) {
			tail.next = temp;
		}
		tail = tail.next;
		if (head == null) {
			head = temp;
		}
	}

	public static int pop() {
		int data = head.data;
		head = head.next;
		if ( head == null) {
			tail = null;
		}
		return data;
	}

	public static boolean isEmpty() {
		return head == tail;
	}

	public static int top() {
		return head.data;
	}
	public static void main(String...args) {

	}
}