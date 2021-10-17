package Selenium_Training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		Set<String> ids=driver.getWindowHandles();
		String parent=driver.getWindowHandle();
		
		for(String s:ids) {
			if(!(parent.equals(s))) {
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
			
		}
//		driver.switchTo().alert().accept();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		Actions recr=new Actions(driver);
		recr.moveToElement(driver.findElement(By.xpath("//*[text()='Tools']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Career Dashboard']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
