package com.tekArch.Codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q20_DrinkMachine {

	public static void main(String[] args) {
		System.out.println("Enter the no of   drinks and their  quantity to be stored  to be stored in Machine");
		Scanner s = new Scanner (System.in);
		int NoOfDrinks= s.nextInt();
		Map<String, Integer>  Drinkmachine= new HashMap<String, Integer>();
		
		for(int i=0;i<NoOfDrinks;i++) {
		System.out.println("Enter drink type " + i + ":");
		String DrinkType=s.next();
		System.out.println("Enter drink quantity " + i + ":");
		Integer quantity=s.nextInt();
		Drinkmachine.put(DrinkType,quantity);
		}
		
		System.out.println("The drinks available are : " + Drinkmachine.toString());
		char c='Y';
		do {
			
		System.out.println("User enter the dirnk type and quantity ");
		String userDrink= s.next();
		System.out.println("User enter the quantity");
		Integer userQuantity=s.nextInt();
		if( Drinkmachine.containsKey(userDrink)&& (Drinkmachine.get(userDrink)>1 ) ){
			Integer Nquantity=( Drinkmachine.get(userDrink))-userQuantity;
			Drinkmachine.put(userDrink,Nquantity);
			
		}
		else {
			System.out.println("Request cannot be served due to unavailability");
		}
		System.out.println("Do user want to continue? - enter Y or N");
		c=s.next().charAt(0);
		}while(c=='Y');
		
		System.out.println(Drinkmachine.toString());
		
		

	}

}
