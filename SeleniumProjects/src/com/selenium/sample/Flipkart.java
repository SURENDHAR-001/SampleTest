package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("flipkart login");
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//input[@value=\"Google Search\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath(".//a[@class=\"_14Me7y\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//a[@class=\"_2KpZ6l _2HKlqd _3NgS1a\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9600921082");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("Sure@2010");
		Thread.sleep(1000);


	}

}
