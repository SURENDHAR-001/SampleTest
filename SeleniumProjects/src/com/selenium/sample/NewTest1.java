package com.selenium.sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	WebDriver driver;

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");

		System.out.println("Launching Google Chrome browser");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
//	      String testTitle = "Free QA Automation Tools For Everyone";
//	      String originalTitle = driver.getTitle();
//	      Assert.assertEquals(originalTitle, testTitle);
//		 

		driver.findElement(By.xpath(".//input[@id=\"dest\"]")).sendKeys("Mayiladuthurai");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Starting Test On Chrome Browser");

	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		// driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}

}