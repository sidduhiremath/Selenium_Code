package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_And_Links {
public static void main(String a[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://www.google.com");
	Thread.sleep(3000);
	int buttons=d.findElements(By.xpath("//input[@type='submit']")).size();
	System.out.println("Number of buttons: "+buttons);
	int links=d.findElements(By.tagName("a")).size();
	System.out.println("Number of Links: "+links);
	
	for(int i=0;i<links;i++) {
		String mainlink=d.findElements(By.tagName("a")).get(i).getText();
		System.out.println("Link is : "+mainlink);
		if(mainlink.contains("Gmail")) {
			System.out.println("Opended Link is: "+mainlink);
			d.findElements(By.tagName("a")).get(i).click();
		}
	}
	
	Thread.sleep(2000);
	d.close();
	
}
}
