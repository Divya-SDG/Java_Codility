package com.tekArch.Codility;

import java.util.TreeMap;
public class Student implements Comparable<Student> {
		String name;
		int regNo;
		public Student(String name, int regNo) {
			this.name=name;
			this.regNo= regNo;
		}
		
		
		public int compareTo(Student o) {
			
			return this.regNo-o.regNo;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getRegNo() {
			return regNo;
		}


		public void setRegNo(int regNo) {
			this.regNo = regNo;
		}
		
}


