package com.tekArch.Codility;

import java.util.ArrayList;
import java.util.Arrays;

public class Q7_customArrayList {
	
	static   class Student{
		String name;
		int regNo; 
		String Dept;
		
		public Student(String name, int regNo, String Dept) {
			this.name= name;
			this.regNo= regNo;
			this.Dept=Dept;
			
		}

		public String getName() {
			return name;
		}
}
	
	 static class StudentArrayList {
		private Student[]  mylist;
		int size=0;
		
		public StudentArrayList() {
			mylist= new Student[10];
			
		}
		public void add(Student s) {
		if(mylist.length-size<=2) {
			increaseSizeOfMyList();
		}
		
		mylist[size++]= s;
		}
		
		public Student remove(int index) {
			
			if(index < size) {
				Student s= mylist[index];
				mylist[index]=null;
				int temp= index;
				while(temp<size) {
					mylist[temp]=mylist[temp+1];
					mylist[temp+1]=null;
					temp++;
				}
				size--;
				return s;
				
			}
			else {
			throw new ArrayIndexOutOfBoundsException();
		}
		}
		
		public void increaseSizeOfMyList() {
			Arrays.copyOf(mylist, mylist.length*2);
		}
		public int size() {
			return size;
		}
			
		}

	public static void main(String[] args) {
		 
		
		
	StudentArrayList sl= new StudentArrayList();
	sl.add(new Student("Divya", 1 , "ECE"));
	sl.add(new Student("Sai", 2 , "CSE"));
	sl.add( new Student("Sree", 3 , "MBA"));
	sl.add(new Student("madhu", 5 , "CSE"));
	sl.add(new Student("lia", 4 , "MBA"));
	System.out.println(sl.size);
	System.out.println("The remove student from the list is  " +  sl.remove(3).getName());
	}
}
