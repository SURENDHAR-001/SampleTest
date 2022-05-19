package com.selenium.sample;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.LoggerFactory;

public class NewTab {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(Example1.class);

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		
//		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("natural photoes"+Keys.ENTER);
//		Thread.sleep(1000);
//		
		//driver.findElement(By.xpath(".//a[@data-hveid=\"CAIQAw\"]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//a[@class=\"w3-bar-item w3-button bar-item-hover w3-right w3-hide-small barex ws-pink\"]")).click();
		Thread.sleep(1000);
		
		 String parWin = driver.getWindowHandle();
	      
	      Set<String> windows = driver.getWindowHandles();
	      
	      Iterator<String> it = windows.iterator();
	      
	      while(it.hasNext()) {
	          
	          String childWin = it.next();
	          
	          if(!parWin.equals(childWin)) {
	              
	          driver.switchTo().window(childWin);
	          
	          // Verify title of the child window
	          log.info(driver.getTitle());
//	          String expectedTitle = "Create a Free Website With W3Schools Spaces";
//	          
//	          Assert.assertEquals(driver.getTitle(), expectedTitle);
	          driver.switchTo().window(childWin); 
	          Thread.sleep(2000);
	          driver.close();
	          Thread.sleep(1000);
	          
	          }
	          
	      }
	      driver.switchTo().window(parWin); 
	      Thread.sleep(2000);
	      driver.close();

	}
}