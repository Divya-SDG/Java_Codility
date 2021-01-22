/*Deadlocks occur when two or more threads sharing  same resources are 
 * blocked forever waiting for each other to relaese the locks. In java synchronised keyword causes executing thread to block while waiitng for the lock.
 */





package com.tekArch.Codility;

public class Q18_DeadLock {
	Object lock1= new Object();
	Object lock2= new Object();
	
	 Thread t1 = new Thread(new Runnable() {

		public void run() {
			while(true) {
			synchronized(lock1) {
				synchronized(lock2){
					System.out.println("Thread 1 ");
					System.out.println(lock1.equals(lock2));
				}
			}
			}
		}
		
	});
	
	 Thread t2= new Thread(new Runnable() {

		public void run() {
			while(true) {
			synchronized(lock2) {
				synchronized(lock1) {
					System.out.println("Thread 2");
					System.out.println(lock1.equals(lock2));
				}
			}
			}
			
		}
		
	});


	public static void main(String[] args) {
		Q18_DeadLock dl= new Q18_DeadLock();
		System.out.println("Deadlock with two threads");
		dl.t1.start();
		dl.t2.start();

	}

}
