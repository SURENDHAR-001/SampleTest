package com.selenium.sample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingUsingJunit {
	
	WebDriver driver;
	
		@Before
	    public void prepare() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			//driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("accounts login"+Keys.ENTER);
			//Thread.sleep(1000);
			//driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
			//Thread.sleep(1000);
			}
		@Test
		public void loginPositive() throws InterruptedException {
			//driver.findElement(By.xpath(".//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("surendhar.u182010@gmail.com");
			//Thread.sleep(1000);
			/*driver.findElement(By.xpath(".//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-dgl2Hf ksBjEc lKxP2d qfvgSe FliLIb uRo0Xe TrZEUc t29vte\"]")).click();
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//span[@class=\"VfPpkd-StrnGf-rymPhb-b9t22c\"]")).click();
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("Surendhar");
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//input[@name=\"lastName\"]")).sendKeys("Baskar");
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//input[@name=\"Username\"]")).sendKeys("surebaskar.u182010");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//input[@name=\"Passwd\"]")).sendKeys("Sure@2010");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//input[@name=\"ConfirmPasswd\"]")).sendKeys("Sure@2010");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//input[@class=\"VfPpkd-muHVFf-bMcfAe\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//span[@class=\"VfPpkd-vQzf8d\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//input[@name=\"Username\"]")).sendKeys("surebaskar.u182010@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//span[@class=\"VfPpkd-vQzf8d\"]")).click();
			Thread.sleep(2000);*/
			
			driver.findElement(By.xpath(".//a[@class=\"gb_d\"]")).click();
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//a[@data-action=\"sign in\"]")).click();
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//input[@name=\"identifier\"]")).sendKeys("Surendhar.u192010");
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//span[@class=\"VfPpkd-vQzf8d\"]")).click();
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//input[@name=\"password\"]")).sendKeys("Sure@2010");
			Thread.sleep(2000); 
			driver.findElement(By.xpath(".//VfPpkd-muHVFf-bMcfAe\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//span[@class=\"VfPpkd-vQzf8d\"]")).click();
			Thread.sleep(2000);
			
			
		}
		
}