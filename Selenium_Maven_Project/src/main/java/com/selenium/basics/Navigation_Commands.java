package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Navigation_Commands 
{
public void chromenavigation()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.selenium.dev/about/");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    driver.navigate().to("https://www.seleniumeasy.com/");
    driver.close();

}

public void firefoxnavigation()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/about/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("https://en.wikipedia.org/wiki/Kerala");
}
public void edgenavigation()
{
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wikipedia.org/wiki/Kerala");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("https://en.wikipedia.org/wiki/India");
	
	
}

	public static void main(String[] args) 
	{
		Navigation_Commands obj=new Navigation_Commands();
		obj.chromenavigation();
		obj.firefoxnavigation();
		obj.edgenavigation();
        

	}

}
