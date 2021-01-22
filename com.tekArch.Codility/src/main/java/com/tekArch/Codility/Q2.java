package com.tekArch.Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
 
//Write a java program to store 5 student information and award the students with 1st rank, 
//2nd rank and 3rd rank according to marks obtained where each student has student name, 
//student marks and student reg no information 

public class Q2 {
 static class Student {
	String name;
	int reg_No;
	int marks;
	 Student(String name, int reg_No, int marks){
		 this.name=name;
		 this.reg_No=reg_No;
		 this.marks= marks;
	 }
	 
	 public String getName() {
			return name;
		}
     public int getMarks() {
			return marks;
		}
 }
     
  static    class Sorter  implements Comparator<Student>{
    	 
	public int compare(Student o1, Student o2) {
		
		 return o2.marks-o1.marks; 
	}

     }
		
           public static void main(String[] args) {
        	   int i=1;
        	   List<Student> students = new ArrayList<Student>();

               students.add(new Student("Divya", 1, 80));
               students.add(new Student("Madhu", 1, 98));
               students.add(new Student("kart", 1, 85));
               students.add(new Student("pop", 1, 90));
               students.add(new Student("Vibha", 1, 100));
         Sorter sort= new Sorter();
               Collections.sort(students, sort);

               for (Student student : students)
               {
            	   while(i<=students.size()) {
                   System.out.println(student.getName() + ":" + i +" rank" );
                   i++;
                   break;
               }
        	   
			  }
           }
			  
           
           
}

		
