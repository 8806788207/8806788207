package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getloc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(20000);
		WebElement Search = driver.findElement(By.name("q"));
		System.out.println(Search.isDisplayed());
		System.out.println(Search.isEnabled());
		System.out.println(Search.getAttribute("id"));
		Point Loc = Search.getLocation();
		System.out.println(Loc.getX()+" "+Loc.getY());
			
	}

}
