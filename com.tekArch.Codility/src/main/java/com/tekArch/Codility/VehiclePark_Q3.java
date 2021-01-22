package com.tekArch.Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehiclePark_Q3 {

	 static class Vehicle{
		String model, veh_num;
		int parkTimeInMin;
		
		public Vehicle(String model, String veh_num, int parkTimeInMin) {
			this.model=model;
			this.veh_num= veh_num;
			this.parkTimeInMin= parkTimeInMin;
		}
			public  int getParkTime() {
				return parkTimeInMin;
			}
			public String getModel() {
				return model;
			}
		}
		
		public static class parkHourComp implements Comparator<Vehicle>{

			public int compare(Vehicle o1, Vehicle o2) {
				
				return o2.parkTimeInMin-o1.parkTimeInMin;
			}
			
		}
		
		public static void main(String[] args) {
		List<Vehicle> l1= new ArrayList<Vehicle>();
		l1.add(new Vehicle("BMW","890YRF", 90));
		l1.add(new Vehicle("hyundai","789YRF",110));
		l1.add(new Vehicle("BMW","88PRF", 70));
		
		List<Vehicle> l2= new ArrayList<Vehicle>();
		l2.add(new Vehicle("ford","89YRF", 60));
		l2.add(new Vehicle("hyudai","723RF",120));
		l2.add(new Vehicle("ferrari","878PRF", 170));
		
		l1.addAll(l2);
		parkHourComp pm= new parkHourComp();
		Collections.sort(l1, pm);
		for(Vehicle i: l1)
		System.out.println(i.getModel() + " :" +(float) (i.getParkTime())/(60) + " hours");
		
	}

}