package seli1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotjava {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java",Keys.ENTER);
		
		WebElement java = driver.findElement(By.xpath("//span[text()='java']"));
		
		   Actions a= new Actions(driver);
		   
		   a.doubleClick(java).perform();
			Thread.sleep(2000);
			
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_CONTROL);
			
			r.keyPress(KeyEvent.VK_C);
			Thread.sleep(2000);

			r.keyRelease(KeyEvent.VK_CONTROL);
			
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);


		
			
			

		   

		
				
		
		
		
	}

}
