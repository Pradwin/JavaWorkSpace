package com.Pradwin;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PrintLinkedList {
    public static void LastNode(Node head) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.print(current.data);
    }
    public static Node addFirst(Node head,Node data) {
    	if (data == null) {
    		return head;
    	}
    	head.next = data;
    	return head;
    }
    public static void printNode(Node head) {
    	 Node current = head;
         while (current != null) {
        	 System.out.print(current.data);
             current = current.next;
         }
    }
    public static Node deletelast(Node head) {
    	Node current = head;
    	while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    	return head;
    }
    
    public static Node addLast(Node head,Node newNode) {
    	Node current = head;
    	while(current.next != null) {
    		current = current.next;
    	}
    	current.next = newNode;
    	return head;
    }
    
    public static Node deletefirst(Node head) {
    	if (head == null) {
    		return head;
    	}
    	head = head.next;
		return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = addFirst(new Node(9),head);
        printNode(head);
        
        head = deletefirst(head);
        System.out.println();
        printNode(head);
        
        head = deletelast(head);
        System.out.println();
        printNode(head);
        
        head = addLast(head,new Node(9));
        System.out.println();
        printNode(head);
    }
}

