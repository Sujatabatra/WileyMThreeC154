package com.sujata.demo;

public class ComplexNumber {

	private int real,imag;

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
}
