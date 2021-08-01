package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sofa", Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Weston Half Leather Sofa (Licorice Italian Leather)']")).click();
		driver.findElement(By.xpath("//a[@class='button']")).click();
		driver.findElement(By.xpath("//button[@name='button']")).click();




	}

}
