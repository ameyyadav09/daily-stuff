import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
@SuppressWarnings("unchecked")
class Node<T> {
	private Node left;
	private Node right;
	private T data;
	Node () {
	}
	Node (T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public void setData(T value) {
		this.data = value;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public T getData() {
		return data;
	}
	public Node getLeft() {
		return left;
	} 
	public Node getRight() {
		return right;
	}
}
@SuppressWarnings("unchecked")
class BSTrees<T extends Comparable<T>> {
	private Node root;
	private ArrayList list;
	public T pos;
	private int recCount;
	BSTrees() {
		root = null;
	}
	public void insert(T value) {
		root = insert(root , value);
	}
	private Node insert(Node root , T value) {
		Node<T> node = new Node<T>(value);
		if(root == null) {
			root = node;
		}
		else {
			if(value.compareTo((T)root.getData()) < 0) {
			root.setLeft(insert(root.getLeft() , value));
		}
		else if(value.compareTo((T)root.getData()) >= 0) {
			root.setRight(insert(root.getRight() , value));
		}
	}
	return root;
	}

	private void print() {
		for (int i = 0 ; i < list.size(); i++) {
			if( i == (list.size()) - 1) {
				System.out.println(list.get(i));
			}
			else
				System.out.print(list.get(i) + " ");	
		}
	}
	public void inorder() {
		list = new ArrayList<>();
	    inorder(root);
	    print();
  	}
    private void inorder(Node root) {
		if (root != null) {
			inorder(root.getLeft());
			list.add(root.getData());           
			inorder(root.getRight());
		}
   	}
}
@SuppressWarnings("unchecked")
public class Sorting<T extends Comparable<T>> {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ip = Integer.parseInt(br.readLine());
        while(ip>0) {
        	BSTrees obj = new BSTrees();
        	int n = Integer.parseInt(br.readLine());
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	while(st.hasMoreTokens()) {
        		obj.insert(Integer.parseInt(st.nextToken()));
        	}
        	obj.inorder();
        	ip--;
        }
	}
}