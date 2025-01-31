package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.utilities.*;

public class Registerpage extends TestBase{
	
	String Name = TestUtil.RandomNameGenerator();
	String Mobile = TestUtil.RandomMobileNumberGenerator();
	String Emailaddress = TestUtil.RandomEmailGenerator();

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement Myaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement Register;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement Firstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement Lastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement Telephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Passward;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement Confirmpass;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement Policy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement Successmessage;
	
	@FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
	WebElement Logout;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement Alreadyexist;
	
	
	public Registerpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Registeruser() throws InterruptedException {
		Myaccount.click(); Thread.sleep(500);
		Register.click(); Thread.sleep(500);
		Firstname.sendKeys(Name); Thread.sleep(500);
		Lastname.sendKeys(Name+" rocky"); Thread.sleep(500);
		Email.sendKeys(Emailaddress); Thread.sleep(500);
		Telephone.sendKeys(Mobile); Thread.sleep(500);
		Passward.sendKeys(Name+"@123"); Thread.sleep(500);
		Confirmpass.sendKeys(Name+"@123"); Thread.sleep(500);
		Policy.click(); Thread.sleep(500);
		Continue.click(); Thread.sleep(500);
	}
		
	public void Accountcreatedmessage() {
		Assert.assertEquals(Successmessage.getText(), "Your Account Has Been Created!");
		System.out.println("Your Account Has Been Created!");
		
	}
		
	
	public void Already_register() throws InterruptedException {
		Myaccount.click();
		if(Logout.isDisplayed()) {
			Logout.click();
	        Myaccount.click(); Thread.sleep(500);
			Register.click(); Thread.sleep(500);
			Firstname.sendKeys(Name); Thread.sleep(500);
			Lastname.sendKeys(Name+" rocky"); Thread.sleep(500);
			Email.sendKeys(Emailaddress); Thread.sleep(500);
			Telephone.sendKeys(Mobile); Thread.sleep(500);
			Passward.sendKeys(Name+"@123"); Thread.sleep(500);
			Confirmpass.sendKeys(Name+"@123"); Thread.sleep(500);
			Policy.click(); Thread.sleep(500);
			Continue.click(); Thread.sleep(500);
		}
		Assert.assertEquals(Alreadyexist.getText(), "Warning: E-Mail Address is already registered!");
		System.out.println("Email Adreess already used!");
	}
	
}