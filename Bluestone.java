package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver blue = new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		blue.findElement(By.xpath("//a[@title='Coins']")).click();
		Thread.sleep(2000);
		blue.findElement(By.xpath("//body[@class='white-bg b-new-filter with-white-header no-footer-top    p-auto-play   no-ticker']")).click();
		Thread.sleep(2000);
		

		
	}

}
//a[@title='10 gram 24 kt Gold Coin']
//body[@class='white-bg b-new-filter with-white-header no-footer-top    p-auto-play   no-ticker']