class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node() {

	}
}

public class CycleInLinkedList {

	public static boolean findLoop(Node head) {
		if (head == null) return false;

		Node fast = head.next;
		Node slow = head;

		while(fast != null && fast.next != null && slow != null) {
			if (fast == slow) {
				return true;
			}

			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
	public static void main(String[] args) {
		
	}
}