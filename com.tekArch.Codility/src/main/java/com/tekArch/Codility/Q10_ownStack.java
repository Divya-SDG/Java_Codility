package com.tekArch.Codility;

import java.util.Arrays;

public class Q10_ownStack {
	
	static class myStack{
		int[] stack;
		int size;
		int top=-1;
		public myStack( int cap){
			stack= new int[cap];
		}
		
		public void push(int a) {
			if(stack.length-size()>3) {
				increaseStackSize();
			}
			stack[size++]= a;
			top=size-1;
			}
	public void 	increaseStackSize() {
		Arrays.copyOf(stack, stack.length*2);
	}
		public int peek() {
     return	stack[top];
		}
		
		public int pop() {
			int obj=	stack[top];
			top--;
			size--;
			
			return obj;
				}
		public boolean isEmpty() {
		      return (top == -1);
		   }
		
		public int size() {
			return size;
		}
		public void display() {
			for(int i=0;i<size;i++) {
				System.out.print(stack[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		myStack ms = new myStack(5);
		ms.push(1);
		ms.push(8);
		ms.push(9);
		ms.push(2);
		ms.display();
		System.out.println(ms.size());
		System.out.println(ms.peek());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		ms.display();
		}

}
