package jaya_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jaya_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/rchikati/Downloads/chromedriver");
		driver = new ChromeDriver();
		login(driver);
		cart_Click(driver);

	}
	
	public static void grocery_Click(WebDriver driver) throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class='elc-icon BubbleLink-icon elc-icon-grocery']")).click();
		
	}
	public static void location_Click(WebDriver driver) throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[contains(text(),'Stores')]")).click();
		
	}
	public static void account_Click(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
	
	}
	
	public static void cart_Click(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
	
		
	}
	
	public static void login(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://www.walmart.com/account/login");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("cc12@cc12.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jaya29");
		driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button[1]")).click();
	
	}
		
	
	public static void departments_Click(WebDriver driver) throws InterruptedException{
		
				Thread.sleep(5000);
				driver.findElement(By.id("header-sparkmenu-toggle")).click();
				
		
	}
	

	
	public static void CreateAccount(WebDriver driver)
	{
	driver.get("https://www.walmart.com/account/signup/");
	driver.findElement(By.xpath("//*[@id=\'first-name-su\']")).sendKeys("Jaya");
	driver.findElement(By.xpath("//*[@id=\"last-name-su\"]")).sendKeys("Ch");
	driver.findElement(By.xpath("//*[@id=\'email-su\']")).sendKeys("cc12@cc12.com");
	driver.findElement(By.xpath("//*[@id=\"password-su\"]")).sendKeys("Jaya29");
	driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button[1]")).click();
	}

}
