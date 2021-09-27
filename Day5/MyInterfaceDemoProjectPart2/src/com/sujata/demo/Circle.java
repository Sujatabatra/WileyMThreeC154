package com.sujata.demo;

interface Dummy{
	void someDummy();
}
public class Circle extends Input implements RoundedShape,Dummy {

	double area,circumference;
	
	
	public Circle(double radius) {
		super(radius);
//		this.radius = radius;
	}

	@Override
	public void area() {
		area=PI*getValue()*getValue();
	}

	@Override
	public void display() {
		System.out.println(" Area of Circle : "+area);
		System.out.println("Circumference of Circle : "+circumference);
	}

	@Override
	public void circumference() {
		circumference=2*PI*getValue();
		
	}

	@Override
	public int demonstration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void someDummy() {
		// TODO Auto-generated method stub
		
	}

}
