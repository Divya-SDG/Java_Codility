package com.tekArch.Codility;

import java.util.Scanner;
import java.util.Vector;

public class Q6_Vector_TekZZArch {

	public static void main(String[] args) {
		String s= "tekArch";
		Vector<String> v= new  Vector<String>();
		v.add(s);
		System.out.println("Enter number of Z's");
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		int index=3;
		int index2=s1.length()+1;
		String insertedString= insertZs(s,s1,index);
		System.out.println(insertedString);
		String afterDeletion= deleteString(insertedString,index2, s1.length() );
		System.out.println(afterDeletion);
		
}
	public  static String insertZs(String s, String z, int index) {
		int l1= s.length();
		int l2= z.length();
		
	
		String AfterInsertion = new String();
		for(int i=0;i<l1;i++) {
			AfterInsertion= AfterInsertion + s.charAt(i);
			if(i==index-1  ) {
				AfterInsertion= AfterInsertion+ z;
			}
		}
		return  AfterInsertion;

}
	public static String deleteString(String s, int index, int NoOfChar) {
		System.out.println(index);
		
		String subString= s.substring(index, index+NoOfChar);
		String AfterDeletion = s.replace(subString, "");
		return AfterDeletion;
		
	
		
}
}
