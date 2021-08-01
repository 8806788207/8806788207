package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestonex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("rings", Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();



	}

}//img[@class='hc img-responsive center-block']
//input[@id='buy-now']