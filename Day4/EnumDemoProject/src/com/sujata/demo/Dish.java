package com.sujata.demo;

public enum Dish {

	PANEER(400,true,560.50),DAL_TADKA(550,true,450),CHICKEN(650,false,860.99),FISH(550,false,990.99),MUSHROOM(480,true,350);
	
	private int calorie;
	private boolean vegetarian;
	private double price;
	
   private Dish(int calorie, boolean vegetarian, double price) {
		this.calorie = calorie;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public int getCalorie() {
		return calorie;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	
	
}

