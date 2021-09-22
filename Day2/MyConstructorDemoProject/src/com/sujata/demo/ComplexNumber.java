package com.sujata.demo;

public class ComplexNumber {

	private int real,imag;

	//Constructor Overloading
	private ComplexNumber(){
		real=0;
		imag=0;
	}
	
	public ComplexNumber(int r,int i){
		real=r;
		imag=i;
	}
	ComplexNumber(int r){
		real=r;
		imag=3;
	}
	
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void display() {
		System.out.print(real);
		if(imag>0) {
			System.out.println("+"+imag+"i");
		}
		else if(imag<0) {
			System.out.println(imag+"i");
		}
	}
	
	public ComplexNumber sumComplex(ComplexNumber c2) {
		ComplexNumber c=new ComplexNumber();
		c.real=real+c2.real;
		c.imag=imag+c2.imag;
		return c;
	}
}
