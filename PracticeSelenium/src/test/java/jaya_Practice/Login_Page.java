package jaya_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver;
		System.setProperty("webdriver.chrome.driver","/Users/rchikati/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());

		/*driver.findElement(By.id("email")).sendKeys("jayasree_g@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Teja_1919");
		driver.findElement(By.id("u_0_3")).click();*/

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jayasree_g@yahoo.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Teja_1919");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();

		
		
		

	}

	
	static void Login_details(WebDriver dr)
	{
	
			
	}
	
}
