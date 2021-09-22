package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkedIn_Login_logout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.linkedin.com/login");
		d.findElement(By.id("username")).sendKeys("siddalingayya7785@gmail.com");
		d.findElement(By.id("password")).sendKeys("Sidd@8546");
		d.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"ember33\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
		Thread.sleep(2000);
		//d.findElement(By.xpath("//*[text()='Sign out']")).click();
		d.close();	
	}

}
