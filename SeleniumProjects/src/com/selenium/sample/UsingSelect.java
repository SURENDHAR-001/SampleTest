package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 

public class UsingSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://community.tableau.com/s/question/0D54T00000C5ujbSAB/month-filter-slider-show-names-of-months");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		WebElement a= driver.findElement(By.xpath(".//button[@aria-current=\"false\"]"));
		Thread.sleep(1000);
		
		Actions b=new Actions(driver);
		
//		 b.moveToElement(a); 
		 b.click(a);b.sendKeys(Keys.ARROW_DOWN);Thread.sleep(2000);b.sendKeys(Keys.ARROW_DOWN);Thread.sleep(2000);
		 
//		 Select c=new Select(a);//		 
//		 
//		c.selectByVisibleText("Community Updates");                   
//		 
		

	}

}
