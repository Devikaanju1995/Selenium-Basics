package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Program
{
public void swaglab()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	WebElement user_na=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	user_na.sendKeys("standard_user");
	
	WebElement pssw_fld=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	pssw_fld.sendKeys("secret_sauce");
	
	WebElement log_field=driver.findElement(By.xpath("//input[@id='login-button']"));
	log_field.click();
}
	


public static void main(String[] args) 
	{
	Xpath_Program obj=new Xpath_Program();
	obj.swaglab();

	}

}
