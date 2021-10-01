package com.sujata.demo;

public class MyMain {

	public static void main(String[] args) {
		Audi audi1=new Audi("A8", "RED");
		Audi audi2=new Audi("A6", "Blue");
		

		SportsCar audiSportsVersion=new SportsCar(audi1);
		
		audiSportsVersion.sportsEngine();
		audiSportsVersion.engine();
		System.out.println("===============");
		audi2.engine();
	}

}
