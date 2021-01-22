package com.tekArch.Codility;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentQ1 {
	
	// Write a java program to store 5 student information in a treeMapNote: student object has student name and student reg no


	public static void main(String[] args) {
		TreeMap<Integer,Student> map = new TreeMap<Integer, Student>();
		  map.put(1,new Student("Divya",1));
		  map.put(2,new Student("Madhu",2));
		  map.put(3,new Student("Sagar",3));
		  map.put(4, new Student("Kite",4));
		  
		  for (Map.Entry<Integer, Student> entry : map.entrySet()) {
		   System.out.println("KEY : "+ entry.getKey() +"  VALUE : "+ (entry.getValue()).getName());
		  }
		 }
		}
