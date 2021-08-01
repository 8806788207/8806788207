package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Coins']")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("GOLDCOINS", Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Coins']")).click();
	
}

}

//a[@title='Coins']
