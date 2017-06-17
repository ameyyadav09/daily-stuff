import java.util.*;
import java.io.*;

public class QueueWithStacks {
	private static Stack<Integer> old = new Stack<Integer>();
	private static Stack<Integer> newer = new Stack<Integer>();

	public static void enqueue(int val) {
		newer.push(val);	
	}

	public static void peek() {
		shift();
		old.peek();
	}

	public static void dequeue() {
		shift();
		old.pop();
	}

	public static void shift() {
		if (old.isEmpty()) {
			while(!newer.isEmpty()) {
				old.push(newer.pop());
			}
		}
	}

	public static void main(String...args) {

	}
}