package com.sujata.demo;

interface Demo{
	int demonstration();
}
public interface RoundedShape extends Shape,Demo {
	
	double PI=3.142;
	void circumference() ;

}
