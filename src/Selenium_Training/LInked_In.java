package Selenium_Training;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LInked_In {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the web-browser you want to execute...");
		String browser= sc.next();
		
if(browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.linkedin.com/login");
	d.findElement(By.id("username")).sendKeys("siddalingayya@gmail.com");
	d.findElement(By.id("password")).sendKeys("Sidd@8546");
	d.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	String message=d.findElement(By.xpath("//*[@id=\"error-for-password\"]")).getText();
System.out.println("Error message:" +message);
	Thread.sleep(4000);
	d.findElement(By.linkText("Forgot password?")).click();
	Thread.sleep(4000);
	d.findElement(By.partialLinkText("Sign")).click();
	Thread.sleep(4000);
	d.close();

}

else if(browser.equalsIgnoreCase("Edge")) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\edgedriver_win64\\msedgedriver.exe");	
	WebDriver d=new EdgeDriver();
	d.get("https://www.linkedin.com/login");
	d.findElement(By.id("username")).sendKeys("siddalingayya@gmail.com");
	d.findElement(By.id("password")).sendKeys("Sidd@8546");
	d.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	String message=d.findElement(By.xpath("//*[@id=\"error-for-password\"]")).getText();
System.out.println("Error message:" +message);
	Thread.sleep(4000);
	d.findElement(By.linkText("Forgot password?")).click();
	Thread.sleep(4000);
	d.findElement(By.partialLinkText("Sign")).click();
	Thread.sleep(4000);
	d.close();
}

else {
	System.out.println("Invalid Browser");
}
sc.close();
	}

}
