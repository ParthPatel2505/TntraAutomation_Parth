package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import com.utilities.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    
    public static WebDriver driver;
    public static Properties prop;

    // Constructor - Load Properties File
    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + 
                "\\src\\test\\resources\\config\\com.config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file.");
        }
    }

    // Browser Initialization
    public static void initialization() {
        if (prop == null) {
            new TestBase();  // Ensure properties are loaded
        }

        String browserName = prop.getProperty("browser");

        if (browserName == null) {
            throw new RuntimeException("Browser name is not defined in properties file.");
        }

        switch (browserName.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                throw new RuntimeException("Invalid browser name in properties file: " + browserName);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));

        // Open the test URL
        String testUrl = prop.getProperty("testurl");
        if (testUrl != null) {
            driver.get(testUrl);
        } else {
            throw new RuntimeException("Test URL is missing in properties file.");
        }
    }

    // Close Browser
    @AfterClass
    public static void browserclose() {
        if (driver != null) {
            driver.quit();
        }
    }
}
