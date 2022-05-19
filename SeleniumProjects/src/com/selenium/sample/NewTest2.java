package com.selenium.sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	        String url = "https://www.google.com";
	  
	        driver.get(url);
	  
	        //Capturing the title and validating if expected is equal to actual
	  
	        String expectedTitle = "Google";
	  
	        String actualTitle = driver.getTitle();
	  
	        Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Starting the browser session");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Closing the browser session");
	  
	        driver.quit();
	  
  }

}