package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUsing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();  
		  
	        // Launch Website  
	driver.navigate().to("https://www.facebook.com/");  
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//input[@type=\"text\"]")).sendKeys("surendhar.u192010@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("Sure@2010");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//button[@name=\"login\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//input[@id=\"email\"]")).sendKeys("Surendhar.u182010@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//input[@id=\"pass\"]")).sendKeys("Sure@2010");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//div[@class=\"_9lsa\"]")).click();
	Thread.sleep(2000);

	}

}