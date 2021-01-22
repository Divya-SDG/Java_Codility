/* Priority queue is a similar to  queue with priority assigned to elements. It generally use natural ordering of the elements.
 *  It can also  uses  comparision with comparator class to comapre priorities. High priority element is placed before low priority*/

package com.tekArch.Codility;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q15_PriorityQueue {
	public static void main(String[] args) {
		StudentComparator sc= new StudentComparator();
     PriorityQueue<Students> pq= new PriorityQueue<Students>(5, sc);
     pq.add(new Students("Divya",10));
     pq.add(new Students("Madhu",28));
     pq.add(new Students("karthik",40));
     pq.add(new Students("sagar",4));
     
     System.out.println("The peek minimun  priority element is " +  pq.peek().name);
     
     System.out.println("  After removing the minimum priority element , elements are : " );
     pq.remove();
     while(!pq.isEmpty()) {
    	 System.out.println(pq.poll().getName());
     }
     }
}
	
	class StudentComparator implements Comparator<Students>{
		
		public int compare(Students s1, Students s2) {
			if(s1.regId==s2.regId) {
				return 0;
			}
			else if(s1.regId>s2.regId) {
				return 1;
				
			}
			else {
				return -1;
			}
			
		}
	}
	
class Students {
		String name;
		int regId;
		public Students(String name, int regId){
		this.name=name;
		this.regId= regId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRegId() {
			return regId;
		}
		public void setRegId(int regId) {
			this.regId = regId;
		}
	
	}
