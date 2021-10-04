package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapDemoClass {

	public static void main(String[] args) {
		//Collection of Key value pair, Keys are unique and values can be duplicated
		Map<String, Integer> months;
		//Sorted collection of key value pair and sorting wrt Key
		months=new TreeMap<String, Integer>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		months.put("Jun", 30);
		months.put("ABC",null);
		months.put("MNO",null);
//		months.put(null, 50);
		
		System.out.println("Size : "+months.size());
		System.out.println(months);
		
		months.put("Feb", 29);
//		months.put(null, 56);
		System.out.println(months);
		
		Set<String> monthNames=months.keySet();
		for(String month:monthNames) {
			System.out.println(month+" has "+months.get(month)+" days");
		}

	}

}
