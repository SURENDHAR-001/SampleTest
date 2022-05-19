package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("google account login");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@value=\"Google Search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(2000);


	}
	/*driver.findElement(By.xpath(".//button[@class=\"M6CB1c rr4y5c\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//a[@class=\"gb_1 gb_2 gb_9d gb_9c\"]")).click();
	Thread.sleep(2000);*/

}