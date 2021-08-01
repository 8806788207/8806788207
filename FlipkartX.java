package seli1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartX {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='InyRMC _3Il5oO']/div"));
		Actions a = new Actions(driver);
		for(WebElement menus:menu) {
			System.out.println(menus.getText());
			a.moveToElement(menus).build().perform();
			Thread.sleep(2000);
		}
			
		}	
	}












////div[@id='nav-main']/div