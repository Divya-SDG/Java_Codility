package com.tekArch.Codility;

/*Write a program to read monetary amount in cents and print the smallest possible number of coins equaling the amount. Example: 
	monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies So smallest possible
	number of coins equaling the amount 283====9 coins*/

public class Q5_Coins {
	public static int dollar(int amount) {
		return amount/100;
	}
	 public static int quarters(int amount)
	    {
	        return (amount-dollar(amount)*100)/25;
	    }

	    public static int dimes(int amount)
	    {
	        return (amount -(dollar(amount)*100)- quarters(amount)*25) /10;
	    }

	    public static int nickels(int amount)
	    {
	        return (amount - (dollar(amount)*100)- (quarters(amount)*25) - (dimes(amount)*10)) / 5;
	    }

	    public static int cents(int amount)
	    {
	        return amount - (dollar(amount)*100)- (quarters(amount)*25) - (dimes(amount)*10) - (nickels(amount)*5);
	    }

	    public static void main(String[] args) {
	        int amount= 288;
	       
	       System.out.println(amount + " = " + dollar(amount)+ " dollar "  + quarters(amount) + " quarters," 
	                          +dimes( amount) + " dimes,"
	                          +nickels( amount) + " nickels,"
	                          +cents( amount) + " cents");

	    }

	}