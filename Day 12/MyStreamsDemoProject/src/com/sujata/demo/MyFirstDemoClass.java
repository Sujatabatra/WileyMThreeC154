package com.sujata.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(11,22,32,44,55);
		
		list.stream()
		.forEach((element)->System.out.println(element)); //terminate
		System.out.println("======================");
		list.stream().forEach(System.out::println);
		System.out.println("--------------------------");
		list.stream()
		.map((element)->element+5) //intermediate
		.forEach(System.out::println); //terminate
		
		List<Integer> evenNos=list.stream()
				.filter(element->element%2==0)  //intermediate
				.map(ele->ele+4)                //intermediate
				.collect(Collectors.toList()); //terminate
		
		System.out.println(evenNos);
		

	}

}
