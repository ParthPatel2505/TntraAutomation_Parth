package com.pageobjects;

import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.utilities.TestUtil;

public class Addtocart extends TestBase {
	public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");

	@FindBy(xpath = "//a[normalize-space()='MP3 Players']")
	WebElement Mp3layer;

	@FindBy(xpath = "//a[normalize-space()='Show AllMP3 Players']")
	WebElement Showall;

	@FindBy(xpath = "(//button[@type='button'])[18]")
	WebElement Product1;

	@FindBy(xpath = "(//button[@type='button'])[15]")
	WebElement Product2;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement Successfullyaddmessage;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement Cartbutton;

	@FindBy(xpath = "///p[@class='text-center']")
	WebElement emptyelement;

	@FindBy(xpath = "//button[@title='Remove']")
	WebElement itemsadded;
	
	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	WebElement Desktop;

	@FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
	WebElement Showall2;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	WebElement Product3;

	@FindBy(xpath = "//input[@id='input-option225']")
	WebElement Datepicker;

	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement addtocartproduct3;

	

	public Addtocart() {
		PageFactory.initElements(driver, this);
	}

	public void addtocartproduct1() throws InterruptedException {

		Thread.sleep(2000);
		Mp3layer.click();;Thread.sleep(1000);
		Showall.click();Thread.sleep(1000);
		TestUtil.scroll_bottom();Thread.sleep(1000);
		Product1.click();Thread.sleep(1000);
		Assert.assertTrue(Successfullyaddmessage.isDisplayed());
		System.out.println("Product1 added successfully");
		
		Product2.click();Thread.sleep(1000);
		Assert.assertTrue(Successfullyaddmessage.isDisplayed());
		System.out.println("Product2 added successfully");
	}

	public void addtocartproduct2() throws InterruptedException {
		Thread.sleep(1000);
		Desktop.click();;Thread.sleep(1000);
		Showall2.click();Thread.sleep(1000);
		TestUtil.scroll_bottom();Thread.sleep(1000);
		Product3.click();Thread.sleep(1000);
		Datepicker.clear();
		Datepicker.sendKeys("2025-01-31");Thread.sleep(1000);
		
		addtocartproduct3.click();
		Assert.assertTrue(Successfullyaddmessage.isDisplayed());
		System.out.println("Product3 added successfully");
	}

}
