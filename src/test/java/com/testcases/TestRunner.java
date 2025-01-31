package com.testcases;

import org.testng.TestNG;

public class TestRunner {

	static TestNG testNg;
	public static void main(String[] args) {
		
		
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {RegisterAccountTest.class, LoginpageTest.class, AddtocartTest.class, CheckoutprocessTest.class});
		testNg.run();
	}

}
