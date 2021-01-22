package com.tekArch.Codility;

public class Q16_Thread_InSequence{

	public static void main(String[] args) {
		 final Thread T1= new Thread(new Runnable() {
			public void  run() {
				System.out.println("Thread t1");
				
			}
		});
		
		final Thread T2 = new Thread(new Runnable() {
			public void run() {
				try {
					T1.join();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("Thread t2");
				
			}
		});
		
		Thread T3 = new Thread(new Runnable() {
			public void  run() {
				try {
					T2.join();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("Thread t3");
			}
		});
		
		System.out.println("Ensuring the sequence of threads");
		T3.start();
		T2.start();
		T1.start();
		
	

}
}
