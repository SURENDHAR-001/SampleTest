package com.selenium.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.co.in/");
	        

	        Actions a=new Actions(driver);
	        driver.findElement(null);
	        a.sendKeys(Keys.F5);
	        Thread.sleep(2000);
	        
	        driver.switchTo().window(null);
	        
	        // Open new window by clicking the button
	         //driver.findElement(By.id("windowButton")).click();
             //Thread.sleep(2000);
//	         // Click on the new window element and read the text displayed on the window
//	         WebElement text = driver.findElement(By.id("sampleHeading"));
//	   
//	         // Fetching the text using method and printing it     
//	         System.out.println("Element found using text: " + text.getText());
	         driver.close();

	}

}