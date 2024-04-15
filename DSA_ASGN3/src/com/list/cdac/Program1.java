package com.list.cdac;

import java.util.Scanner;

//1.Implement singly linked list in java
//3.How to reverse a linked list in java
//7.Find start node of loop in linkedlist
//5.How to find middle element of linked list in java
//8.How to find nth element from end of linked list
public class Program1 {
	static Scanner sc = new Scanner(System.in);
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
		}
	}

	static void printEndele(Node head) {
		Node ref = head;
		while (ref.next != null) {
			ref = ref.next;
		}

		System.out.println("Nth element from last is :" + ref.data);
	}

	static Node reverse(Node head) {
		Node current = head, prev = null, link;
		if (head == null) {
			return head;
		} else {
			while (current != null) {
				link = current.next;
				current.next = prev;
				prev = current;
				current = link;

			}
		}
		head = prev; // null 6 7 8 9
		return head;

	}

	static int midEle(Node head) {
		// Length of node
		int len = 0;
		Node ref = head;
		while (ref != null) {
			len++;
			ref = ref.next;
		}

		int lenList = len;

		Node tem = head;

		for (int i = 0; i < lenList / 2 && tem != null; i++) {
			tem = tem.next;
		}

		Node mid = tem;

		return mid.data;
	}

	static void dispList(Node head) {
		Node ref = head;
		while (ref != null) {
			System.out.print(ref.data + " ");
			ref = ref.next;
		}
		System.out.println("");
	}

	static int menuDrive() {
		System.out.println("0.Exit");
		System.out.println("1.Reverse List");
		System.out.println("2.Display List");
		System.out.println("3.Middle Element");
		System.out.println("4.Last nth Element");

		System.out.print("Enter the choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);

		head.next = temp1;
		temp1.next = temp2;
		System.out.println("Given List is : ");
		dispList(head);
		int ch;
		while ((ch = menuDrive()) != 0) {
			switch (ch) {
			case 1:

				head = reverse(head);
				break;

			case 2:
				dispList(head);
				break;
			case 3:
				System.out.println("Middle element is " + midEle(head));
				break;
			case 4:
				printEndele(head);
				break;

			default:
				break;
			}
		}

		dispList(head);

	}
}
