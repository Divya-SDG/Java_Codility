package com.tekArch.Codility;

import java.util.ArrayList;

import java.util.Iterator;

public class Q8_AyyayListUnique {
	
	static class Employee  {
		String name;
		int regNo;
		public Employee(String name, int regNo) {
			this.name=name;
			this.regNo= regNo;
		}
		
		
		public String getName() {
			return name;
		}

		public Integer getregNo() {
			return regNo;
		}
		public String toString() {
	        return name+ " "+ regNo;
	    }
		




		
}

	public static void main(String[] args) {
		ArrayList<Employee> al= new ArrayList<Employee>();
		Employee e1= new Employee("divya", 1);
		Employee e5= new Employee("divya", 1);
		Employee e2= new Employee("madhu", 2);
		Employee e3= new Employee("karhtik", 3);
		
		Employee e4= new Employee("karhtik", 3);
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	//al.add(e6);	 
	Iterator<Employee> it=al.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }

    int size=al.size();
    for(int i=0;i<size-1;i++){
        for(int j=i+1;j<size;j++){
        	//System.out.println((al.get(i).getName())+ ": " + (al.get(j).getName()));
            if((al.get(i).getName()).equals(al.get(j).getName())){
                al.remove(j);
               size--;
            }
        }
    }
        System.out.println(al);
}
	
	
		
	

}
	

	
