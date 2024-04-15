package com.list.cdac;
/*
 6.How to detect a loop in linked list in java
7.Find start node of loop in linkedlist
*/
public class Program4 {
	static class Node {
        int data;
        Node next;
        int flag;
        Node(int x)
        {
            data = x;
            next = null;
              flag = 0;
        }
    };

    static Node push(Node head_ref, int new_data)
    {

        Node new_node = new Node(new_data);
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static boolean detectLoop(Node h)
    {
        while (h != null) {

          
            if (h.flag == 1)
                return true;
            h.flag = 1;

            h = h.next;
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {

        Node head = null;

        head = push(head, 20);
        head = push(head, 4);
        head = push(head, 15);
        head = push(head, 10);

       
        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.print("Loop Found "+head.data);
        else
            System.out.print("No Loop");
    }
}