package com.tekArch.Codility;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import com.tekArch.Codility.Q10_ownStack.myStack;

public class Q9_ownHanoi_Stack {
	 public static int noOfDisks;
     
     public static Stack<Integer>[] Tower = new Stack[4]; 
 
     public static void main(String[] args) 
     {
         Scanner scan = new Scanner(System.in);
         Tower[1] = new Stack<Integer>();
         Tower[2] = new Stack<Integer>();
         Tower[3] = new Stack<Integer>();
                  
         System.out.println("Enter number of disks");
          noOfDisks = scan.nextInt();
         
         initializeFirstTower(noOfDisks);
     }
     
     public static void initializeFirstTower(int n) 
     {
         for (int d = n; d > 0; d--)
             Tower[1].push(d);
         displayTowers();
         move(n, 1, 2, 3);         
     }
     
     public static void move(int n, int a, int b, int c) 
     {
         if (n > 0)
         {
             move(n-1, a, c, b);     
             int d = Tower[a].pop();                                             
             Tower[c].push(d);
             displayTowers();                   
             move(n-1, b, a, c);     
         }         
     }
     
     public static void displayTowers () 
     {
         System.out.println("  A  |  B  |  C");
         System.out.println("---------------");
         for(int i = noOfDisks - 1; i >= 0; i--)
         {
             String disk1 = " ", disk2 = " ", disk3 = " ";
             try {
             disk1 = Integer.toString(Tower[1].get(i));
             }
             catch(Exception e) {
             }
             try {
             
             disk2 = 	Integer.toString(Tower[2].get(i));
             }
             catch(Exception e) {
            	 
             }
             try {
             disk3 = Integer.toString(Tower[3].get(i));
             }
             catch(Exception e) {
            	 
             }
             
           /* try {
                 disk1 = Integer.toString(Tower[1].get(i));
            }
            catch(Exception e) {
            	
            }
            try {
                  disk2 = 	Integer.toString(Tower[2].get(i));
            }
            catch(Exception e ) {
            }
            try {
            
                  disk3 = Integer.toString(Tower[3].get(i));
            }
            catch(Exception e ){
            	
            }
            */
             
             System.out.println("  "+disk1+"  |  "+disk2+"  |  "+disk3);
         }
         System.out.println();         
     }
	}