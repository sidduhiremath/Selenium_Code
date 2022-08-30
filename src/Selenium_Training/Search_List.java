package Selenium_Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_List {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
	Thread.sleep(2000);
	List<WebElement> data=driver.findElements(By.xpath("//span[contains(text(), 'testing')]"));
	System.out.println(data.size());
	for (int i=0;i<=data.size();i++) {
		System.out.println(data.get(i).getText());
		if(data.get(i).getText().equals("testing tools")) {
			Thread.sleep(2000);
			data.get(i).click();
			Thread.sleep(2000);
		}
	}
	}

}
