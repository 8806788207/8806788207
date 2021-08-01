package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartX {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//img[@class='kJjFO0 _3DIhEh _9JTfqZ']")).click();

		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone", Keys.ENTER);
		


	}
}