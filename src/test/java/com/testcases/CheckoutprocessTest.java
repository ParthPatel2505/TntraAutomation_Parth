package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageobjects.*;

public class CheckoutprocessTest extends TestBase{

	Checkoutprocess checkoutprocess;
	Addtocart addtocart;

	public CheckoutprocessTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setup() {
		super.initialization();
		checkoutprocess = new Checkoutprocess();
		addtocart = new Addtocart();
	}
	
	@Test(priority = 0)
	public void verify_CheckoutProcess() throws InterruptedException {
				
		addtocart.addtocartproduct2();
		checkoutprocess.checkoutprocess();
	}
	
}
