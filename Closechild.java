package seli1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closechild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		String parent = driver.getWindowHandle();
		wins.remove(parent);
		for (String id : wins) {
			driver.switchTo().window(id);
			Thread.sleep(1000);
			// driver.close();
			System.out.println(driver.getPageSource());
			driver.close();

		}

	}
}
