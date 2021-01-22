package com.tekArch.Codility;

public class Q17_TicketReservation {
	public static void main(String[] args) throws InterruptedException {
		int t1_seats=6;int t2_seats=3;int t3_seats= 4;
		Thread t1= new Thread( new Reservation(t1_seats),"Thread 1");
		Thread t2= new Thread( new Reservation(t2_seats),"Thread 2");
		Thread t3= new Thread( new Reservation(t3_seats),"Thread 3");
		t1.start();
		//t1.join();
		t2.start();
	//	t2.join();
		t3.start();
		}
}

   class Reservation implements Runnable{
		int seats;
		public Reservation(int req_seats) {
			this.seats=req_seats;
			
		}
		 static int Available_seats= 10;
		 synchronized void  reserveSeats(Integer req_seats) {
			
			//System.out.println("Availale seats are : " + Available_seats);
			System.out.println(Thread.currentThread().getName() + "request seats : " + req_seats + " :" + Available_seats
					);
			
		if(req_seats<Available_seats) {
				System.out.println("Requested seats reserved");
				Available_seats= Available_seats-req_seats;
				System.out.println("Remaining seats are : " + (Available_seats) );
				
			}
			else {
				System.out.println("Seats not avilable");
			}
			System.out.println(":::::::::::::");
		 }
		
		
		public void run() {
			reserveSeats(seats) ;
		}
		
	}

	
	
	


	

