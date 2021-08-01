package seli1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://jqueryui.com/draggable/");
		   Thread.sleep(10000);
		   
		   //we have to switch the tab in this website(i.e. from website to drop box)
		   WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		   
		   // we are switching into the DragAndDrop frame
		   driver.switchTo().frame(frame);
		   Thread.sleep(2000);
		   
		   //we are passing the id of WebElement on which we have to take actions
		   WebElement ele = driver.findElement(By.id("draggable"));
		   Actions a= new Actions(driver);
		   
		   // here we are taking dragAndDropBy action on the WebElement by passing VaraibleName,x-axis,y-axis
		   a.dragAndDropBy(ele, 250, 10).perform();
		   
		   

		}

		
		
	}


