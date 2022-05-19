import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\surendhar\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.className("lnXdpd"));
		Actions action = new Actions(driver);
		action.contextClick(ele).build().perform();
//		action.keyDown(ele, null)
		
		action.sendKeys(Keys.ARROW_DOWN).build();
		action.sendKeys(Keys.ARROW_DOWN);
		
		action.sendKeys(Keys.CONTROL, "s").build().perform();
		
////		driver.findElement(By.xpath(".//input[@class=\"gLFyf gsfi\"]")).sendKeys("loard krishna images"+Keys.ENTER);
////		Thread.sleep(1000);
////		
////		driver.findElement(By.xpath(".//a[@data-hveid=\"CAEQAw\"]")).click();
////		Thread.sleep(1000);
////		
//		List<WebElement> list = driver.findElements(By.tagName("img"));
//		Thread.sleep(3000);
//		
//		int count = 1;
//		
//		for(WebElement ele : list) {
//			String url = ele.getAttribute("src");
//			System.out.println(url);
//			URL imgurl =new URL(url); 
//			BufferedImage saveImg = ImageIO.read(imgurl);
//			ImageIO.write(saveImg,"jpg",new File(count+".jpg"));
//			count++;
//			
//		}
	}

}