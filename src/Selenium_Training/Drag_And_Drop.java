package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		Actions drag=new Actions(d);
		//Switch to subframe
		d.switchTo().frame(0);
		Thread.sleep(2000);

		drag.dragAndDrop(d.findElement(By.id("draggable")), d.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(2000);
		//Swith to main frame(Default frame)
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		System.out.println(d.findElement(By.className("entry-title")).getText());
		d.close();
	}

}
