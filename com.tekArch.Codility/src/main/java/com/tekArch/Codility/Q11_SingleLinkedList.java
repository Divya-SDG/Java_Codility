package com.tekArch.Codility;

public class Q11_SingleLinkedList {
	
static class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
	Node head= null;
	Node tail=null;
	
	public void add(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			tail= newNode;
		}
		else {
			tail.next=newNode;
			tail= newNode;
		}
	}
	
	public void  deleteNode(int index) {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node temp = head;
		if(index==0) {
			head=temp.next;
		}
		
		for (int i=0; temp!=null && i<index-1; i++) 
           temp = temp.next; 
  
        
        if (temp == null || temp.next == null) 
            return; 
  
       
        Node next = temp.next.next; 
  
        temp.next = next;  // Unlink the deleted node from list 
    } 
		
	
	public void display() {
		Node current = head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		while(current!=null) {
			System.out.println(" " + current.data);
			current=current.next;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Q11_SingleLinkedList sl = new Q11_SingleLinkedList ();
		int index=2;
		sl.add(8);
		sl.add(5);
		sl.add(2);
		sl.add(6);
		sl.add(4);
	System.out.println("The list elements are : ");
	sl.display();
	sl.deleteNode(index);
	System.out.println("After removing a element at index " + index );
	sl.display();
	
}
}
