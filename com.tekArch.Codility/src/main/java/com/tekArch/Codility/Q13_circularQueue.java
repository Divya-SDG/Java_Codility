
/*Circular  queue is similar to  linear queue  and follows FIFO principle. Element is inseeerted at  rear and  deleted from front. 
The last element is connected to the first element and hence forms a cicicle called circular queue.*/

package com.tekArch.Codility;

import java.util.ArrayList;

public class Q13_circularQueue {
public static void main(String[] args){
		
		CircularQueue  cq= new CircularQueue(3);
		cq.enqueue(9);
		cq.enqueue(7);
		//cq.enqueue(4);
		//cq.enqueue(2);
		//cq.enqueue(8);
		cq.enqueue(1);
		cq.display();
		for(int i=0;i<=3;i++) {
		int n=cq.dequeue();
		System.out.println("Element deleted is " + n);
	}

}
}
	
	class CircularQueue{
		int size,  front, rear;
      ArrayList<Integer>  queue= new  ArrayList<Integer>();

       CircularQueue( int size) {
			this.size=size;
			this.front=-1;
			this.rear=-1;
		}
		
		public  void enqueue(int data) {
			
		    if(rear==size-1 && front==0) {
				System.out.println("The queue is  full");
			}
			else if(front==-1 ) {
					front=0;
					rear=0;
					queue.add(rear,data);
				}
			
			else {
				rear= rear+1;
				if(front<=rear) {
				queue.add(rear, data);
			}
			}
		}
		
		public int dequeue() {
			int value;
			if(front==-1 && rear==-1) {
				System.out.println("The  queue is empty");
				return -1;
			}
			value=queue.get(front);
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			
			else {
				front=front+1;
			}
		return value;	
	}
		
		public void  display() {
			 
			  if(front==-1&& rear==-1) {
				System.out.println("The queue is empty");
				return;
			}
			
			else  if(front<= rear) {
				System.out.println("The elements in the queue are:");
				for(int i=front;i<=rear;i++) {
					System.out.println(queue.get(i));
					System.out.println();
				}
			}
		}
	}

		
	
	


	
