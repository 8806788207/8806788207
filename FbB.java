package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbB {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000);
	
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByValue("9");
	
   WebElement mon = driver.findElement(By.id("Month"));
	Select s1 = new Select(mon);
	
	s1.selectByVisibleText("Sep");
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("1997"); 

	//select[@aria-label='Month']
	


	
	
}
}
//a[@role='button'and @id='u_0_2_eX']