package com.selenium.sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindwoHandle1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/browser-windows");
		    Thread.sleep(2000);

		    // Opening all the child window
		    driver.findElement(By.id("windowButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("messageWindowButton")).click();
		    Thread.sleep(2000);
		    
		    String MainWindow = driver.getWindowHandle();
		    System.out.println("Main window handle is " + MainWindow);

		    // To handle all new opened window
		    Set<String> s1 = driver.getWindowHandles();
		    System.out.println("Child window handle is" + s1);
		    Iterator<String> i1 = s1.iterator();

		    // Here we will check if child window has other child windows and when child window
		    //is the main window it will come out of loop.
		      while (i1.hasNext()) {
		          String ChildWindow = i1.next();
		          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
		              driver.switchTo().window(ChildWindow);
		              driver.close();
		              System.out.println("Child window closed");
		           }
		       }

	}

}