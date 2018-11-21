import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Parameters()
public class baseclass {
static	WebDriver driver;
@BeforeSuite
public static void launchbrowser()
{
	//if(driver.equals(firefox))
//	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gomat\\eclipse-workspace\\VYMO_TESTING\\src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

//	}
	
}
@BeforeMethod
public static void login() throws IOException
{
	driver.get("https://staging.lms.getvymo.com/#/login");

}
@AfterTest
public static void logout()
{
	
}
@AfterSuite
public static void closebrowser()
{
	driver.quit();
}
}
