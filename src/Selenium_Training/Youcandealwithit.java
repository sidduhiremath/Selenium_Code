package Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youcandealwithit {

	public static void main(String[] args) throws InterruptedException {
		int a=0,b=0;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		d.manage().window().maximize();
		String food="1000",Clothing="2000",shelter="500";
		d.findElement(By.id("food")).sendKeys(food);
		Thread.sleep(2000);
		d.findElement(By.id("clothing")).sendKeys(Clothing);
		Thread.sleep(2000);
		d.findElement(By.id("shelter")).sendKeys(shelter);
		Thread.sleep(2000);
		String totalMonthlyExpenses= d.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String totalMonthlyIncome= d.findElement(By.id("totalMonthlyIncome")).getText();
//		d.navigate().back();
		System.out.println(totalMonthlyExpenses);
		try {
		 a=Integer.valueOf(totalMonthlyExpenses);
		 b=Integer.valueOf(totalMonthlyIncome);
		 System.out.println(a);
		}
		catch(Exception e){
		}
		if(a>b) {
			System.out.println("Expense is High..");
		}
		else {
			System.out.println("Income is High..");
			}
		 Thread.sleep(3000);
		 d.close();
		}

}
