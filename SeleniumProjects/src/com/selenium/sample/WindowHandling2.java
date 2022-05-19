package com.selenium.sample;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {

	  @Test
      public void testWindowHandle() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.w3schools.com/css/css_tooltip.asp");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//span[@class='ribbon-topnav ws-hide-1066']")).click();
      Thread.sleep(2000);
      
      String parentWin = driver.getWindowHandle();
      
      Set<String> windows = driver.getWindowHandles();
      
      Iterator<String> it = windows.iterator();
      
      while(it.hasNext()) {
          
          String childWin = it.next();
          
          if(!parentWin.equals(childWin)) {
              
          driver.switchTo().window(childWin);
          
          // Verify title of the child window
          System.out.println(driver.getTitle());
          String expectedTitle = "Create a Free Website With W3Schools Spaces";
          
          Assert.assertEquals(driver.getTitle(), expectedTitle);
          
          Thread.sleep(2000);
          
          driver.quit();
          
          }
          
      }
      
	}

}