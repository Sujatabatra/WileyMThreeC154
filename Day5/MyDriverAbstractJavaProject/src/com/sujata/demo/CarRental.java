package com.sujata.demo;

public class CarRental {

	public static void main(String[] args) {
		Car car1=new Audi();
		car1.setColor("Red");
		car1.setModel("A8");
		
		Car car2=new BMW();
		car2.setColor("Blue");
		car2.setModel("Q5");
		
		Car car3=new Toyota();
		car3.setColor("Golden");
		car3.setModel("Altis");
		
		Car car4=new Suzuki();
		car4.setColor("White");
		car4.setModel("WagonR");
		
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		Driver suresh=new Driver("Suresh");
		
		
		sonu.setCar(car4);
		sonu.drive();
		
		Car volvo=new Volvo();
		volvo.setColor("Grey");
		volvo.setModel("VX");
		
		monu.setCar(volvo);
		monu.drive();
		

	}

}
