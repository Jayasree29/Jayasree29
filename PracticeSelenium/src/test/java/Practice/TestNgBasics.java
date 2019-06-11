package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
@BeforeClass
public void LaunchBrowser()
{
	System.out.println("BeforeClass");
	}
	
	
@BeforeMethod
public void enterURL()
{
	System.out.println("this is the before method - enter URL");
	}

@BeforeTest
public void login()
{
	System.out.println("this is the before Test - Login");
	}


@BeforeSuite
public void setup()
{
	System.out.println("this is the before Suite - Setup");
	}


@Test
public void test1()
{
	System.out.println("this is the Test case 1");

	
}
@Test
public void test2()
{
	System.out.println("this is the Test case 2");

	
}

@AfterTest
public void afterTest()
{
	System.out.println("this is the afterTest");

	
}

@AfterSuite
public void afterSuite()
{
	System.out.println("this is the afterSuite");

	
}


@AfterMethod
public void afterMethod()
{
	System.out.println("this is the afterMethod");

	
}
@AfterClass

public void afterClass()
{
	System.out.println("this is the afterClass");

	
}

}




