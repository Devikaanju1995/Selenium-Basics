package automationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
//@AfterMethod
//public void closebrowser()
//{
//	driver.close();
//}
}
