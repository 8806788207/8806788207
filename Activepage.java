package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activepage {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		WebElement admin  =driver.findElement(By.id("username"));
		admin.sendKeys("vishnu");
		
		WebElement password =driver.findElement(By.name("pwd"));
		password.sendKeys("vishnu123");
		
		WebElement login  =driver.findElement(By.id("loginButton"));
		login.click();
		Thread.sleep(2000);
		
		
	}

}
