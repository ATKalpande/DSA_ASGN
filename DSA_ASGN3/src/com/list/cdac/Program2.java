package com.list.cdac;
//2.Implement Doubly linked list in java
public class Program2 {
	
	static class Node{
		int data;
		Node prev,next;
		
		public Node(int d)
		{
			data = d;
			
		}
	}
	public static void main(String[] args) {
		Node head = new Node(20);
		Node temp1 = new Node(30);
		Node temp2 = new Node(40);
		Node temp3 = new Node(50);
		
		head.next = temp1;
		head.prev = null;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = temp3;
		temp3.prev = temp2;
		temp3.next = null;
		
		
		Node ref = head;
		while(ref!=null)
		{
			System.out.print("<--"+ref.data+"-->");
			ref = ref.next;
		}
		
	}
}
