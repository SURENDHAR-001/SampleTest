package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		Actions actions = new Actions(driver);
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("flipkart" + Keys.ENTER);
		Thread.sleep(1000);
		

		// driver.findElement(By.xpath(".//input[@value=\"Google Search\"]")).click();
		// Thread.sleep(2000);

		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.F5);
	}

}
