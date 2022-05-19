package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try_catch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		try{
		driver.findElement(By.xpath("//*[@id='register']")).click();
		}catch (Exception e) {
		System.out.println("Register element is not found.");
		throw(e);
		}
		System.out.println("Hello");
		}

	}