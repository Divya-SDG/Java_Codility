package com.tekArch.Codility;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
//Write a java program to store 5 unique elements in sorted order. Error should exist if user tries to add duplicates.
public class Q4_UniqueSorted {
	public static void main(String[] args) {
	 class uniqueSet<Integer> extends TreeSet<Integer>{
		 @Override
		    public boolean add(Integer i) {
		        if(!super.add(i))
		            throw new RuntimeException("The object already exists in the collection.");

		        return true;
		    }
		}
	 uniqueSet<Integer> un= new uniqueSet<Integer>();
	 un.add(1);
	 un.add(12);
	 un.add(3);
	 un.add(8);
	 un.add(1);// will throw run time exception
	 for(Integer i: un) {
		 System.out.println(i);
		 
	 }
	 }
}

