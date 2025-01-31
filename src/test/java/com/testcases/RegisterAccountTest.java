package com.testcases;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.TestBase;

import com.pageobjects.*;

public class RegisterAccountTest extends TestBase{
	
	Registerpage registerpage;

	public RegisterAccountTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setup() {
		super.initialization();
		registerpage = new Registerpage();
	}	
	@Test(priority = 1)
	public void Verify_Registration() throws InterruptedException 
	{
		registerpage.Registeruser();
		registerpage.Accountcreatedmessage();
	}
	
	@Test(priority = 2)
	public void Verify_DuplicateEmailaddress() throws InterruptedException 
	{
		registerpage.Already_register();
	}
				 
	
	
	}

