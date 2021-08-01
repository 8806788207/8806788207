package seli1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google22 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   // to load the website
	   driver.get("https://www.google.com/?gws_rd=ssl");
	   Thread.sleep(2000);
	   
	   //to enter text in search box
	   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java");
	   Thread.sleep(2000);
	   
	   // to get list of all the WebElements
	  java.util.List<WebElement> ele = driver.findElements(By.xpath("//div[@class='aajZCb']"));
	   
	  for(WebElement e:ele) {
	  // to get Webelement name into console
	    System.out.println(e.getText());
	    Thread.sleep(5000);
	   
	    // to click on 3rd suggestion
	    driver.findElement(By.xpath("//b[text()='script']")).click();
	   }
	   
	    

	}

	
}


