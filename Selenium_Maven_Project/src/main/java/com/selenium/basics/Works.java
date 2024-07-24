package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Works 
{

public void swaglapsiteloginpage()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	WebElement username_field=driver.findElement(By.id("user-name"));
	username_field.sendKeys("standard_user");
	WebElement pass_field=driver.findElement(By.id("password"));
	pass_field.sendKeys("secret_sauce");
	WebElement login_butn=driver.findElement(By.id("login-button"));
	login_butn.click();
}
	
public void demoworkshoploginpage()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement login_butn=driver.findElement(By.className("ico-login"));
	login_butn.click();
	WebElement email_field=driver.findElement(By.id("Email"));
	email_field.sendKeys("devikasatheee10101@gmail.com");
	WebElement passw_field=driver.findElement(By.id("Password"));
	passw_field.sendKeys("devikas1234");
	
	WebElement remember_field=driver.findElement(By.id("RememberMe"));
	remember_field.click();
	
	
	WebElement log=driver.findElement(By.className("button-1 login-button"));
	log.click();
	
}




public static void main(String[] args) 
	{
	Works obj=new Works();
	//obj.swaglapsiteloginpage();
	obj.demoworkshoploginpage();
	}

}
