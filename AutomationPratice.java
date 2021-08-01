package seli1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPratice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(4000);
	  driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/a text()='T-shirts']")).click();
		Actions a=new Actions(driver);
	//	WebElement prd=driver.findElement(By.xpath("//ul[@class='product_list grid row']/li")).click();

		


		
	}

}
