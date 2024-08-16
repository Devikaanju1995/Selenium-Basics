package automationCore;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
public WebDriver driver;
public void initialisebrowser(String browsername)
{
	if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
		
	}
	else if(browsername.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		throw new RuntimeException("invalid browser recived");
		
	}
	driver.manage().window().maximize();
}
@BeforeMethod
public void browserlaunch()
{
	initialisebrowser("chrome");  //this.method but this is inbuild
}
@AfterMethod
public void closebrowser(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		takescreenshot(result); //this.method
	}
	driver.close();
}
public void takescreenshot(ITestResult result) throws IOException
{
	TakesScreenshot takesscreenshot=(TakesScreenshot) driver;
	File screenshot=takesscreenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot,new File("./Screenshot/" +result.getName()+".png"));
}
}
