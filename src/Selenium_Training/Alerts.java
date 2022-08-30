package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://worldometers.info/world-population/");
		Thread.sleep(3000);
//		d.findElement(By.xpath("//button[text()='Click me!']")).click();
//		Thread.sleep(1000);
//		d.switchTo().alert().accept();
//	   Thread.sleep(2000);
//	   d.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
//		Thread.sleep(1000);
//		d.switchTo().alert().dismiss();
//	   Thread.sleep(2000);
//	   d.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
//		Thread.sleep(1000);
		d.switchTo().alert().sendKeys("I have accepted");
	   Thread.sleep(2000);
	   d.switchTo().alert().accept();
	   Thread.sleep(2000);
//	   d.close();
//		
//		System.out.println("Population is: "+d.findElement(By.xpath("//span[@rel='viet-nam-population']")).getText());
//		d.close();
	}

}
