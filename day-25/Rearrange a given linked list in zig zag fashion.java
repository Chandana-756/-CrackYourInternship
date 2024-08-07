// Java program for the above approach 
import java.io.*; 

// Node class 
class Node { 
	int data; 
	Node next; 
	Node(int data) { this.data = data; } 
} 

public class Solution { 

	private Node head; 

	// Print Linked List 
	public void printLL() 
	{ 
		Node t = head; 
		while (t != null) { 
			System.out.print(t.data + " ->"); 
			t = t.next; 
		} 
		System.out.println(); 
	} 

	// Swap both nodes 
	public void swap(Node a, Node b) 
	{ 
		if (a == null || b == null) 
			return; 
		int temp = a.data; 
		a.data = b.data; 
		b.data = temp; 
	} 

	// Rearrange the linked list 
	// in zig zag way 
	public Node zigZag(Node node, int flag) 
	{ 
		if (node == null || node.next == null) { 
			return node; 
		} 
		if (flag == 0) { 
			if (node.data > node.next.data) { 
				swap(node, node.next); 
			} 
			return zigZag(node.next, 1); 
		} 
		else { 
			if (node.data < node.next.data) { 
				swap(node, node.next); 
			} 
			return zigZag(node.next, 0); 
		} 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		Solution obj = new Solution(); 
		obj.head = new Node(11); 
		obj.head.next = new Node(15); 
		obj.head.next.next = new Node(20); 
		obj.head.next.next.next = new Node(5); 
		obj.head.next.next.next.next = new Node(10); 
		obj.printLL(); 

		// 0 means the current element 
		// should be smaller than the next 
		int flag = 0; 
		obj.zigZag(obj.head, flag); 
		System.out.println("LL in zig zag fashion : "); 
		obj.printLL(); 
	} 
}

Time Complexity: O(n)
Space Complexity: O(n)
