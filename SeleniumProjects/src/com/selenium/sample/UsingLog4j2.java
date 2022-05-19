package com.selenium.sample;

import org.slf4j.LoggerFactory;

public class UsingLog4j2 {
	
private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(UsingLog4j2.class);
	
	
	public static void main(String[] args) {
		
		Logger.info("this is info");
		
//		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		log.info(driver.getCurrentUrl());
//		driver.close();

	}


}
