package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartImgSave {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		
		//driver.getWindowHandle();
		
		//driver.getWindowHandles();
		
		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("flipkart"+Keys.ENTER);
		Thread.sleep(1000);

		//driver.findElement(By.xpath(".//input[@value=\"Google Search\"]")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//input[@class=\"_3704LK\"]")).sendKeys("men shirt"+Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath(".//img[@class=\"_2r_T1I\"]"));
		Thread.sleep(5000);
		actions.moveToElement(btn).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
		
//		Thread.sleep(10000);
//		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
//		Actions keydown= actions.keyDown(Keys.DOWN);
//		Thread.sleep(10000);
//		keydown.perform();
		//actions.sendKeys(Keys.DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
	    //sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		//Thread.sleep(1000);
		
        //WebElement btn1 = driver.findElement(By.xpath(".//img[@class=\"_2r_T1I _396QI4\"]"));
		
		//actions.contextClick(btn1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
	    //sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		//driver.close();*/
		
			

	}

}
