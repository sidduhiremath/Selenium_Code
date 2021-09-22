package Selenium_Training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {

	public static void main(String[] args) throws InterruptedException {
		String child="";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		Thread.sleep(2000);
		Set<String> ids=driver.getWindowHandles();
		String parent=driver.getWindowHandle();
//		Iterator<String> it=ids.iterator();
//		String parent=it.next();
//		child=it.next();
		for(String s:ids) {
			if(!(parent.equals(s))) {
				driver.switchTo().window(s);
				driver.close();
			}
			
		}
//		driver.switchTo().window(child);

		
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.quit();

	}

}
