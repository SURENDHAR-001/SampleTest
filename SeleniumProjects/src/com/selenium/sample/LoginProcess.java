package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginProcess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("chennai pvr thatre ticket booking");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@value=\"Google Search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath(".//button[@id=\"wzrk-cancel\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[@class=\"signin\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[@id=\"wzrk-cancel\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[@class=\"auth-method-title _gplus\"]")).click();
		Thread.sleep(2000);	
	   // driver.findElement(By.xpath(".//input[@name=\"inputTxtUsername\"]")).sendKeys("9600921082");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath(".//div[@id=\"login-loading-state\"]")).click();

}
}