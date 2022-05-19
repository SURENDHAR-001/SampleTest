package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("kumbakonam vasu theatre ticket booking"+Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath(".//input[@value=\"Google Search\"]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[@class=\"liA0y _1gV1c\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//li[@data-seat=\"0\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[@class=\"_3zXcJ _1TzhK _1wVQ_\"]")).click();
		Thread.sleep(7000);
		driver.close();
	}
}