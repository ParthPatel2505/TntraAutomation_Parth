package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;

public class Checkoutprocess extends TestBase{
	
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement Cartbutton;
	
	@FindBy(xpath = "///p[@class='text-center']")
	WebElement emptyelement;

	@FindBy(xpath = "//table[@class='table table-striped']")
	WebElement itemsadded;

	@FindBy(xpath = "//strong[normalize-space()='View Cart']")
	WebElement Viewcart;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement Checkoutbutton;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Passward;

	@FindBy(xpath = "//input[@id='button-login']")
	WebElement Loginbutton;
	
	@FindBy(xpath = "//input[@id='button-payment-address']")
	WebElement Continue1;

	@FindBy(xpath = "//input[@id='button-shipping-address']")
	WebElement Continue2;
	
	@FindBy(xpath = "//input[@id='button-shipping-method']")
	WebElement Continue3;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement Conditions;
	
	@FindBy(xpath = "//input[@id='button-payment-method']")
	WebElement Continue4;
	
	@FindBy(xpath = "//input[@id='button-confirm']")
	WebElement Confirmorder;
	
	@FindBy(xpath = "//h1[normalize-space()='Your order has been placed!']")
	WebElement Confirmationmessage;
	
	
	
	
	
	public Checkoutprocess() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutprocess() throws InterruptedException {
		
		Thread.sleep(2000);
		Cartbutton.click();
			Viewcart.click();
			Checkoutbutton.click();
			Email.sendKeys(prop.getProperty("Emailadress"));
			Passward.sendKeys(prop.getProperty("Pass"));
			Loginbutton.click();
			Continue1.click();
			Continue2.click();
			Continue3.click();
			Conditions.click();
			Continue4.click();
			Confirmorder.click();
			Assert.assertEquals(Confirmationmessage.getText(), "Your order has been placed!");
			System.out.println("Your order has been placed!");
				
	}
	
	
}
