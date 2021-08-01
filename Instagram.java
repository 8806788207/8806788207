package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.name("username"));
		search.sendKeys("vishnu");
		
		WebElement search1 =driver.findElement(By.name("passward"));
		search1.sendKeys("vishnu@123");
		 WebElement login = driver.findElement(By.name("login"));
		login.click();
	
	}

}
