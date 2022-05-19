package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop01 {
	public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	Actions a = new Actions(driver);
	WebElement from = driver.findElement(By.className("site-links rpool_title"));
	 
	WebElement to = driver.findElement(By.className("site-links rpool_title"));	 
	//Perform drag and drop
	a.dragAndDrop(from, to).perform();
	
	//verify text changed in to 'Drop here' box 
	String textTo = to.getText();

	if(textTo.equals("Dropped!")) {
		System.out.println("PASS: Source is dropped to target as expected");
	}else {
		System.out.println("FAIL: Source couldn't be dropped to target as expected");
	}
	Thread.sleep(2000);

	driver.close();
}

}