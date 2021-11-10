package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculator {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
//		WebDriver d=new ChromeDriver();
//		d.get("https://www.mortgagecalculator.org/");
//		d.manage().window().maximize();
//		d.findElement(By.id("homeval")).sendKeys("2000");
//		Thread.sleep(2000);
//		d.findElement(By.id("downpayment")).sendKeys("3000");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//input[@value='percent']")).click();
//
//		if(d.findElement(By.xpath("//input[@value='percent']")).isSelected()) {
//			System.out.println("Selected");
//		}
//		else {
//			System.out.println("Not Selected");
//		}
//		
//		Select month= new Select(d.findElement(By.name("param[start_month]")));
//		Thread.sleep(3000);
//		month.selectByIndex(4);
//		Thread.sleep(1000);
//		month.selectByValue("12");
//		Thread.sleep(1000);
//		month.selectByVisibleText("Jan");
//		
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//input[@tabindex='10']")).click();
//		Thread.sleep(3000);
		
		// Google Search
//		d.get("http://www.google.com/");
//		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//input[@class='gNO89b']")).click();
//       Thread.sleep(2000);
//       String value=d.findElement(By.xpath("//input[@class='gLFyf gsfi']")).getAttribute("Value");
//       if(value.equalsIgnoreCase("Selenium")) {
//    	   System.out.println("Valid..");
//       }
//       else {
//    	   {
//        	   System.out.println("InValid..");
//           }
//       }
		
		
		// Amezon.in
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Select option= new Select(d.findElement(By.id("searchDropdownBox")));
		Thread.sleep(3000);
		option.selectByVisibleText("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung zfold3");
		Thread.sleep(3000);
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/span")).click();
		if(d.findElement(By.xpath("//*[@id=\"p_n_availability/1318485031\"]/span/a/span")).isEnabled()) {
			System.out.println("Selected");
			}
		else {
			System.out.println("Not selected");
		}
		Thread.sleep(2000);
		String count= d.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		if(count.contains("fold3")) {
			System.out.println("Testcase is Passed  for searched data");
		}
		else {
			System.out.println("Fail");
		}
		
		String title=d.getTitle();
		if(title.contains("fold3")) {
		System.out.println("Testcase is Passed for Title");
		}
		else {
		System.out.println("Fail");
		}
		Thread.sleep(3000);
		d.close();
	
		System.out.println("End of TestCase");
		

	}

}
