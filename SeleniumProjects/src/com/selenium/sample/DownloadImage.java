package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadImage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("loard krishna images"+Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//a[@data-hveid=\"CAEQAw\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//img[@class=\"rg_i Q4LuWd\"]")).click();
		
		WebElement a = driver.findElement(By.xpath(".//img[@class=\"n3VNCb\"]"));
		
		actions.contextClick(a);
		
		//Select se = new Select(driver.findElement(By.xpath(".//img[@class=\"n3VNCb\"]")));
		//se.selectByIndex(6);
		Thread.sleep(5000);
		//actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
	    //sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		
        Thread.sleep(5000);
	}

}
