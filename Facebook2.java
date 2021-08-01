package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//WebElement search =driver.findElement(By.name("email"));
		//search.sendKeys("vishnu");
		driver.findElement(By.xpath(null)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='2']"));
		WebElement male = driver.findElement(By.xpath(null));
		male.click();
		Thread.sleep(2000);
		System.out.println(male.isSelected());
	}
	

}
//WebElement search =driver.findElement(By.name("email"));
//search.sendKeys("vishnu");


//