package seli1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBS {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		 	WebDriver driver = new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.get("https://en-gb.Facebook.com/");
		 	Thread.sleep(2000);
		 	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 	Thread.sleep(2000);
		 	WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 	Select s=new Select(day);
		 	s.selectByValue("4");
		 	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 	Select s1=new Select(month);
		 	s1.selectByVisibleText("Oct");
		 	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 	Select s2=new Select(year);
		 	s2.selectByValue("1997");
		 	List<WebElement> months = s1.getOptions();
		 	for (WebElement values : months) {
		 		System.out.println(values.getText());
		 		
				
			}
		 
		 	
		}

	}
//input[@name='firstname']

//input[@name='lastname']
//input[@aria-label='Mobile number or email address']
//input[@type='password'and@autocomplete='new-password']
