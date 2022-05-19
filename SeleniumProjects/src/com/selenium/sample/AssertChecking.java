package com.selenium.sample;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertChecking {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		
	    driver.get("https://www.ksrtc.in/oprs-web/");
		 
		//Verify Title of the Site
	    String actual_Title = driver.getTitle();
		String expected_Title ="KSRTC Official Website for Online Bus Ticket Booking - KSRTC.in";
		
		boolean b=expected_Title.equalsIgnoreCase(actual_Title);
		Assert.assertEquals(expected_Title, actual_Title);
		assertEquals(expected_Title, actual_Title);
		
		assertTrue(b);
		//System.out.println(actual_Title);
		
	
		
	}
}