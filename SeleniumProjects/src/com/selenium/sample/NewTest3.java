package com.selenium.sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest3 {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	  
	 // Actions a=new Actions(driver);
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("flipkart login"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9600921082");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("Sure@2010");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(1000);
	  
  }
  
  @Test 
  public void loginNeg() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	 
		//Actions a=new Actions(driver);
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("flipkart login"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("96009210838");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("Sure@2011");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(1000);
		
	}
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Starting Test On Chrome Browser");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Closing the browser session");
	  
      driver.close();
	  
      driver.close();
  }

}  