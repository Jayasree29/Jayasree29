package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		String str = new String();
		
		System.setProperty("webdriver.gecko.driver","/Users/rchikati/Downloads/geckodriver");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.google.com");
		str = dr.getTitle();
		//WebElement e = dr.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		WebElement e = dr.findElement(By.name("q"));
		e.sendKeys("Jaya");
		System.out.println(str);
		dr.quit();
		
		
		
		
		

	}

}
