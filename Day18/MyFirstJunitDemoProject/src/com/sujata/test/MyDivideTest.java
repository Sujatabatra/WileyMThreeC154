package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sujata.demo.MyDivide;
import com.sujata.exception.NegativeNoNotAllowedException;

public class MyDivideTest {

	private MyDivide myDivide;
	
	@Before
	public void setUp() throws Exception {
		myDivide=new MyDivide();
	}

	@After
	public void tearDown() throws Exception {
		myDivide=null;
	}

	@Test
	public void t001() {
		assertEquals(2, myDivide.divide(10, 5));
	}
	
	@Test(expected = NegativeNoNotAllowedException.class)
	public void t002() {
		myDivide.divide(-10,5);
	}
	
	@Test(expected = NegativeNoNotAllowedException.class)
	public void t003() {
		myDivide.divide(10,-5);
	}
	
	@Test(expected = NegativeNoNotAllowedException.class)
	public void t004() {
		myDivide.divide(-7,-2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void t005() {
		myDivide.divide(20,0);
	}
	
	@Test
	public void t006() {
		assertEquals(0, myDivide.divide(0,20));
	}

}
