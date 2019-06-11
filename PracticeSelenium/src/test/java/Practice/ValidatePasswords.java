package Practice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatePasswords {

	public static WebDriver driver;
	
	public static void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",Util.CHROME_PATH);
		driver = new ChromeDriver();
		driver.get(Util.BASE_URL);
	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Util.WAIT_TIME,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME,TimeUnit.SECONDS);	
		
	}
	
	
	public static void main(String[] args) throws Exception {
	

		String[][] testData = Util.getDataFromExcel(Util.FILE_PATH,
    			Util.SHEET_NAME, Util.TABLE_NAME);
	String username, password;
	String actualTitle;
	String actualBoxtitle;
	
	for (int i = 0; i < testData.length; i++) {
	    username = testData[i][0]; // get username
	    password = testData[i][1]; // get password
	    
	    
	    //Setup Firefox driver
	    setUp();
	    // Enter username
	    driver.findElement(By.name("uid")).clear();
	    driver.findElement(By.name("uid")).sendKeys(username);

	    // Enter Password
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);
	    

	  

	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
       
	
	    try{ 
		    
	       	Alert alt = driver.switchTo().alert();
			actualBoxtitle = alt.getText(); // get content of the Alter Message
			System.out.println(actualBoxtitle);
			alt.accept();
			if (actualBoxtitle.contains(Util.EXPECT_ERROR)) { // Compare Error Text with Expected Error Value
			    System.out.println("Test case SS[" + i + "]: Passed"); 
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
		}    
	    catch (NoAlertPresentException Ex){ 
	    	actualTitle = driver.getTitle();
			// On Successful login compare Actual Page Title with Expected Title
			if (actualTitle.contains(Util.EXPECT_TITLE)) {
			    System.out.println("Test case SS[" + i + "]: Passed");
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
			
        } 
		driver.close();
		
	}

	}
}


