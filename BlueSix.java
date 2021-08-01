package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueSix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(20000);
		//to enter text in search textfield
		  driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings");
		  //to search 
		  driver.findElement(By.xpath("//input[@name='submit_search']")).click();
        driver.close();
		
		
		
	}

}
//input[@class='form-text typeahead']