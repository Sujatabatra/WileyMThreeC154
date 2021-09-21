package com.sujata.training;

import com.sujata.demo.Factorial;

/*
 * n: 1!/1+2!/2+3!/3+......+n!/n
 */
public class Series {
	private int totalNoOfTerms;
	private double sum;

	public void setTotalNoOfTerms(int totalNoOfTerms) {
		this.totalNoOfTerms = totalNoOfTerms;
	}

	public double getSum() {
		Factorial factorial=new Factorial();
		for(int n=1;n<=totalNoOfTerms;n++) {
			factorial.setNumber(n);
			sum=sum+factorial.getFactorial()/n;
		}
		return sum;
	}
	
	

}
