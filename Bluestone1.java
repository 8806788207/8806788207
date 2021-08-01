package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement aa=driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions a= new Actions(driver);
		a.moveToElement(aa).build().perform();
		Thread.sleep(1000);
driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();

		
	}

}
