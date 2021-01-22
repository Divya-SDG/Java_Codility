package com.tekArch.Codility;

import java.util.NoSuchElementException;

public class Q12_DequeWithLinkedList {

	
	static	class Node {
			int data;
			Node link;

			public Node() {
				data = 0;
				link = null;
			}

			public Node(int d, Node n) {
				data = d;
				link = n;
			}

			public Node getLink() {
				return link;
			}

			public int getData() {
				return data;
			}

			public void setLink(Node n) {
				link = n;
			}
		}

		static class Dequeue {
			Node front, rear;
			int size;

			public Dequeue() {
				front = null;
				front = null;
				size = 0;
			}

			public int size() {
				return size;
			}

			public Boolean isEmpty() {
				return front == null;
			}

			public void insertAtFront(int val) {
				Node elementp = new Node(val, null);
				size++;
				if (front == null) {
					front = elementp;
					rear = elementp;
				} else {
					elementp.setLink(front);
					front = elementp;
				}
			}

			public void insertAtRear(int val) {
				Node elementp = new Node(val, null);
				size++;
				if (rear == null) {
					rear = elementp;
					front = elementp;
				} else {
					rear.setLink(elementp);
					rear = elementp;
				}
			}

			public int removeAtFront() {
				if (isEmpty()) {
					throw new NoSuchElementException();
				}
				Node temp = front;
				front = temp.getLink();
				if (front == null) {
					rear = null;

				}
				size--;

				return temp.getData();
			}

			public int removeAtRear() {
				if (isEmpty()) {
					throw new NoSuchElementException();
				}
				int d= rear.getData();
				Node temp = front;
				Node t = null;
				while(temp!=rear) {
					t=temp;
					temp=temp.getLink();
				}
				rear=t;
				rear.setLink(null);
			
				size--;
				
				return d;
			}

			public void display() {
				if (size == 0) {
					System.out.println("The queue is Empty");
					return;
				}
				Node current = front;
				while (current != rear.getLink()) {
					System.out.println(current.getData());
					current = current.getLink();
				}
				System.out.println();
			}

		}
		
		public static void main(String[] args) {
			Dequeue dq= new Dequeue();
			dq.insertAtFront(2);
			dq.insertAtFront(4);
			dq.insertAtRear(6);
			dq.insertAtRear(9);
			dq.display();
			System.out.println("After removing ");
			dq.removeAtFront();
			dq.removeAtRear();
			dq.display();
			
			
	}
}
