package com.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
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
	
	@FindBy(xpath = "//a[normalize-space()='Components']")
	WebElement Components;

	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']")
	WebElement Monitors;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement Product4;

	@FindBy(xpath = "(//input[@name='option[218]'])[1]")
	WebElement Radiobutton;

	@FindBy(xpath = "//input[@value='10']")
	WebElement Checkbox;
	
	@FindBy(xpath = "//input[@id='input-option208']")
	WebElement Text;

	@FindBy(xpath = "//select[@id='input-option217']")
	WebElement Dropdown;
	
	@FindBy(xpath = "//textarea[@id='input-option209']")
	WebElement Textarea;

	@FindBy(xpath = "//button[@id='button-upload222']")
	WebElement uploadbutton;
	
	@FindBy(xpath = "//input[@name='option[222]']")
	WebElement inputfile;

	@FindBy(xpath = "//input[@id='input-option219']")
	WebElement datepicker;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement addtocart;

	

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
	
	public void addtocartproduct4() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		Components.click();Thread.sleep(500);
		Monitors.click();Thread.sleep(500);
		Product4.click();Thread.sleep(500);
		Radiobutton.click();Thread.sleep(500);
		Checkbox.click();Thread.sleep(500);
		Text.clear();Thread.sleep(500);
		Text.sendKeys("Product4");Thread.sleep(500);
		Dropdown.click();Thread.sleep(500);TestUtil.PressDown();TestUtil.PressEnter();
		Textarea.sendKeys("Monitor");
		
		uploadbutton.click();Thread.sleep(2000);
		Robot rb = new Robot();
		String sp = Commonpath_pdf;
		 StringSelection selection = new StringSelection(sp);
	     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	     clipboard.setContents(selection, null);
	     
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	     rb.keyRelease(KeyEvent.VK_V);
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
/*   
	    JavascriptExecutor js = (JavascriptExecutor) driver;

        // Create a new visible file input element
        js.executeScript(
            "var input = document.createElement('input');" +
            "input.type = 'file';" +
            "input.id = 'customFileInput';" +
            "document.body.appendChild(input);"
        );
        3. Using AutoIT (For Windows Only) 
        Write an AutoIT script (upload.au3)
        ControlFocus("Open","","Edit1")
        ControlSetText("Open","","Edit1","C:\path\to\your\file.pdf")
		ControlClick("Open","","Button1")
	2.Compile the script into an .exe file.
	3.Call the script from Selenium:
		import java.io.IOException;

		Runtime.getRuntime().exec("C:\\path\\to\\upload.exe");
	
        
*/
	     Thread.sleep(5000);
	     
	     
	     TestUtil.alert_handle();Thread.sleep(1000);
	     datepicker.clear();
	     datepicker.sendKeys("2025-02-03");Thread.sleep(1000);
	     addtocart.click();Thread.sleep(1000);
	     Assert.assertTrue(Successfullyaddmessage.isDisplayed());
			System.out.println("Product4 added successfully");
	     
	}

}
