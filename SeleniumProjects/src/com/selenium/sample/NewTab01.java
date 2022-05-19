package com.selenium.sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;

public class NewTab01 {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(Example1.class);

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//a[@aria-expanded=\"false\"]")).click();
		Thread.sleep(2000);
		
		String a=driver.getWindowHandle();
		
		Set<String> b=driver.getWindowHandles();
		
		Iterator<String>c=b.iterator();
		
		while (c.hasNext()) {
			
			Thread.sleep(2000);
			
			String child=c.next();
			
			if(!a.equals(child)) {
				Thread.sleep(1000);
				log.info(driver.getTitle());
				driver.switchTo().window(child);
				
				driver.close();
				
			}
			
			
		}
		Thread.sleep(2000);
		driver.switchTo().window(a);
       driver.close();
	}

}