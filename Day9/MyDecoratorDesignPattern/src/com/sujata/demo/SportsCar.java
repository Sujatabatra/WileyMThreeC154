package com.sujata.demo;

public class SportsCar {

	/*
	 * Has-A RelationShip
	 */
	private Car car;

	public SportsCar(Car car) {
		super();
		this.car = car;
	}
	
	public void sportsEngine() {
		System.out.print("Sprots car "+car.getModel()+" ");
		car.engine();
	}
	
	public void engine() {
		car.engine();
	}
}
