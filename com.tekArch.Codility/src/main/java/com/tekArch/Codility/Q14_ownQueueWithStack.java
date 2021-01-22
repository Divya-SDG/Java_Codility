package com.tekArch.Codility;

import java.util.Stack;

public class Q14_ownQueueWithStack {

	static class CustomQueue{
		Stack<Integer> s1= new Stack();
		Stack<Integer> s2= new Stack();
		public void push(int n) {
			s1.push( n);
		}
		public int pop() {
			while(!s1.isEmpty()) {
			 s2.push(s1.pop());
			}
			return s2.pop();
		}
	
	public int peek() {
		return s2.peek();
	}
	 
	public int size() {
		return s2.size();
	}
	public  boolean isEmpty() {
		if(s2.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	}	
 
	public static void main(String[] args) {
		CustomQueue q= new CustomQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		System.out.println("Element removed is  " + q.pop());
		
		

}
	}
