package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputFields {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",Util.CHROME_PATH);
		driver = new ChromeDriver();
		driver.get(Util.BASE_URL);
	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Util.WAIT_TIME,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME,TimeUnit.SECONDS);
		
		driver.findElement(By.name("uid")).sendKeys("mngr156505");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("btnLogin")).click();
		
		String str = driver.getTitle();	
		System.out.println(str);
		if (str.equals(Util.EXPECT_TITLE))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
			
		}
			
			driver.quit();	
	}
}