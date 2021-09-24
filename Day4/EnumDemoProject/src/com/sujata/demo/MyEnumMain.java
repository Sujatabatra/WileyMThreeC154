package com.sujata.demo;

public class MyEnumMain {
	
	public static void main(String args[]) {
		Dish dish=Dish.DAL_TADKA;
		System.out.println("Calories : "+dish.getCalorie());
		System.out.println("Is Vegetarian : "+dish.isVegetarian());
		System.out.println("Price of a Dish : "+dish.getPrice());
		
	}

}
