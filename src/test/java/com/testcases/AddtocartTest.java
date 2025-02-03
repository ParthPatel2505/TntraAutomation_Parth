package com.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageobjects.*;

public class AddtocartTest extends TestBase {

	Addtocart addtocart;

	public AddtocartTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setup() {
		super.initialization();
		addtocart = new Addtocart();
	}
	
	@Test(priority = 1)
	public void verify_addtocart_product1() throws InterruptedException {
				
		addtocart.addtocartproduct1();
	}
	
	@Test(priority = 2)
	public void verify_addtocart_product2() throws InterruptedException {
		
		addtocart.addtocartproduct2();
	}
	
	@Test(priority = 3)
	public void verify_addtocart_product4() throws InterruptedException, AWTException {
		
		addtocart.addtocartproduct4();
	}
	
	
}
