package seli1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/\r\n");
		Thread.sleep(10000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='nav-main']/div"));
		Actions a = new Actions(driver);
		for(WebElement menus:menu) {
			System.out.println(menus.getText());
			a.moveToElement(menus).build().perform();
			Thread.sleep(2000);				
	}
}
}
