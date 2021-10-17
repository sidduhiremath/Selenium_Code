package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hower {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Actions mouse=new Actions(d);
//		mouse.moveToElement(d.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"))).build().perform();
		mouse.moveToElement(d.findElement(By.partialLinkText("Account & Lists"))).build().perform();
		

	
		Thread.sleep(2000);
		d.findElement(By.linkText("Your Account")).click();
		Thread.sleep(2000);
		d.close();
	}

}
